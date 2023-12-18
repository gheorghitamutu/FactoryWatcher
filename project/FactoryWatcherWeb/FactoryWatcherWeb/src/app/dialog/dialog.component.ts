import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from "@angular/forms";
import {ApiService} from "../services/api.service";
import {MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog'

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit {
  genderValues = ["Male", "Female", "Other"]
  personForm !: FormGroup;

  actionBtn: string = "Save";

  updatedValue: string = "";

  constructor(private formBuilder: FormBuilder, private api: ApiService,
              @Inject(MAT_DIALOG_DATA) public editData: any,
              private dialogRef: MatDialogRef<DialogComponent>,
  ) {
  }

  ngOnInit(): void {
    this.personForm = this.formBuilder.group({
      surname: ['', Validators.required],
      last_name: ['', Validators.required],
      gender: ['', Validators.required],
      date_of_birth: ['', Validators.required]
    })

    if (this.editData) {
      this.actionBtn = "Update";
      this.personForm.controls['surname'].setValue(this.editData.surname);
      this.personForm.controls['last_name'].setValue(this.editData.last_name);
      this.personForm.controls['gender'].setValue(this.editData.gender);
      this.updatedValue = this.editData.date_of_birth;
      this.personForm.controls['date_of_birth'].setValue(this.editData.date_of_birth);
    }
  }

  addPerson() {
    if (!this.editData) {

      if (this.personForm.valid) {
        this.api.postPerson(this.personForm.value)
          .subscribe({
            next: (res) => {
              alert("Person added successfully");
              this.personForm.reset();
              this.dialogRef.close('save');
            },
            error: () => {
              alert("Error while adding the person")
            }
          })
      }
      return;
    }
    this.updatePerson();
  }

  updatePerson() {
    this.api.putPerson(this.personForm.value, this.editData.id)
      .subscribe({
        next: (res) => {
          alert("Person updated successfully");
          this.personForm.reset();
          this.dialogRef.close("update");

        },
        error: () => {
          alert("Error while updating the person");
        }
      })
  }
}


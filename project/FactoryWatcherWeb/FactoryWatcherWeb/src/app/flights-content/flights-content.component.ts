import {Component, Inject, OnInit, ViewChild} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ApiService} from "../services/api.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {MatTableDataSource} from "@angular/material/table";
import {FlightService} from "../services/flight.service";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";

@Component({
  selector: 'app-flights-content',
  templateUrl: './flights-content.component.html',
  styleUrls: ['./flights-content.component.css']
})
export class FlightsContentComponent implements OnInit {
  flightsForm !: FormGroup;

  displayedColumns: string[] = ['departure', 'departure_scheduled_time', 'arrival', 'arrival_scheduled_time', 'company_name'];

  routeTypes: string[] = ['arrival', 'departure'];
  dataSource!: MatTableDataSource<any>;

  newsData: any[] = [];

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;

  constructor(private formBuilder: FormBuilder, private api: FlightService) {}

  ngOnInit(): void {
    this.flightsForm = this.formBuilder.group({
      date: ['', Validators.required],
      type: ['', Validators.required],
      iata_code: ['', Validators.required],
    })
  }

  getFlightsByFilters() {
    this.api.getFlightsByFilters(this.flightsForm.value)
      .subscribe({
        next: (res) => {
          this.dataSource = new MatTableDataSource<any>(res);
          console.log(this.dataSource);
          this.dataSource.paginator = this.paginator;
          this.dataSource.sort = this.sort;

          this.getNewsAboutDataSource();
        },
        error: (err) => {
          alert("Error while fetching the Records");
        }
      })
  }

  updateNewsData(res: any) {
    res.response.docs.forEach((elem: any) => {
      this.newsData.push(elem);
    })
    console.log(this.newsData);
  }

  getNewsAboutDataSource() {
    this.newsData = [];
    this.dataSource.filteredData.forEach(element => {
        if (element.airline.name !== '') {
          this.api.getNewsAbout(element.airline.name)
            .subscribe({
              next: (res) => {
                this.updateNewsData(res);
              },
              error: (err) => {
                console.log("Error while fetching news");
              }
            })
        }
      }
    )
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }
}

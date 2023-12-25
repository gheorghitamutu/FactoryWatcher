import {Component, OnInit, ViewChild} from '@angular/core';
import {MatTableDataSource} from "@angular/material/table";
import {MatPaginator} from "@angular/material/paginator";
import {MatSort} from "@angular/material/sort";
import {MatDialog} from "@angular/material/dialog";
import {ApiService} from "../services/api.service";
import {DialogComponent} from "../dialog/dialog.component";

import { Chart, registerables} from 'chart.js';

Chart.register(...registerables);

@Component({
  selector: 'app-main-content',
  templateUrl: './main-content.component.html',
  styleUrls: ['./main-content.component.css']
})


export class MainContentComponent implements OnInit{
  title = 'clients_manager_front';
  displayedColumns: string[] = ['id', 'sensorId', 'temperature', 'humidity', 'pressure', 'timestamp', 'extraInfo'];
  dataSource!: MatTableDataSource<any>;

  newsData: any[] = [];

  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  constructor(private dialog: MatDialog, private api: ApiService) {
  }

  ngOnInit() {
    this.getAllProducts();
  }

  openDialog() {
    this.dialog.open(DialogComponent, {
      width: '50%'
    }).afterClosed().subscribe(val => {
      if (val === 'save') {
        this.getAllProducts();
      }
    });
  }

  editPerson(row: any) {
    this.dialog.open(DialogComponent, {
      width: '30%',
      data: row
    }).afterClosed().subscribe(val => {
      if (val === 'update') {
        this.getAllProducts();
      }
    });
  }

  deletePerson(id: number) {
    this.api.deletePerson(id)
      .subscribe({
        next: (res) => {
          alert("Delete successfully");
          this.getAllProducts();
        },
        error: (err) => {
          alert("Something went wrong");
        }
      })
  }
  // updateDates(res: any) {
  //   for (let resIndex=0; resIndex < res.length; resIndex++) {
  //     let date_comps = res[resIndex].date_of_birth.split('/');
  //     let newDate = date_comps[1] + "/" + date_comps[0] + "/" + date_comps[2];
  //     res[resIndex].date_of_birth = newDate;
  //   }
  // }

  getAllProducts() {
    this.api.getPersons()
      .subscribe({
        next: (res) => {
          // console.log(res);
          // this.updateDates(res);
          this.dataSource = new MatTableDataSource<any>(res);
          this.dataSource.paginator = this.paginator;
          this.dataSource.sort = this.sort;
          
          const values: number[] = [];

          const intervalsCount = new Map<number, number>();

          for (const measure of res) {
            console.log(measure);
            let value = Math.round(measure["temperature"] / 10) * 10
            if (intervalsCount.has(value)) {
              // Number is already in the map, increase the count
              const currentCount = intervalsCount.get(value) || 0;
              intervalsCount.set(value, currentCount + 1);
            } else {
              // Number is not in the map, create a new entry with count 1
              intervalsCount.set(value, 1);
            }
          }
          const sortedEntries = [...intervalsCount.entries()].sort((a, b) => a[0] - b[0]);

          console.log(sortedEntries);

          // console.log(intervalsCount);
          // console.log(intervalsCount.keys());
          new Chart("myChart", {
            type: 'bar',
            data: {
              labels: sortedEntries.map(e => e[0]),
              datasets: [{
                label: 'Temperature distribution',
                data: sortedEntries.map(e => e[1]),
                borderWidth: 1
              }]
            },
            options: {
              scales: {
                y: {
                  beginAtZero: true
                }
              }
            }
          });
        },
        error: (err) => {
          alert("Error while fetching the Records");
        }
      })
    this.getNewsByPersons();
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();

    if (this.dataSource.paginator) {
      this.dataSource.paginator.firstPage();
    }
  }

  setNewsData(res: any) {
    this.newsData = res;
  }

  getNewsByPersons() {
    this.newsData = [];
    this.api.getNewsByPersons()
      .subscribe({
        next: (res) => {
          this.setNewsData(res);
        },
        error: (err) => {

        }
      })
  }
}

import {Component, OnInit} from '@angular/core';
import {MainContentComponent} from "../main-content/main-content.component";
import {FlightsContentComponent} from "../flights-content/flights-content.component";

@Component({
  selector: 'app-sidenav',
  templateUrl: './sidenav.component.html',
  styleUrls: ['./sidenav.component.css']
})
export class SidenavComponent implements  OnInit{
  dummyComponent = Object();
  constructor() {

  }

  ngOnInit() {
    this.dummyComponent = MainContentComponent;
  }

  assignComponent(component: string) {
    if (component === 'flights') {
      this.dummyComponent = FlightsContentComponent;
    } else if (component === 'persons') {
      this.dummyComponent = MainContentComponent;
    }
  }
}

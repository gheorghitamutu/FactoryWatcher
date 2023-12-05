import { Component, OnInit } from '@angular/core';
import { Chart, registerables} from 'chart.js';

Chart.register(...registerables);

@Component({
  selector: 'app-chart',
  templateUrl: './custom-chart.component.html',
  styleUrls: ['./custom-chart.component.css']
})
export class CustomChartComponent implements OnInit {

  ngOnInit() {
    
  }
}
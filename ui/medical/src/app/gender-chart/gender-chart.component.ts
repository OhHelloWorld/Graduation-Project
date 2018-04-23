import { Component, OnInit,Input } from '@angular/core';
import * as Chart from 'chart.js';

@Component({
  selector: 'app-gender-chart',
  templateUrl: './gender-chart.component.html',
  styleUrls: ['./gender-chart.component.css']
})
export class GenderChartComponent implements OnInit {
  
  canvas:any;
  ctx:any;
  chart:any;

  chartConfiguration:any;
  chartOptions:any;

  @Input()
  genderDatas:any;
  constructor() { }

  ngOnInit() {

    this.chartOptions = {
        responsive: false,
        display:true
    }
    this.chartConfiguration = {
      type: 'pie',
      data: {
          labels: ['男','女'],
          datasets: [{
              label: '男女比例',
              data: this.genderDatas,
              backgroundColor: [
                  'rgba(255, 99, 132, 1)',
                  'rgba(54, 162, 235, 1)'
              ],
              borderWidth: 1
          }]
      },
      options:chartOptions 
    }

    this.canvas = document.getElementById('gender');
  	this.ctx = this.canvas.getContext('2d');
  	this.chart = new Chart(this.ctx, this.chartConfiguration);

  }

}

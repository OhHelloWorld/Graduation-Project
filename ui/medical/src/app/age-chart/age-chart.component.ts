import { Component, OnInit,Input } from '@angular/core';
import * as Chart from 'chart.js';


@Component({
  selector: 'app-age-chart',
  templateUrl: './age-chart.component.html',
  styleUrls: ['./age-chart.component.css']
})
export class AgeChartComponent implements OnInit {
  
  canvas:any;
  ctx:any;
  chart:any;

  chartConfiguration:any;
  chartOptions:any;
  @Input()
  ageDatas:any;

  constructor() { }

  ngOnInit() {
    this.chartOptions = {
        responsive: false,
        display:true
    }
    this.chartConfiguration = {
      type: 'bar',
      data: {
          labels: ["0-10岁", "11-20岁", "21-30岁","31-40岁","41-50岁","51-60岁","60岁以上"],
          datasets: [{
              label: '人数',
              data:this.ageDatas,
              backgroundColor: [
                  'rgba(255, 99, 132, 1)',
                  'rgba(54, 162, 235, 1)',
                  'rgba(100, 206, 86, 1)',
                  'rgba(90, 206, 86, 1)',
                  'rgba(255, 20, 86, 1)',
                  'rgba(150, 50, 40, 1)',
                  'rgba(50, 30, 200, 1)',
              ],
              borderWidth: 1
          }]
      },
      options: this.chartOptions
    }

  	this.canvas = document.getElementById('age');
    this.ctx = this.canvas.getContext('2d');
  	this.chart = new Chart(this.ctx, this.chartConfiguration);

  }

}

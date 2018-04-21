import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-gender-chart',
  templateUrl: './gender-chart.component.html',
  styleUrls: ['./gender-chart.component.css']
})
export class GenderChartComponent implements OnInit {
  
  ctx:any;
  chart:any;

  @Input()
  genderDatas:any;
  constructor() { }

  ngOnInit() {
  	this.ctx = document.getElementById('gender').getContext('2d');
  	this.chart = new Chart(this.ctx, {
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
      options: {
        responsive: false,
        display:true
      }
    });

  }

}

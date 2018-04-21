import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpHeaders,HttpParams } from '@angular/common/http';
import * as Chart from 'chart.js';

@Component({
  selector: 'app-my-case',
  templateUrl: './my-case.component.html',
  styleUrls: ['./my-case.component.css']
})
export class MyCaseComponent implements OnInit {

  myCases:any[];
  //数据总量
  public dataNums:number;
  public currentPage:number = 1;
  public dataNumsInPage:number = 24;

  canvas: any;
  ctx: any;

  constructor(private http:HttpClient) {}

  ngOnInit() {
    this.getMyCaseCount();
  }

  pageMyCase(){
    this.http.get<any>('/api/person/mine/page',
      {
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('page',''+this.currentPage)
      }).subscribe(data => {
        this.myCases = data;
      });
  }

  getMyCaseCount(){
    this.http.get<any>('api/person/mine/count',{
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }).subscribe(data => {
        this.dataNums = data;
      })
  }

  currentPageHandle(page:number){
    this.currentPage = page;
    this.pageMyCase();
  }

}

import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-disease-case',
  templateUrl: './disease-case.component.html',
  styleUrls: ['./disease-case.component.css']
})
export class DiseaseCaseComponent implements OnInit{

  public cases:any[];
  //数据总量
  public dataNums:number;
  public currentPage:number = 1;
  public dataNumsInPage:number = 24;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.countCase();
  }

  countCase(){
    this.http.get<any>('/api/person/count').subscribe(data =>{
      this.dataNums = data;
    })
  }

  pageCase(){
    this.http.get<any>('/api/person/page',{
      params:new HttpParams().set('page',''+this.currentPage)
    }).subscribe(data => {
      this.cases = data;
    })  
  }

  currentPageHandle(page:number){
    this.currentPage = page;
    this.pageCase();
  }

}

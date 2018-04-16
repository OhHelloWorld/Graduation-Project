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

  gender:string;
  age:string;
  catagory:string;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.gender = '不限';
    this.age = '不限';
    this.countCase();
  }

  countCase(){
    this.http.get<any>('/api/person/count',{
      params:new HttpParams().append('gender',this.gender).append('age',this.age),
    }).subscribe(data =>{
      this.dataNums = data;
    })
  }

  pageCase(){
    this.http.get<any>('/api/person/page',{
      params:new HttpParams().append('page',''+this.currentPage).append('gender',this.gender).append('age',this.age),
    }).subscribe(data => {
      this.cases = data;
    })
  }

  currentPageHandle(page:number){
    this.currentPage = page;
    this.pageCase();
  }

  selectGender1(){
    this.gender = '不限';
  }
  selectGender2(){
    this.gender = '男';
  }
  selectGender3(){
    this.gender = '女';
  }

  selectAge1(){
    this.age = '不限';
  }
  selectAge2(){
   this.age = '0-10'; 
  }
  selectAge3(){
    this.age = '11-20';
  }
  selectAge4(){
    this.age = '21-60';
  }
  selectAge5(){
    this.age = '60-100';
  }

  submit(){

    this.countCase();
    this.pageCase();
  }



}

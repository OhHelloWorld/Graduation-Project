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

  name:string;

  selectedValue:string;
  isAge:boolean;
  isGender:boolean;

  ageChartDatas:any;
  genderChartDatas:any;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.gender = '不限';
    this.age = '不限';
    this.name = '';
    this.countCase();

    this.selectedValue='default';
    this.isAge = false;
    this.isGender = false;
    this.getAgeChartData();
    this.getGenderChartData();
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

  search(){
    this.http.get<any>('/api/person/search',{
      params:new HttpParams().set('name',this.name)
    }).subscribe(data =>{
      this.cases = data;
    });
  }

  openChart(){
    $('#chart').modal();
  }

  select(){
    if(this.selectedValue == 'age'){
      this.isAge = true;
      this.isGender = false;
    }else if(this.selectedValue == 'gender'){
      this.isAge =false;
      this.isGender = true;
    }else{
      this.isAge = false;
      this.isGender = false;
    }
  }

  getAgeChartData(){
    this.http.get<any>('/api/person/ageChart').subscribe(
      data => {
        this.ageChartDatas = data;
      }
    );
  }

  getGenderChartData(){
    this.http.get<any>('/api/person/genderChart').subscribe(data =>{
      this.genderChartDatas = data;
    });
  }





}

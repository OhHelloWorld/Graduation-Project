import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-ml-disease',
  templateUrl: './ml-disease.component.html',
  styleUrls: ['./ml-disease.component.css']
})
export class MlDiseaseComponent implements OnInit {

  flag:boolean;

  mlDiseaseHistory:{
    personId:number,
    other:string,
    one:string,
    tour:string
  };

  one1:boolean;
  one2:boolean;
  one3:boolean;
  one4:boolean;
  one5:boolean;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlDiseaseHistory = {
      personId:sessionStorage['personId'],
      other:undefined,
      one:'',
      tour:undefined
    };
    this.flag = false;
    this.getMlDisease();
  }

  submit(){
    this.mlDiseaseHistory.one = '';
    if(this.one1){
      this.mlDiseaseHistory.one += '饮酒&';
    }
    if(this.one2){
      this.mlDiseaseHistory.one += '吸烟&';
    }
    if(this.one3){
      this.mlDiseaseHistory.one += '过敏&';
    }
    if(this.one4){
      this.mlDiseaseHistory.one += '感染&';
    }
    if(this.one5){
      this.mlDiseaseHistory.one += '手术';
    }

    if(!this.flag){
      this.http.post('/api/mlDisease',this.mlDiseaseHistory).subscribe();
    }else{
      this.http.post('/api/mlDisease/update',this.mlDiseaseHistory).subscribe();
    }
  }

  getMlDisease(){
    this.http.get<any>('/api/mlDisease',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlDiseaseHistory = data;
        this.mlDiseaseHistory.personId = sessionStorage['personId'];
        this.displayOne(this.mlDiseaseHistory.one);
      }
    });
  }

  displayOne(one:string){
    if(one.indexOf('饮酒')!=-1){
      this.one1 = true;
    }
    if(one.indexOf('吸烟')!=-1){
      this.one2 = true;
    }
    if(one.indexOf('过敏')!=-1){
      this.one3 = true;
    }
    if(one.indexOf('感染')!=-1){
      this.one4 = true;
    }
    if(one.indexOf('手术')!=-1){
      this.one5 = true;
    }
  }

}

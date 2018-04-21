import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-ml-blood',
  templateUrl: './ml-blood.component.html',
  styleUrls: ['./ml-blood.component.css']
})
export class MlBloodComponent implements OnInit {

  flag:boolean;

  mlBlood:{
    personId:number,
    wbc:string,
    hb:string,
    thc:string,
    plt:string,
    n:string,
    e:string
  }

  information:string;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlBlood = {
      personId:sessionStorage['personId'],
      wbc:undefined,
      hb:undefined,
      thc:undefined,
      plt:undefined,
      n:undefined,
      e:undefined
    };

    this.flag = false;
    this.information = '血常规数据保存成功';
    this.getMlBlood();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/mlBlood',this.mlBlood).subscribe();
    }else{
      this.http.post('/api/mlBlood/update',this.mlBlood).subscribe();
    }
    $('#info').modal();
  }

  getMlBlood(){
    this.http.get<any>('/api/mlBlood',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlBlood = data;
        this.mlBlood.personId = sessionStorage['personId'];
      }
    });
  }

}

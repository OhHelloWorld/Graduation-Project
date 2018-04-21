import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-ml-exam',
  templateUrl: './ml-exam.component.html',
  styleUrls: ['./ml-exam.component.css']
})
export class MlExamComponent implements OnInit {

  flag:boolean;

  mlBiochemical:{
    personId:number,
    alt:string,
    ast:string,
    ggt:string,
    alp:string,
    acid:string,
    tbil:string,
    dbil:string,
    tp:string,
    alb:string,
    scr:string,
    un:string,
    fbg:string,
    pt:string,
    inr:string,
    afp:string,
  }

  information:string;

  constructor(private http:HttpClient) { }

  ngOnInit() {

    this.mlBiochemical = {
      personId:sessionStorage['personId'],
      alt:undefined,
      ast:undefined,
      ggt:undefined,
      alp:undefined,
      acid:undefined,
      tbil:undefined,
      dbil:undefined,
      tp:undefined,
      alb:undefined,
      scr:undefined,
      un:undefined,
      fbg:undefined,
      pt:undefined,
      inr:undefined,
      afp:undefined,
    };

    this.flag = false;
    this.information = '生化检查数据保存成功';
    this.getMlBiochemical();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/mlBiochemical',this.mlBiochemical).subscribe();
    }else{
      this.http.post('/api/mlBiochemical/update',this.mlBiochemical).subscribe();
    }
    $('#info').modal();
  }

  getMlBiochemical(){
    this.http.get<any>('/api/mlBiochemical',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlBiochemical = data;
        this.mlBiochemical.personId = sessionStorage['personId'];
      }
    });
  }

}

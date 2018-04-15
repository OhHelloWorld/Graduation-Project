import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ml-exam',
  templateUrl: './ml-exam.component.html',
  styleUrls: ['./ml-exam.component.css']
})
export class MlExamComponent implements OnInit {

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
  }

  submit(){
    this.http.post('/api/mlBiochemical',this.mlBiochemical).subscribe();
  }

}

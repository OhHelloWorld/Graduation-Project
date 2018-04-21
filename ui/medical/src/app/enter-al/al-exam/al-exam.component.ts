import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-al-exam',
  templateUrl: './al-exam.component.html',
  styleUrls: ['./al-exam.component.css']
})
export class AlExamComponent implements OnInit {

  //肝功能
  alPcInsLiver:{
  	personId:number,
  	albumin:string,
  	globulin:string,
  	alt:string,
  	ast:string,
  	ggt:string,
  	alp:string,
  }

  //肾功能
  alPcInsKidney:{
  	personId:number,
  	bun:string,
  	cr:string,
  }

  //凝血
  alPcInsCoagulation:{
  	personId:number,
  	pt:string,
  	inr:string,
  }

  //血常规
  alPcInsBlood:{
  	personId:number,
  	rbc:string,
  	hb:string,
  	wbc:string,
  	neutrophil:string,
  	lymphocyte:string,
  }

  //乙肝
  alPcInsHepatitisB:{
  	personId:number,
  	hbsAg:string,
  	hbsAb:string,
  	hbeAg:string,
  	hbeAb:string,
  	hbcAb:string,
  	hbvRna:string,
  }

  flag1:boolean;
  flag2:boolean;
  flag3:boolean;
  flag4:boolean;
  flag5:boolean;

  information:string;

  constructor(private http:HttpClient) { }

  ngOnInit() {

  	this.alPcInsLiver = {
	  personId:sessionStorage['personId'],
	  albumin:undefined,
	  globulin:undefined,
	  alt:undefined,
	  ast:undefined,
	  ggt:undefined,
	  alp:undefined,
  	};
  	this.alPcInsKidney = {
  	  personId:sessionStorage['personId'],
	  bun:undefined,
	  cr:undefined, 
  	};
  	this.alPcInsCoagulation = {
  	  personId:sessionStorage['personId'],
  	  pt:undefined,
  	  inr:undefined,
  	};
  	this.alPcInsBlood = {
  	  personId:sessionStorage['personId'],
      rbc:undefined,
      hb:undefined,
      wbc:undefined,
      neutrophil:undefined,
      lymphocyte:undefined,
  	};
  	this.alPcInsHepatitisB = {
      personId:sessionStorage['personId'],
      hbsAg:undefined,
      hbsAb:undefined,
      hbeAg:undefined,
      hbeAb:undefined,
      hbcAb:undefined,
      hbvRna:undefined,    
    };

    this.flag1 = false;
    this.flag2 = false;
    this.flag3 = false;
    this.flag4 = false;
    this.flag5 = false;

    this.information = '保存成功';

    this.getAlPcInsLiver();
    this.getAlPcInsKidney();
    this.getAlPcInsCoa();
    this.getAlPcInsBlood();
    this.getAlInsHb();
    
  }

  submit1(){
    if(!this.flag1){
  	  this.http.post('/api/alPcIns/liver',this.alPcInsLiver).subscribe();
    }else{
      this.http.post('/api/alPcIns/liver/update',this.alPcInsLiver).subscribe();
    }
    $('#info').modal();
  }

  submit2(){
    if(!this.flag2){
  	  this.http.post('/api/alPcIns/kidney',this.alPcInsKidney).subscribe();
    }else{
      this.http.post('/api/alPcIns/kidney/update',this.alPcInsKidney).subscribe();
    }
    $('#info').modal();
  }

  submit3(){
    if(!this.flag3){
  	  this.http.post('/api/alPcIns/coa',this.alPcInsCoagulation).subscribe();
    }else{
      this.http.post('/api/alPcIns/coa/update',this.alPcInsCoagulation).subscribe();
    }
    $('#info').modal();
  }

  submit4(){
    if(!this.flag4){
  	  this.http.post('/api/alPcIns/blood',this.alPcInsBlood).subscribe();
    }else{
      this.http.post('/api/alPcIns/blood/update',this.alPcInsBlood).subscribe();
    }
    $('#info').modal();
  }

  submit5(){
    if(!this.flag5){
  	  this.http.post('/api/alPcIns/hb',this.alPcInsHepatitisB).subscribe();
    }else{
      this.http.post('/api/alPcIns/hb/update',this.alPcInsHepatitisB).subscribe();
    }
    $('#info').modal();
  }


  //alPcInsLiver
  getAlPcInsLiver(){
    this.http.get<any>('/api/alPcIns/liver',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.alPcInsLiver = data;
        this.flag1 = true;
        this.alPcInsLiver.personId = sessionStorage['personId'];
      }
    });
  }

  //alPcInsKidney
  getAlPcInsKidney(){
    this.http.get<any>('/api/alPcIns/kidney',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.alPcInsKidney = data;
        this.flag2 = true;
        this.alPcInsKidney.personId = sessionStorage['personId'];
      }
    });
  }

  //alPcInsCoa
  getAlPcInsCoa(){
    this.http.get<any>('/api/alPcIns/coa',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag3 = true;
        this.alPcInsCoagulation = data;
        this.alPcInsCoagulation.personId = sessionStorage['personId'];
      }
    })
  }

  //alPcInsBlood
  getAlPcInsBlood(){
    this.http.get<any>('/api/alPcIns/blood',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag4 = true;
        this.alPcInsBlood = data;
        this.alPcInsBlood.personId = sessionStorage['personId'];
      }
    });
  }

  //alPcInsHb
  getAlInsHb(){
    this.http.get<any>('/api/alPcIns/hb',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag5 = true;
        this.alPcInsHepatitisB = data;
        this.alPcInsHepatitisB.personId = sessionStorage['personId'];
      }
    });
  }

}

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

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
    
  }

  submit1(){
  	this.http.post('/api/alPcIns/liver',this.alPcInsLiver).subscribe();
  }

  submit2(){
  	this.http.post('/api/alPcIns/kidney',this.alPcInsKidney).subscribe();
  }

  submit3(){
  	this.http.post('/api/alPcIns/coa',this.alPcInsCoagulation).subscribe();
  }

  submit4(){
  	this.http.post('/api/alPcIns/blood',this.alPcInsBlood).subscribe();
  }

  submit5(){
  	this.http.post('/api/alPcIns/hb',this.alPcInsHepatitisB).subscribe();
  }

}

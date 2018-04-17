import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';


@Component({
  selector: 'app-al-aih',
  templateUrl: './al-aih.component.html',
  styleUrls: ['./al-aih.component.css']
})
export class AlAihComponent implements OnInit {

  flag:boolean;

  alAih:{
    personId:number,
    anasma1:string,
    anasma2:string,
    antiLkm:string,
    antiSla:string,
    igg:string,
    liverHistology:string,
    excludeViralHepatitis:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {

    this.alAih = {
      personId:sessionStorage['personId'],
      anasma1:undefined,
      anasma2:undefined,
      antiLkm:undefined,
      antiSla:undefined,
      igg:undefined,
      liverHistology:undefined,
      excludeViralHepatitis:undefined
    };

    this.flag = false;

    this.getAlAih();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/alAih',this.alAih).subscribe();
    }else{
      this.http.post('/api/alAih/update',this.alAih).subscribe();
    }
  }

  getAlAih(){
    this.http.get<any>('/api/alAih',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.alAih = data;
        this.alAih.personId = sessionStorage['personId'];
        this.flag = true;
      }
    });
  }

}

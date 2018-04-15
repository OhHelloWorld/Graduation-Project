import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-al-aih',
  templateUrl: './al-aih.component.html',
  styleUrls: ['./al-aih.component.css']
})
export class AlAihComponent implements OnInit {

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
  }

  submit(){
    this.http.post('/api/alAih',this.alAih).subscribe();
  }
}

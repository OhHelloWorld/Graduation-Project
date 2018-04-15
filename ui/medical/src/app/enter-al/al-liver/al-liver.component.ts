import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-al-liver',
  templateUrl: './al-liver.component.html',
  styleUrls: ['./al-liver.component.css']
})
export class AlLiverComponent implements OnInit {

  alLiver:{
    personId:number,
    li:string,
    ih:string,
    pi1:string,
    pi2:string,
    rc:string,
    hbsAg:string,
    hbcAg:string,
    hcv:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.alLiver = {
      personId:sessionStorage['personId'],
      li:undefined,
      ih:undefined,
      pi1:undefined,
      pi2:undefined,
      rc:undefined,
      hbsAg:undefined,
      hbcAg:undefined,
      hcv:undefined
    };
  }

  submit(){
    this.http.post('/api/alLiver',this.alLiver).subscribe();
  }

}

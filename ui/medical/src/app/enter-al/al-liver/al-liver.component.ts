import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-al-liver',
  templateUrl: './al-liver.component.html',
  styleUrls: ['./al-liver.component.css']
})
export class AlLiverComponent implements OnInit {

  flag:boolean;

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

  information:string;

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

    this.flag = false;
    this.information = '肝脏病理学检查数据保存成功';
    this.getAlLiver();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/alLiver',this.alLiver).subscribe();
    }else{
      this.http.post('/api/alLiver/update',this.alLiver).subscribe();
    }
    $('#info').modal();
  }

  getAlLiver(){
    this.http.get<any>('/api/alLiver',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.alLiver = data;
        this.alLiver.personId = sessionStorage['personId'];
      }
    });
  }

}

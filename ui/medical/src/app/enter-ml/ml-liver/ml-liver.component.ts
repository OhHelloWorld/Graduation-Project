import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-ml-liver',
  templateUrl: './ml-liver.component.html',
  styleUrls: ['./ml-liver.component.css']
})
export class MlLiverComponent implements OnInit {

  flag:boolean;

  mlLiver:{
    personId:number,
    option1:string,
    option2:string,
    option3:string,
    option4:string,
    option5:string,
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlLiver = {
      personId:sessionStorage['personId'],
      option1:undefined,
      option2:undefined,
      option3:undefined,
      option4:undefined,
      option5:undefined,
    };

    this.flag = false;

    this.getMlLiver();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/mlLiver',this.mlLiver).subscribe();
    }else{
      this.http.post('/api/mlLiver/update',this.mlLiver).subscribe();
    }
  }

  getMlLiver(){
    this.http.get<any>('/api/mlLiver',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlLiver = data;
        this.mlLiver.personId = sessionStorage['personId'];
      }
    });
  }

}

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ml-liver',
  templateUrl: './ml-liver.component.html',
  styleUrls: ['./ml-liver.component.css']
})
export class MlLiverComponent implements OnInit {

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
  }

  submit(){
    this.http.post('/api/mlLiver',this.mlLiver).subscribe();
  }

}

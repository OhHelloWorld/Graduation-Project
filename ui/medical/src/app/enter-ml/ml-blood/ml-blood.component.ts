import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ml-blood',
  templateUrl: './ml-blood.component.html',
  styleUrls: ['./ml-blood.component.css']
})
export class MlBloodComponent implements OnInit {

  mlBlood:{
    personId:number,
    wbc:string,
    hb:string,
    thc:string,
    plt:string,
    n:string,
    e:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlBlood = {
      personId:sessionStorage['personId'],
      wbc:undefined,
      hb:undefined,
      thc:undefined,
      plt:undefined,
      n:undefined,
      e:undefined
    };
  }

  submit(){
    this.http.post('/api/mlBlood',this.mlBlood).subscribe();
  }

}

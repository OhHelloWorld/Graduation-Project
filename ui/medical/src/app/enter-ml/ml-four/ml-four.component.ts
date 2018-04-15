import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http'; 

@Component({
  selector: 'app-ml-four',
  templateUrl: './ml-four.component.html',
  styleUrls: ['./ml-four.component.css']
})
export class MlFourComponent implements OnInit {

  mlFour:{
    personId:number,
    fatigue:string,
    itch:string,
    dry:string,
    vague:string,
    depress:string,
    angry:string,
    insomnia:string,
    wake:string,
    tinnitus:string,
    thirst:string,
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlFour = {
      personId:sessionStorage['personId'],
      fatigue:undefined,
      itch:undefined,
      dry:undefined,
      vague:undefined,
      depress:undefined,
      angry:undefined,
      insomnia:undefined,
      wake:undefined,
      tinnitus:undefined,
      thirst:undefined
    };
  }

  submit(){
    this.http.post('/api/mlFour',this.mlFour).subscribe();
  }

}

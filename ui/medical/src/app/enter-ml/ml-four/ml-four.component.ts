import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http'; 

@Component({
  selector: 'app-ml-four',
  templateUrl: './ml-four.component.html',
  styleUrls: ['./ml-four.component.css']
})
export class MlFourComponent implements OnInit {

  flag:boolean;

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
    this.flag = false;
    this.getMlFour();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/mlFour',this.mlFour).subscribe();
    }else{
      this.http.post('/api/mlFour/update',this.mlFour).subscribe();
    }
  }

  getMlFour(){
    this.http.get<any>('/api/mlFour',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlFour = data;
        this.mlFour.personId = sessionStorage['personId'];
      }
    });
  }

}

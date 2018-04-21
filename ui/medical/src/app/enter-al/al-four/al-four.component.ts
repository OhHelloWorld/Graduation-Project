import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-al-four',
  templateUrl: './al-four.component.html',
  styleUrls: ['./al-four.component.css']
})
export class AlFourComponent implements OnInit {

  flag:boolean;

  alFour:{
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
  };

  information:string;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.alFour = {
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
    this.information = '四诊信息数据保存成功';
    this.getAlFour();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/alFour',this.alFour).subscribe();
    }else{
      this.http.post('/api/alFour/update',this.alFour).subscribe();
    }
    $('#info').modal();
  }

  getAlFour(){
    this.http.get<any>('/api/alFour',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.alFour = data;
        this.alFour.personId = sessionStorage['personId'];
      }
    });
  }

}

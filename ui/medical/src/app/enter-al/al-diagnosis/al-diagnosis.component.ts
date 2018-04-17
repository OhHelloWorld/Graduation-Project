import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-al-diagnosis',
  templateUrl: './al-diagnosis.component.html',
  styleUrls: ['./al-diagnosis.component.css']
})
export class AlDiagnosisComponent implements OnInit {

  flag:boolean;

  alFinal:{
    personId:number,
    pbc:string,
    aih:string,
    special:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.alFinal={
      personId:sessionStorage['personId'],
      pbc:undefined,
      aih:undefined,
      special:undefined
    }

    this.flag = false;

    this.getAlFinal();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/alFinal',this.alFinal).subscribe();
    }else{
      this.http.post('/api/alFinal/update',this.alFinal).subscribe();
    }
  }

  getAlFinal(){
    this.http.get<any>('/api/alFinal',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.alFinal = data;
        this.flag = true;
        this.alFinal.personId = sessionStorage['personId'];
      }
    });
  }

}

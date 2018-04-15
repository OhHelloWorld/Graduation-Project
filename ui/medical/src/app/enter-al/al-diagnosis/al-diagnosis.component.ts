import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-al-diagnosis',
  templateUrl: './al-diagnosis.component.html',
  styleUrls: ['./al-diagnosis.component.css']
})
export class AlDiagnosisComponent implements OnInit {

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
  }

  submit(){
    this.http.post('/api/alFinal',this.alFinal).subscribe();
  }

}

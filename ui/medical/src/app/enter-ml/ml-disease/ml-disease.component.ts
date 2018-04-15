import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ml-disease',
  templateUrl: './ml-disease.component.html',
  styleUrls: ['./ml-disease.component.css']
})
export class MlDiseaseComponent implements OnInit {

  mlDiseaseHistory:{
    personId:number,
    other:string,
    one:string,
    tour:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlDiseaseHistory = {
      personId:sessionStorage['personId'],
      other:undefined,
      one:undefined,
      tour:undefined
    };
  }

  submit(){
    this.http.post('/api/mlDiease',this.mlDiseaseHistory).subscribe();
  }

}

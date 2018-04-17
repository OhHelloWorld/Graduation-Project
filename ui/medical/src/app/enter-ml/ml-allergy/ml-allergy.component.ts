import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-ml-allergy',
  templateUrl: './ml-allergy.component.html',
  styleUrls: ['./ml-allergy.component.css']
})
export class MlAllergyComponent implements OnInit {

  flag:boolean;

  mlAllergy:{
    personId:number,
    allergy:string,
    allergen:string,
    remark:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {

    this.mlAllergy = {
      personId:sessionStorage['personId'],
      allergy:undefined,
      allergen:undefined,
      remark:undefined
    }

    this.flag = false;

    this.getMlAllergy();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/mlAllergy',this.mlAllergy).subscribe();
    }else{
      this.http.post('/api/mlAllergy/update',this.mlAllergy).subscribe();
    }
  }

  getMlAllergy(){
    this.http.get<any>('/api/mlAllergy',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlAllergy = data;
        this.mlAllergy.personId = sessionStorage['personId'];
      }
    });
  }
}

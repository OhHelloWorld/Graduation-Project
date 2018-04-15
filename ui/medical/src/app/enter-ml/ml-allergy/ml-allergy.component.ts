import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ml-allergy',
  templateUrl: './ml-allergy.component.html',
  styleUrls: ['./ml-allergy.component.css']
})
export class MlAllergyComponent implements OnInit {

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
  }

  submit(){
    this.http.post('/api/mlAllergy',this.mlAllergy).subscribe();
  }

}

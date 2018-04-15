import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-ml-drink',
  templateUrl: './ml-drink.component.html',
  styleUrls: ['./ml-drink.component.css']
})
export class MlDrinkComponent implements OnInit {

  species1:boolean;
  species2:boolean;
  species3:boolean;
  species4:boolean;

  mlDrink:{
    personId:number,
    history:string,
    species:string,
    time:string
  };

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.mlDrink = {
      personId:sessionStorage['personId'],
      history:undefined,
      species:'',
      time:undefined
    };
    this.species1 = false;
    this.species2 = false;
    this.species3 = false;
    this.species4 = false;
  }

  submit(){
    this.mlDrink.species = '';
    if(this.species1){
      this.mlDrink.species += '白酒&';
    }
    if(this.species2){
      this.mlDrink.species += '红酒&';
    }
    if(this.species3){
      this.mlDrink.species += '啤酒&';
    }
    if(this.species4){
      this.mlDrink.species += '其他';
    }
    
    this.http.post('/api/mlDrink',this.mlDrink).subscribe();
  }

}

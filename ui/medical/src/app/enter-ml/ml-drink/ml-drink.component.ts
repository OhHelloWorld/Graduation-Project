import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

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

  flag:boolean;

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

    this.flag = false;
    this.getMlDrink();
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
    
    if(!this.flag){
      this.http.post('/api/mlDrink',this.mlDrink).subscribe();
    }else{
      this.http.post('/api/mlDrink/update',this.mlDrink).subscribe();
    }
  }

  getMlDrink(){
    this.http.get<any>('/api/mlDrink',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.mlDrink = data;
        this.mlDrink.personId = sessionStorage['personId'];
        this.displaySpecies(this.mlDrink.species);
      }
    });
  }

  displaySpecies(species:string){
    if(species.indexOf('白酒')!=-1){
      this.species1 = true;
    }
    if(species.indexOf('红酒')!=-1){
      this.species2 = true;
    }
    if(species.indexOf('啤酒')!=-1){
      this.species3 = true;
    }
    if(species.indexOf('其他')!=-1){
      this.species4 = true;
    }
  }

}

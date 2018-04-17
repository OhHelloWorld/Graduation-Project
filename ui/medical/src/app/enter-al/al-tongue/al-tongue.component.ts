import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-al-tongue',
  templateUrl: './al-tongue.component.html',
  styleUrls: ['./al-tongue.component.css']
})
export class AlTongueComponent implements OnInit {

  flag:boolean;

  tongue:{
    personId:number,
    tongueQuality:string,
    tongueBody:string,
    mossyQuality:string,
    mossyColor:string,
    varice:string,
    tongueLeft:string,
    tongueRight:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.tongue = {
      personId:sessionStorage['personId'],
      tongueQuality:undefined,
      tongueBody:undefined,
      mossyQuality:undefined,
      mossyColor:undefined,
      varice:undefined,
      tongueLeft:undefined,
      tongueRight:undefined
    };

    this.flag = false;

    this.getAlTongue();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/alTongue',this.tongue).subscribe();
    }else{
      this.http.post('/api/alTongue/update',this.tongue).subscribe();
    }

  }

  getAlTongue(){
    this.http.get<any>('/api/alTongue',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.tongue = data;
        this.tongue.personId = sessionStorage['personId'];
      }
    });
  }

}

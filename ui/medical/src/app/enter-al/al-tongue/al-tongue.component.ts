import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-al-tongue',
  templateUrl: './al-tongue.component.html',
  styleUrls: ['./al-tongue.component.css']
})
export class AlTongueComponent implements OnInit {

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
  }

  submit(){
    this.http.post('/api/alTongue',this.tongue).subscribe();

  }

}

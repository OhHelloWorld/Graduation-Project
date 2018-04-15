import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-al-bone',
  templateUrl: './al-bone.component.html',
  styleUrls: ['./al-bone.component.css']
})
export class AlBoneComponent implements OnInit {

  alBone:{
    personId:number,
    lv:string,
    lvT:string,
    fn:string,
    fnT:string,
    br:string,
    brT:string,
    th:string,
    thT:string,
    diagnosis:string
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.alBone = {
      personId:sessionStorage['personId'],
      lv:undefined,
      lvT:undefined,
      fn:undefined,
      fnT:undefined,
      br:undefined,
      brT:undefined,
      th:undefined,
      thT:undefined,
      diagnosis:undefined
    }
  }

  submit(){
    this.http.post('/api/alBone',this.alBone).subscribe();
  }

}

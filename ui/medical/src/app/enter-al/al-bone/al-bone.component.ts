import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-al-bone',
  templateUrl: './al-bone.component.html',
  styleUrls: ['./al-bone.component.css']
})
export class AlBoneComponent implements OnInit {

  flag:boolean;

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

  information:string;

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

    this.flag = false;

    this.information = '骨密度数据保存成功';

    this.getAlBone();
  }

  submit(){
    if(!this.flag){
      this.http.post('/api/alBone',this.alBone).subscribe();
    }else{
      this.http.post('/api/alBone/update',this.alBone).subscribe();
    }
    $('#info').modal();
  }

  getAlBone(){
    this.http.get<any>('/api/alBone',{
      params:new HttpParams().set('personId',''+sessionStorage['personId'])
    }).subscribe(data => {
      if(data != null){
        this.flag = true;
        this.alBone = data;
        this.alBone.personId = sessionStorage['personId'];
      }
    });
  }

}

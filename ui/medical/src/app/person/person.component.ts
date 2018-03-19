import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { FileUploader } from 'ng2-file-upload';

const URL = 'http://localhost:4200/api/person/file'

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  person:{
    name:string,
    age:number,
    gender:string,
    nation:string,
    culture:string,
    height:number,
    weight:number,
    bmi:number,
    phone:string,
    address:string,
    fileName:string
  }

  imgUrl:string;

  public uploader:FileUploader = new FileUploader({
    url: URL,
    method:'POST',
    itemAlias:'file',
    removeAfterUpload:true
  });

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.person = {
      name:undefined,
      age:undefined,
      gender:undefined,
      nation:undefined,
      culture:undefined,
      height:undefined,
      weight:undefined,
      bmi:undefined,
      phone:undefined,
      address:undefined,
      fileName:undefined,
    };

  }

  submit(){
    this.uploadFile(this.person,this.http);
  }
  uploadFile(person:any,http:any) {
      // 上传
      this.uploader.queue[0].upload(); // 开始上传
      this.uploader.queue[0].onSuccess = function (response, status, headers) {
        if (status == 200) {
          // 上传文件后获取服务器返回的数据
          person.fileName =  response;
          //发送person数据
          http.post('/api/person',person,{headers:new HttpHeaders().set('userId',localStorage['id'])}).subscribe();
        }
      };
  }

  judgeBmi(){
    if(this.person.height && this.person.weight){
      this.person.bmi = this.person.weight/(this.person.height/100 * this.person.height/100);
    }else{
      this.person.bmi = undefined;
    }
  }
  blurHeight(){
    this.judgeBmi();
  }
  blurWeight(){
    this.judgeBmi();
  }

}

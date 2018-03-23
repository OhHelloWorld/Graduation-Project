import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-doc-detail',
  templateUrl: './doc-detail.component.html',
  styleUrls: ['./doc-detail.component.css']
})
export class DocDetailComponent implements OnInit {

  doc:{
    id:number,
    name:string,
    author:string,
    source:string,
    image:string,
    content:string,
    comments:any[]
  };

  commentDTO:{
    userId:number,
    docId:number,
    content:string
  }

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }
  
  ngOnInit() {
    this.commentDTO = {
      userId:localStorage['id'],
      docId:undefined,
      content:undefined
    }
    this.doc = {
      id:undefined,
      name:undefined,
      author:undefined,
      source:undefined,
      image:undefined,
      content:undefined,
      comments:null
    }
    this.route.paramMap.subscribe((params:ParamMap) => {
      this.http.get<any>('/api/doc/' + params.get('id')).subscribe(data => {
        this.doc = data;
      })
    })
  }

  submit(id:number){
    this.commentDTO.userId = localStorage['id'];
    this.commentDTO.docId = id;
    this.http.post('/api/com',this.commentDTO).subscribe();
  }

}

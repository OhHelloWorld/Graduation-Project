import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-doc-detail',
  templateUrl: './doc-detail.component.html',
  styleUrls: ['./doc-detail.component.css']
})
export class DocDetailComponent implements OnInit {

  doc:{id:number,name:string,author:string,source:string,image:string,content:string,comments:any[]};
  count:number = 0;

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {
    this.count = this.count + 1;
    this.route.paramMap.subscribe((params:ParamMap) => {
      this.http.get<any>('/api/doc/' + params.get('id')).subscribe(data => {
        this.doc = data;
      })
    })
  }

}

import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient,HttpHeaders,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-case-detail',
  templateUrl: './case-detail.component.html',
  styleUrls: ['./case-detail.component.css']
})
export class CaseDetailComponent implements OnInit {

  case:{id:number,name:string};
  hasCollect:boolean;

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {
    this.case = {id:-1,name:''};
    this.route.paramMap.subscribe((params:ParamMap) => {
      this.http.get<any>('/api/person/' + params.get('id')).subscribe(data => {
        this.case = data;
      });
      this.http.get<any>('/api/person/hasCollect',{
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('personId',params.get('id'))
      }).subscribe(data =>{
        this.hasCollect = data;
      })
    })
  }

  collect(){
    this.http.get('/api/user/collection/' + this.case.id,
      {
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }
    ).subscribe();
  }

  uncollect(){
    this.http.get<any>('/api/user/uncollectPerson/',
      {
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('personId',''+this.case.id)
      }
    ).subscribe();
  }

}

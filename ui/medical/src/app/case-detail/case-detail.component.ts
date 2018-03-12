import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-case-detail',
  templateUrl: './case-detail.component.html',
  styleUrls: ['./case-detail.component.css']
})
export class CaseDetailComponent implements OnInit {

  case:{id:number,name:string};

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {
    this.case = {id:-1,name:''};
    this.route.paramMap.subscribe((params:ParamMap) => {
      this.http.get<any>('/api/person/' + params.get('id')).subscribe(data => {
        this.case = data;
      });
    })
  }

  collect(){
    this.http.get('/api/user/collection/' + this.case.id,
      {
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }
    ).subscribe();
  }

}

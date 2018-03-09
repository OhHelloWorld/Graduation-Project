import { Component, OnInit } from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-case-detail',
  templateUrl: './case-detail.component.html',
  styleUrls: ['./case-detail.component.css']
})
export class CaseDetailComponent implements OnInit {

  case:{name:string};

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {
    this.case = {name:''};
    this.route.paramMap.subscribe((params:ParamMap) => {
      this.http.get<any>('/api/alPerson/' + params.get('id')).subscribe(data => {
        this.case = data;
      });
    })
  }

}

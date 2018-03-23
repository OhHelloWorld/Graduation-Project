import { Component, OnInit} from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient,HttpHeaders,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-person-select',
  templateUrl: './person-select.component.html',
  styleUrls: ['./person-select.component.css']
})
export class PersonSelectComponent implements OnInit {

  cases:any[];
  category:string;
  case:any;
  //数据总量
  dataNums:number;
  currentPage:number = 1;
  dataNumsInPage:number = 24;

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {
    this.getMineCount();
  }

  getMineCount(){
    this.http.get<any>('/api/person/mine/count',
      {
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }).subscribe(data => {
        this.dataNums = data;
      })
  }

  navigateToCategory(id:number){
    sessionStorage['personId'] = id;
    this.router.navigate(['/' + this.category]);
  }

  pageMinePerson(){
    this.http.get<any>('/api/person/mine/page',{
      headers:new HttpHeaders().set('userId',localStorage['id']),
      params:new HttpParams().set('page',''+this.currentPage)
    }).subscribe(data => {
      this.cases = data;
      this.route.paramMap.subscribe((params:ParamMap) => {
        this.category = params.get('category');
      })
    })  
  }

  currentPageHandle(page:number){
    this.currentPage = page;
    this.pageMinePerson();
  }

}

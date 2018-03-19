import { Component, OnInit} from '@angular/core';
import { Router,ActivatedRoute,ParamMap } from '@angular/router';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-person-select',
  templateUrl: './person-select.component.html',
  styleUrls: ['./person-select.component.css']
})
export class PersonSelectComponent implements OnInit {

  cases:any[];
  category:string;
  case:any;

  constructor(private router:Router,private route:ActivatedRoute,private http:HttpClient) { }

  ngOnInit() {
    this.getMine();
  }

  getMine(){
    this.http.get<any>('/api/person/mine',
      {
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }).subscribe(data => {
        this.cases = data;
        this.route.paramMap.subscribe((params:ParamMap) => {
          this.category = params.get('category');
        })
      });
  }

  navigateToCategory(id:number){
    sessionStorage['personId'] = id;
    this.router.navigate(['/' + this.category]);
  }



}

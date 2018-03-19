import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  cases:any[]

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.allPerson();
  }

  allPerson(){
    this.http.get<any>('/api/person/latest').subscribe(data => {
        this.cases = data;
      });
  }

}

import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-case-list',
  templateUrl: './case-list.component.html',
  styleUrls: ['./case-list.component.css']
})
export class CaseListComponent implements OnInit {

  cases:any[];

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.listCase();
  }

  listCase(){
    this.http.get<any>('/api/alPerson/all').subscribe(data => {
      this.cases = data;
    });
  }


}

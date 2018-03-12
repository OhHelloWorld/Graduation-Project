import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-disease-case',
  templateUrl: './disease-case.component.html',
  styleUrls: ['./disease-case.component.css']
})
export class DiseaseCaseComponent implements OnInit {

  cases:any[];
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.listCase();
  }

  listCase(){
    this.http.get<any>('/api/person/all').subscribe(data => {
      this.cases = data;
    });
  }

}

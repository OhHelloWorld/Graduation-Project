import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent implements OnInit {

  docs:any[];
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.allDocuments();
  }

  allDocuments(){
    this.http.get<any>('/api/doc').subscribe(data => {
      this.docs = data;
    })
  }

}

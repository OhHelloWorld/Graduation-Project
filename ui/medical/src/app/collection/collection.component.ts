import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-collection',
  templateUrl: './collection.component.html',
  styleUrls: ['./collection.component.css']
})
export class CollectionComponent implements OnInit {

  collections:any[];
  constructor(private http:HttpClient) {}

  ngOnInit() {
    this.getCollections();
  }

  getCollections(){
    this.http.get<any>('/api/user/collections',
      {
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }).subscribe(data => {
        this.collections = data;
      });
  }

}

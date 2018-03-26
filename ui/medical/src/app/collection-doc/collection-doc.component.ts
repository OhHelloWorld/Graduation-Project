import { Component, OnInit} from '@angular/core';
import {HttpHeaders,HttpParams,HttpClient} from '@angular/common/http';
@Component({
  selector: 'app-collection-doc',
  templateUrl: './collection-doc.component.html',
  styleUrls: ['./collection-doc.component.css']
})
export class CollectionDocComponent implements OnInit {

  collections:any[];
  //数据总量
  public dataNums:number;
  public currentPage:number = 1;
  public dataNumsInPage:number = 24;
  constructor(private http:HttpClient) {}

  ngOnInit() {
    this.getCollectionCount();
  }

  pageCollections(){
    this.http.get<any>('/api/user/docCollections/page',
      {
        headers:new HttpHeaders().set('userId',localStorage['id']),
        params:new HttpParams().set('page',''+this.currentPage)
      }).subscribe(data => {
        this.collections = data;
      });
  }

  getCollectionCount(){
    this.http.get<any>('api/user/docCollections/count',{
        headers:new HttpHeaders().set('userId',localStorage['id'])
      }).subscribe(data => {
        this.dataNums = data;
      })
  }

  currentPageHandle(page:number){
    this.currentPage = page;
    this.pageCollections();
  }

}

import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent implements OnInit {

  docs:any[];
  //数据总量
  public dataNums:number;
  public currentPage:number = 1;
  public dataNumsInPage:number = 24;
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.countDocument();
  }

  countDocument(){
    this.http.get<any>('/api/doc/count').subscribe(data =>{
      this.dataNums = data;
    })
  }

  pageDocument(){
    this.http.get<any>('/api/doc/page',{
      params:new HttpParams().set('page',''+this.currentPage)
    }).subscribe(data => {
      this.docs = data;
    })  
  }

  currentPageHandle(page:number){
    this.currentPage = page;
    this.pageDocument();
  }

}

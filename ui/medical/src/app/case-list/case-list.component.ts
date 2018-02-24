import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-case-list',
  templateUrl: './case-list.component.html',
  styleUrls: ['./case-list.component.css']
})
export class CaseListComponent implements OnInit {

  cases = [
    {
      imgUrl:'../../assets/image/medicine2.jpg',
      caseName:'小明',
      caseInfo:'自身免疫性肝病'
    },{
      imgUrl:'../../assets/image/medicine5.jpg',
      caseName:'小王',
      caseInfo:'药物性肝损伤'
    },{
      imgUrl:'../../assets/image/medicine4.jpg',
      caseName:'小李',
      caseInfo:'感冒'
    },{
      imgUrl:'../../assets/image/medicine1.jpg',
      caseName:'小黑',
      caseInfo:'发烧'
    },{
      imgUrl:'../../assets/image/medicine3.jpg',
      caseName:'张三',
      caseInfo:'四肢无力'
    },{
      imgUrl:'../../assets/image/medicine2.jpg',
      caseName:'李四',
      caseInfo:'不明'
    }]

  constructor() { }

  ngOnInit() {
  }



}

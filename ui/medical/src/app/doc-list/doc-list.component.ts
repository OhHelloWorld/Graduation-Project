import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-doc-list',
  templateUrl: './doc-list.component.html',
  styleUrls: ['./doc-list.component.css']
})
export class DocListComponent implements OnInit {

  docs = [
    {
      imgUrl:'../../assets/image/medicine2.jpg',
      docName:'心脏病',
      docInfo:'心脏病信息'
    },{
      imgUrl:'../../assets/image/medicine5.jpg',
      docName:'高血压',
      docInfo:'高血压信息'
    },{
      imgUrl:'../../assets/image/medicine4.jpg',
      docName:'感冒',
      docInfo:'感冒信息'
    },{
      imgUrl:'../../assets/image/medicine1.jpg',
      docName:'咳嗽',
      docInfo:'咳嗽信息'
    },{
      imgUrl:'../../assets/image/medicine3.jpg',
      docName:'高血糖',
      docInfo:'高血糖信息'
    },{
      imgUrl:'../../assets/image/medicine2.jpg',
      docName:'头疼',
      docInfo:'头疼信息'
    }]

  constructor() { }

  ngOnInit() {
  }

}

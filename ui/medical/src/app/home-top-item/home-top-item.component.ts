import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-top-item',
  templateUrl: './home-top-item.component.html',
  styleUrls: ['./home-top-item.component.css']
})
export class HomeTopItemComponent implements OnInit {

  projects = [
    {
      imgUrl:'../../assets/image/medicine2.jpg',
      projectName:'自免肝',
      projectInfo:'自身免疫性肝病'
    },{
      imgUrl:'../../assets/image/medicine5.jpg',
      projectName:'药肝',
      projectInfo:'药物性肝损伤'
    },{
      imgUrl:'../../assets/image/medicine4.jpg',
      projectName:'暂无',
      projectInfo:'暂无内容'
    },{
      imgUrl:'../../assets/image/medicine1.jpg',
      projectName:'暂无',
      projectInfo:'暂无内容'
    },{
      imgUrl:'../../assets/image/medicine3.jpg',
      projectName:'暂无',
      projectInfo:'暂无内容'
    },{
      imgUrl:'../../assets/image/medicine2.jpg',
      projectName:'暂无',
      projectInfo:'暂无内容'
    }]

  constructor() { }

  ngOnInit() {
  }



}

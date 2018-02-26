import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-doc-detail',
  templateUrl: './doc-detail.component.html',
  styleUrls: ['./doc-detail.component.css']
})
export class DocDetailComponent implements OnInit {

  comments=[{
    username:'jr',
    time:'today',
    context:'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout'
  },{
    username:'hhh',
    time:'today',
    context:'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout'
  },{
    username:'jiarui',
    time:'today',
    context:'It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout'
  },];
  constructor() { }

  ngOnInit() {
  }

}

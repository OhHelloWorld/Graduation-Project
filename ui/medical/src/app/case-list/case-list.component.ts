import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-case-list',
  templateUrl: './case-list.component.html',
  styleUrls: ['./case-list.component.css']
})
export class CaseListComponent implements OnInit {

  @Input() cases:any[];

  constructor() { }

  ngOnInit() {
  }

}

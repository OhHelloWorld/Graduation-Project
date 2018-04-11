import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-infobox',
  templateUrl: './infobox.component.html',
  styleUrls: ['./infobox.component.css']
})
export class InfoboxComponent implements OnInit {

  @Input()
  information:string;

  constructor() {}

  ngOnInit() {
    this.information = '';
  }

}

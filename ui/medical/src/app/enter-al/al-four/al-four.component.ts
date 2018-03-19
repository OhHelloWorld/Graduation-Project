import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-al-four',
  templateUrl: './al-four.component.html',
  styleUrls: ['./al-four.component.css']
})
export class AlFourComponent implements OnInit {

  alFour:{
    personId:number,
    fatigue:string,
    itch:string,
    dry:string,
    vague:string,
    depress:string,
    angry:string,
    insomnia:string,
    wake:string,
    tinnitus:string,
    thirst:string,
  }

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.alFour = {
      personId:sessionStorage['personId'],
      fatigue:'0',
      itch:'0',
      dry:'0',
      vague:'0',
      depress:'0',
      angry:'0',
      insomnia:'0',
      wake:'0',
      tinnitus:'0',
      thirst:'0'
    };
  }

  submit(){
    this.http.post('/api/alFour',this.alFour).subscribe();
  }

}

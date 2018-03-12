import { Component, OnInit } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-person',
  templateUrl: './person.component.html',
  styleUrls: ['./person.component.css']
})
export class PersonComponent implements OnInit {

  person:{name:string}
  
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.person = {name:''};
  }

  sendPerson(){
    this.http.post('/api/person',this.person,{headers:new HttpHeaders().set('userId',localStorage['id'])}).subscribe();
  }

}

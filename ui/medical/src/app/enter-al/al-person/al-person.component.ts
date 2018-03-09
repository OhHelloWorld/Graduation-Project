import { Component, OnInit} from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-al-person',
  templateUrl: './al-person.component.html',
  styleUrls: ['./al-person.component.css']
})
export class AlPersonComponent implements OnInit {

  alPerson:{name:string}
  
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.alPerson = {name:''};
  }

  sendAlPerson(){
    this.http.post('/api/alPerson',this.alPerson,{headers:new HttpHeaders().set('userId',localStorage['id'])}).subscribe();
  }
}

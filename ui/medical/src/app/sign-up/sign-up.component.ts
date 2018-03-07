import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  register:{name:string,password:string,againPass:string};
  user:{name:string,password:string,username:string,age:number};

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.register = {name:'',password:'',againPass:''}
  }

  registered(){
    this.user = {name:this.register.name,password:btoa(this.register.password),username:'jiarui',age:15}
    this.http.post('/api/user',this.user).subscribe(data => console.log(data));
  }

}

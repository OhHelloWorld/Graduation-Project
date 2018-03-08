import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  register:{username:string,password:string,againPass:string};
  user:{username:string,password:string};

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.register = {username:'',password:'',againPass:''}
  }

  registered(){
    this.user = {username:this.register.username,password:btoa(this.register.password)}
    this.http.post('/api/user/register',this.user).subscribe(data => console.log(data));
  }

}

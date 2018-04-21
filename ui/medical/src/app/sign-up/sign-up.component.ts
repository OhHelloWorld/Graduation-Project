import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  user:{username:string,password:string};
  againPass:string;

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.user = {username:'',password:''}
    this.againPass = '';
  }

  registered(){
    this.user = {username:this.user.username,password:btoa(this.user.password)}
    this.http.post('/api/user/register',this.user).subscribe(data => console.log(data));
  }

}

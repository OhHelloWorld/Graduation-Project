import { Component,OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  username:string;
  hasUser = false;

  constructor(private router:Router){}

  ngOnInit(){
    if(localStorage['username']){
      this.username = localStorage['username'];
      this.hasUser = true;
    }else{
      this.hasUser = false;
    }
  }

  logout(){
    localStorage.removeItem('username');
    localStorage.removeItem('id');
    this.router.navigate(['/home']);
    location.reload();
  }
}



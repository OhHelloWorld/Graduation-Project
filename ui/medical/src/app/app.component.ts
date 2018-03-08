import { Component,OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  username:string;
  hasUser = false;

  constructor(){}

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
    location.reload();
  }
}



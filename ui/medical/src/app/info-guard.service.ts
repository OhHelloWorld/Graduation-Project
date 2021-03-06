import { Injectable } from '@angular/core';
import { Router,CanActivate } from '@angular/router';

@Injectable()
export class InfoGuard implements CanActivate{
  
  constructor(private router:Router){}

  canActivate(){
    if(sessionStorage['personId']){
      return true;      
    }else{
      this.router.navigate(['/']);
      return false;
    }
  }
}
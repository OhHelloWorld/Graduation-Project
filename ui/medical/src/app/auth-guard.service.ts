import { Injectable } from '@angular/core';
import { CanActivate } from '@angular/router';

@Injectable()
export class AuthGuard implements CanActivate{
  canActivate(){
    if(localStorage['id']){
      return true;      
    }else{
      alert('请先登录');
      return false;
    }
  }
}
import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ViewChild, ElementRef} from '@angular/core';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {

  @ViewChild('closeBtn') closeBtn:ElementRef;

  user:{username:string,password:string};

  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.user = {username:'',password:''};
  }



  login(){
    this.user.password = btoa(this.user.password);
    this.http.post('/api/user/login',this.user)
      .subscribe(data =>{
        if(data != null){
          localStorage['username'] = data['username'];
          this.closeBtn.nativeElement.click();
          location.reload();
        }else{
          alert('error');
        }
        
      });
  }

}

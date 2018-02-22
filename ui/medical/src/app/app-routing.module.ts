import { NgModule } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { SignUpComponent } from './sign-up/sign-up.component';

const appRoutes:Routes = [
  {path:'',redirectTo:'/home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'signUp',component:SignUpComponent}
];

@NgModule(
  {
    imports:[
      RouterModule.forRoot(appRoutes)
    ],
    exports:[
      RouterModule
    ]

})
export class AppRoutingModule{}
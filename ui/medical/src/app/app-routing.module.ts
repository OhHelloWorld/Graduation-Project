import { NgModule } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { DiseaseCaseComponent} from './disease-case/disease-case.component';
import { AutoimmuneLiverComponent } from './autoimmune-liver/autoimmune-liver.component';
import { MedicineLiverComponent } from './medicine-liver/medicine-liver.component';

const appRoutes:Routes = [
  {path:'',redirectTo:'/home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'signUp',component:SignUpComponent},
  {path:'case',component:DiseaseCaseComponent},
  {path:'autoimmune',component:AutoimmuneLiverComponent},
  {path:'medicineLiver',component:MedicineLiverComponent}
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
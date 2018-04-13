import { NgModule } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { DiseaseCaseComponent} from './disease-case/disease-case.component';
import { AutoimmuneLiverComponent } from './autoimmune-liver/autoimmune-liver.component';
import { MedicineLiverComponent } from './medicine-liver/medicine-liver.component';
import { DocumentComponent } from './document/document.component';
import { CaseDetailComponent} from './case-detail/case-detail.component';
import { DocDetailComponent} from './doc-detail/doc-detail.component';
import { PersonComponent } from './person/person.component';

import { AlFourComponent } from './enter-al/al-four/al-four.component';
import { AlTongueComponent } from './enter-al/al-tongue/al-tongue.component';
import { AlExamComponent } from './enter-al/al-exam/al-exam.component';
import { AlLiverComponent } from './enter-al/al-liver/al-liver.component';
import { AlBoneComponent } from './enter-al/al-bone/al-bone.component';
import { AlAihComponent } from './enter-al/al-aih/al-aih.component';
import { AlDiagnosisComponent } from './enter-al/al-diagnosis/al-diagnosis.component';

import { MlFourComponent } from './enter-ml/ml-four/ml-four.component';
import { MlDiseaseComponent } from './enter-ml/ml-disease/ml-disease.component';
import { MlAllergyComponent } from './enter-ml/ml-allergy/ml-allergy.component';
import { MlDrinkComponent } from './enter-ml/ml-drink/ml-drink.component';
import { MlExamComponent } from './enter-ml/ml-exam/ml-exam.component';
import { MlBloodComponent } from './enter-ml/ml-blood/ml-blood.component';
import { MlLiverComponent } from './enter-ml/ml-liver/ml-liver.component';

import { CollectionComponent } from './collection/collection.component';
import { CollectionDocComponent } from './collection-doc/collection-doc.component';
import { PersonSelectComponent } from './person-select/person-select.component';

import { AuthGuard } from './auth-guard.service';
import { InfoGuard } from './info-guard.service';

const appRoutes:Routes = [
  {path:'',redirectTo:'/home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'signUp',component:SignUpComponent},
  {path:'case',component:DiseaseCaseComponent,canActivate:[AuthGuard]},
  {path:'autoimmune',component:AutoimmuneLiverComponent,canActivate:[AuthGuard]},
  {path:'medicineLiver',component:MedicineLiverComponent,canActivate:[AuthGuard]},
  {path:'document',component:DocumentComponent,canActivate:[AuthGuard]},
  {path:'caseDetail/:id',component:CaseDetailComponent,canActivate:[AuthGuard]},
  {path:'docDetail/:id',component:DocDetailComponent,canActivate:[AuthGuard]},
  {path:'person',component:PersonComponent,canActivate:[AuthGuard]},
  {path:'alFour',component:AlFourComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'alTongue',component:AlTongueComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'alExam',component:AlExamComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'alLiver',component:AlLiverComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'alBone',component:AlBoneComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'alAih',component:AlAihComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'alDiagnosis',component:AlDiagnosisComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlFour',component:MlFourComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlDisease',component:MlDiseaseComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlAllergy',component:MlAllergyComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlDrink',component:MlDrinkComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlExam',component:MlExamComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlBlood',component:MlBloodComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'mlLiver',component:MlLiverComponent,canActivate:[AuthGuard,InfoGuard]},
  {path:'collection',component:CollectionComponent,canActivate:[AuthGuard]},
  {path:'collectionDoc',component:CollectionDocComponent,canActivate:[AuthGuard]},
  {path:'select/:category',component:PersonSelectComponent,canActivate:[AuthGuard]},
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
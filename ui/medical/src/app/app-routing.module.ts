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

const appRoutes:Routes = [
  {path:'',redirectTo:'/home',pathMatch:'full'},
  {path:'home',component:HomeComponent},
  {path:'signUp',component:SignUpComponent},
  {path:'case',component:DiseaseCaseComponent},
  {path:'autoimmune',component:AutoimmuneLiverComponent},
  {path:'medicineLiver',component:MedicineLiverComponent},
  {path:'document',component:DocumentComponent},
  {path:'caseDetail/:id',component:CaseDetailComponent},
  {path:'docDetail/:id',component:DocDetailComponent},
  {path:'person',component:PersonComponent},
  {path:'alFour',component:AlFourComponent},
  {path:'alTongue',component:AlTongueComponent},
  {path:'alExam',component:AlExamComponent},
  {path:'alLiver',component:AlLiverComponent},
  {path:'alBone',component:AlBoneComponent},
  {path:'alAih',component:AlAihComponent},
  {path:'alDiagnosis',component:AlDiagnosisComponent},
  {path:'mlFour',component:MlFourComponent},
  {path:'mlDisease',component:MlDiseaseComponent},
  {path:'mlAllergy',component:MlAllergyComponent},
  {path:'mlDrink',component:MlDrinkComponent},
  {path:'mlExam',component:MlExamComponent},
  {path:'mlBlood',component:MlBloodComponent},
  {path:'mlLiver',component:MlLiverComponent},
  {path:'collection',component:CollectionComponent}
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
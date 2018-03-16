import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FileUploadModule } from 'ng2-file-upload';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';

import { SignInComponent } from './sign-in/sign-in.component';
import { HomeComponent } from './home/home.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { CaseListComponent } from './case-list/case-list.component';
import { DiseaseCaseComponent } from './disease-case/disease-case.component';
import { AutoimmuneLiverComponent } from './autoimmune-liver/autoimmune-liver.component';
import { MedicineLiverComponent } from './medicine-liver/medicine-liver.component';
import { DocumentComponent } from './document/document.component';

import { PaginationComponent } from './myPlugin/pagination/pagination.component';
import { DocListComponent } from './doc-list/doc-list.component';
import { CaseDetailComponent } from './case-detail/case-detail.component';
import { DocDetailComponent } from './doc-detail/doc-detail.component';
import { CommentComponent } from './myPlugin/comment/comment.component';
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
import { PersonComponent } from './person/person.component';
import { CollectionComponent } from './collection/collection.component';

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    HomeComponent,
    SignUpComponent,
    CaseListComponent,
    DiseaseCaseComponent,
    AutoimmuneLiverComponent,
    MedicineLiverComponent,
    DocumentComponent,
    PaginationComponent,
    DocListComponent,
    CaseDetailComponent,
    DocDetailComponent,
    CommentComponent,
    AlFourComponent,
    AlTongueComponent,
    AlExamComponent,
    AlLiverComponent,
    AlBoneComponent,
    AlAihComponent,
    AlDiagnosisComponent,
    MlFourComponent,
    MlDiseaseComponent,
    MlAllergyComponent,
    MlDrinkComponent,
    MlExamComponent,
    MlBloodComponent,
    MlLiverComponent,
    PersonComponent,
    CollectionComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    CommonModule,
    FileUploadModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

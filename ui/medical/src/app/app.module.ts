import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

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

import {AppSelectColorDirective} from './app-select-color.directive';
import { PaginationComponent } from './pagination/pagination.component';
import { DocListComponent } from './doc-list/doc-list.component';
import { CaseDetailComponent } from './case-detail/case-detail.component';
import { DocDetailComponent } from './doc-detail/doc-detail.component';
import { CommentComponent } from './comment/comment.component';

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
    AppSelectColorDirective,
    PaginationComponent,
    DocListComponent,
    CaseDetailComponent,
    DocDetailComponent,
    CommentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

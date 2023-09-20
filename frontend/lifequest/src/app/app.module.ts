import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { FooterComponent } from './components/footer/footer.component';
import { ProfileResumeComponent } from './components/profile-resume/profile-resume.component';
import { ObjetivesComponent } from './components/objetives/objetives.component';
import { ObjetivesDetailsComponent } from './components/objetives-details/objetives-details.component';
import { ObjetivesFormComponent } from './components/objetives-form/objetives-form.component';
import { CommentsComponent } from './components/comments/comments.component';
import { RegistersComponent } from './components/registers/registers.component';
import { CommentsFormComponent } from './components/comments-form/comments-form.component';
import { RegistersFormComponent } from './components/registers-form/registers-form.component';
import { HomeComponent } from './components/home/home.component';
import { FormLoginComponent } from './components/form-login/form-login.component';
import { FormRegisterComponent } from './components/form-register/form-register.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    FooterComponent,
    ProfileResumeComponent,
    ObjetivesComponent,
    ObjetivesDetailsComponent,
    ObjetivesFormComponent,
    CommentsComponent,
    RegistersComponent,
    CommentsFormComponent,
    RegistersFormComponent,
    HomeComponent,
    FormLoginComponent,
    FormRegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

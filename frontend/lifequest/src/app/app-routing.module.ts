import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfileResumeComponent } from './components/profile-resume/profile-resume.component';
import { ObjetivesDetailsComponent } from './components/objetives-details/objetives-details.component';
import { ObjetivesFormComponent } from './components/objetives-form/objetives-form.component';
import { ObjetivesComponent } from './components/objetives/objetives.component';
import { CommentsComponent } from './components/comments/comments.component';
import { CommentsFormComponent } from './components/comments-form/comments-form.component';
import { FormRegisterComponent } from './components/form-register/form-register.component';
import { HomeComponent } from './components/home/home.component';

const routes: Routes = [

  {path: '', component: HomeComponent},
  {path: 'profile/:id', component: ProfileResumeComponent},
  {path: 'objetivesdetails/:id', component: ObjetivesDetailsComponent},
  {path: 'details', component: ObjetivesDetailsComponent},
  {path: 'objetivesform', component: ObjetivesFormComponent},
  {path: 'objetives', component: ObjetivesComponent},
  {path: 'comments', component: CommentsComponent},
  {path: 'commentsform', component: CommentsFormComponent},
  {path: 'registerform', component: FormRegisterComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

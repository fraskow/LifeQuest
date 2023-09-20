import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProfileResumeComponent } from './components/profile-resume/profile-resume.component';
import { ObjetivesDetailsComponent } from './components/objetives-details/objetives-details.component';
import { ObjetivesFormComponent } from './components/objetives-form/objetives-form.component';
import { ObjetivesComponent } from './components/objetives/objetives.component';
import { CommentsComponent } from './components/comments/comments.component';
import { CommentsFormComponent } from './components/comments-form/comments-form.component';

const routes: Routes = [

  {path: 'profile', component: ProfileResumeComponent},
  {path: 'details', component: ObjetivesDetailsComponent},
  {path: 'objetivesform', component: ObjetivesFormComponent},
  {path: 'objetives', component: ObjetivesComponent},
  {path: 'comments', component: CommentsComponent},
  {path: 'commentsform', component: CommentsFormComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

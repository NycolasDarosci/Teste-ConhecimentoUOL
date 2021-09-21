import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ResolutionFormComponent } from './resolution-form/resolution-form.component';
import { ResolutionListComponent } from './resolution-list/resolution-list.component';

const routes: Routes = [
  { path: 'resolutions', component: ResolutionListComponent },
  { path: 'add', component: ResolutionFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

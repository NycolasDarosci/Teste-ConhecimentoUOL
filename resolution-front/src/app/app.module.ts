import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ResolutionListComponent } from './resolution-list/resolution-list.component';
import { ResolutionFormComponent } from './resolution-form/resolution-form.component';
import { ResolutionService } from './service/resolution.service';

@NgModule({
  declarations: [
    AppComponent,
    ResolutionListComponent,
    ResolutionFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ResolutionListComponent,
    ResolutionFormComponent
  ],
  providers: [ResolutionService],
  bootstrap: [AppComponent]
})
export class AppModule { }

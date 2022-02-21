import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ShowPetInfoComponent } from './show-pet-info/show-pet-info.component';

@NgModule({
  declarations: [
    AppComponent,
    ShowPetInfoComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

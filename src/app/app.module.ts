import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonneComponent } from './components/personne/personne.component';
import { EmploisComponent } from './components/emplois/emplois.component';
import { PersonneListComponent } from './components/personne-list/personne-list.component';
import { FormsModule } from '@angular/forms';
import { NavbarComponent } from './components/navbar/navbar.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    PersonneComponent,
    EmploisComponent,
    PersonneListComponent,
    NavbarComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PersonneComponent } from './components/personne/personne.component';
import { EmploisComponent } from './components/emplois/emplois.component';
import { PersonneListComponent } from './components/personne-list/personne-list.component';

const routes: Routes = [
  { path: 'personne', component: PersonneComponent },
  {path: 'emplois', component: EmploisComponent },
  {path: 'liste-personnes', component: PersonneListComponent },
  {path : '', redirectTo: 'Home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

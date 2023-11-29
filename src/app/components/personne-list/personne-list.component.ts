import { Component, OnInit } from '@angular/core';
import { error } from 'console';
import { PersonneService } from 'src/app/services/personne.service';

@Component({
  selector: 'app-personne-list',
  templateUrl: './personne-list.component.html',
  styleUrls: ['./personne-list.component.css']
})
export class PersonneListComponent implements OnInit {

  employees : any =[];

  constructor(private personneService : PersonneService) { }

  ngOnInit(): void {
    this.getEmployees();
  }

  getEmployees() {
    this.personneService.getAllEmployees()
    .subscribe(
      res => this.employees = res,
      error => console.error('Erreur pour trouver des employés',error)
    );
  }

}

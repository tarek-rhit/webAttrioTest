import { Component, OnInit } from '@angular/core';
import { error } from 'console';
import { PersonneService } from 'src/app/services/personne.service';

@Component({
  selector: 'app-emplois',
  templateUrl: './emplois.component.html',
  styleUrls: ['./emplois.component.css']
})
export class EmploisComponent implements OnInit {

  nouveauEmploi : any = {
    poste : '',
    startDate : '',
    endDate : ''
  };

  constructor(private personneService : PersonneService) { }

  ngOnInit(): void {
  }

  ajouterEmploi() {
    this.personneService.ajouterEmploiToPersonne(this.nouveauEmploi)
    .subscribe(
      response => console.log('Emploi est bien ajouté',response),
      error => console.error('Erreur pour ajouter',error)
    );
  }

}

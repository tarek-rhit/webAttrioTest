import { Component, OnInit } from '@angular/core';
import { error } from 'console';
import { PersonneService } from 'src/app/services/personne.service';

@Component({
  selector: 'app-personne',
  templateUrl: './personne.component.html',
  styleUrls: ['./personne.component.css']
})
export class PersonneComponent implements OnInit {

  nouveauPersonne : any = {
    nom:'',
    prenom:'',
    age : 0
    
  };

  constructor(private personneService : PersonneService ) { }

  ngOnInit(): void {
  }

  ajouterPersonne( ) {
    if(this.nouveauPersonne.age < 150) {
      this.personneService.savePersonne(this.nouveauPersonne)
      .subscribe(
        response => console.log('Personne ajouté ', response),
        error => console.log('Erreur de sauvegarde',error)
      );
    } else {
      console.error('Age du personne doit etre inférieur à 150.');
    }
  }

}

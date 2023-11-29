import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonneService {

  private apiUrl = 'https://localhost:8083'

  constructor(private http : HttpClient) { }


  savePersonne(personne : any) : Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/nouveau`,personne);
  }

  ajouterEmploiToPersonne(emplois : any) : Observable<any> {
    return this.http.post<any>(`${this.apiUrl}/ajouter-emplois-personne`,emplois);
  }
  getAllEmployees() : Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/tous`);
  }

  getEmployeesByCompany(companyName : string) : Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/emplyee-company/${companyName}`);
  }

  getEmploiByPersonneAndDates(personneId: string, startDate :string,endDate: string) : Observable<any[]> {
    return this.http.get<any[]>(`${this.apiUrl}/emplois-personne-dates/${personneId}?startDate=$startDate}&endDate=${endDate}`);
  }
}

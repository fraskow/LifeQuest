import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Objective } from '../../app/models/user.model';

@Injectable({
  providedIn: 'root'
})
export class ObjetiveService {

  private baseUrl = 'http://localhost:4000';

  constructor(private httpClient: HttpClient) { }

  getAllObjetives(): Observable<Objective[]> {
    return this.httpClient.get<Objective[]>(`${this.baseUrl}/objetives`);
  }

  getObjetiveById(id: string): Observable<Objective> {
    return this.httpClient.get<Objective>(`${this.baseUrl}/objetives/${id}`);
  }

  addObjetive(objetive: Objective): Observable<Objective> {
    return this.httpClient.post<Objective>(`${this.baseUrl}/objetives/create`, objetive);
  }
}
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../../app/models/user.model';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  private baseUrl = 'http://localhost:4000';

  private actualUser!: User;

  constructor(private httpClient: HttpClient) { }

  public registerUser(user: any): Observable<any> {
    return this.httpClient.post(`${this.baseUrl}/register`, user);
  }

  public loginUser(email: string, password: string, headers: HttpHeaders): Observable<any> {
    return this.httpClient.post<any>(`${this.baseUrl}/login`, {}, { headers, withCredentials: true });
  }

  // setUser(user: any) {
  //   this.actualUser = user;
  // }
  // getUser(): User {
  //   return this.actualUser;
  // }

  getAllUsers(): Observable<User[]> {
    return this.httpClient.get<User[]>(`${this.baseUrl}/users`);
  }

  getUserById(iduser: string): Observable<User> {
    return this.httpClient.get<User>(`${this.baseUrl}/users/${iduser}`);
  }

  updateUser(iduser: string, user: User): Observable<User> {
    return this.httpClient.put<User>(`${this.baseUrl}/users/${iduser}`, user);
  }

  deleteUser(user: User): Observable<void> {
    return this.httpClient.delete<void>(`${this.baseUrl}/users/${user.iduser}`);
  }
}

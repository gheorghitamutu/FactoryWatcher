import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {formatDate} from "@angular/common";
@Injectable({
  providedIn: 'root'
})
export class ApiService {
  headers: HttpHeaders
  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders();
    this.headers.append('Access-Control-Allow-Origin', '*');
  }

  postPerson(data: any) {
    let theDate = new Date(data['date_of_birth']);
    data['date_of_birth'] = formatDate(theDate, 'dd/MM/yyyy', 'en-US').toString();
    return this.http.post<any>("http://localhost:8081/clients", data, {headers: this.headers});
  }

  getPersons() {
    let result = this.http.get<any>("http://localhost:5000/api/v1/temperatures", {headers: this.headers});
    console.log("test");
    console.log(result);
    return result;
  }

  putPerson(data: any, id: number) {
    let theDate = new Date(data['date_of_birth']);
    data['date_of_birth'] = formatDate(theDate, 'dd/MM/yyyy', 'en-US').toString();
    return this.http.put<any>("http://localhost:8081/clients/" + id, data, {headers: this.headers});
  }

  deletePerson(id: number) {
    return this.http.delete<any>("http://localhost:8081/clients/" + id, {headers: this.headers});
  }

  getNewsByPersons() {
    return this.http.get<any>("http://localhost:8081/news_clients", {headers: this.headers});
  }
}

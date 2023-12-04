import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {formatDate} from "@angular/common";

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  headers: HttpHeaders
  constructor(private http: HttpClient) {
    this.headers = new HttpHeaders();
    this.headers.append('Access-Control-Allow-Origin', '*');
  }

  getFlightsByFilters(filters: any) {
    console.log(filters);
    let theDate = new Date(filters['date']);
    filters['date'] = formatDate(theDate, 'yyyy-MM-dd', 'en-US').toString();

    let url = "http://localhost:8081/flights/" + filters['type'] + '/'
      + filters['iata_code'] + '/' + filters['date']

    return this.http.get<any>(url, {headers: this.headers});
  }

  getNewsAbout(company: any) {
    let computedName = company.split(' ').join('_');
    let url = 'http://localhost:8081/news/' + computedName;
    console.log(url);
    return this.http.get<any>(url, {headers: this.headers});
  }
}

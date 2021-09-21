import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Resolution } from '../model/resolution';


@Injectable({
  providedIn: 'root'
})
export class ResolutionService {

  private resolutionsUrl: string;

  constructor(private http: HttpClient) {
    this.resolutionsUrl = 'http://localhost:8080/im-day'
  }

  public findAll(): Observable<Resolution[]> {
    return this.http.get<Resolution[]>(this.resolutionsUrl);
  }

  public save(resolution: Resolution){
    return this.http.post<Resolution>(this.resolutionsUrl, resolution);
  }
}

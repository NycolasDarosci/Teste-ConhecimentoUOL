import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Resolution } from '../model/resolution';
import { environment } from 'src/environments/environment';


@Injectable({
  providedIn: 'root'
})
export class ResolutionService {

  private resolutionsUrl = environment.apiUrl;

  constructor(private http: HttpClient) { }

  public getResolutions(): Observable<Resolution[]> {
    return this.http.get<Resolution[]>(`${this.resolutionsUrl}/im-day`);
  }

  public addResolution(resolution: Resolution): Observable<Resolution>{
    return this.http.post<Resolution>(`${this.resolutionsUrl}/im-day/add`, resolution);
  }
}

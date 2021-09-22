import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Resolution } from './model/resolution';
import { ResolutionService } from './service/resolution.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  // vai manter todos os resolutions do back
  // vai manter todos os resolutions do back
  public resolutions: Resolution[] = [] ;

  // injetando o service Resolution
  constructor(private resolutionService: ResolutionService){}
  
  ngOnInit(){
    this.getResolutions();
  }

  // notifica todas as vezes que algum dado vem do backend
  public getResolutions(): void {
    this.resolutionService.getResolutions().subscribe(
      (response: Resolution[]) => {
        this.resolutions = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    )
  }
}

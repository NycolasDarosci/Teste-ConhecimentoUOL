import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Resolution } from '../model/resolution';
import { ResolutionService } from '../service/resolution.service';

@Component({
  selector: 'app-resolution-form',
  templateUrl: './resolution-form.component.html',
  styleUrls: ['./resolution-form.component.css']
})
export class ResolutionFormComponent implements OnInit {

  resolution: Resolution;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private resolutionService: ResolutionService
    ) {
      this.resolution = new Resolution(); 
    }

  onSubmit(){
    this.resolutionService.save(this.resolution).subscribe(result => this.goToResolutionList());
  }  

  goToResolutionList(){
    this.router.navigate(['/resolutions']);
  }

  ngOnInit(): void {
  }

}

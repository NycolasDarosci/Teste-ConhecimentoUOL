import { Component, OnInit } from '@angular/core';
import { Resolution } from '../model/resolution';
import { ResolutionService } from '../service/resolution.service';

@Component({
  selector: 'app-resolution-list',
  templateUrl: './resolution-list.component.html',
  styleUrls: ['./resolution-list.component.css']
})

export class ResolutionListComponent implements OnInit {

  resolutions: Resolution[];

  constructor(private resolutionService: ResolutionService) { }

  ngOnInit() {
    this.resolutionService.findAll().subscribe(data => {
      this.resolutions = data;
    })
  }

}

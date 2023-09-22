import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Objective, User } from 'src/app/models/user.model';
import { ObjetiveService } from 'src/app/services/objetives.service';
import { ProfileService } from 'src/app/services/profile.service';

@Component({
  selector: 'app-objetives-details',
  templateUrl: './objetives-details.component.html',
  styleUrls: ['./objetives-details.component.scss']
})
export class ObjetivesDetailsComponent implements OnInit{

  actualUser: User | undefined;
  actualObjetive: Objective | undefined;

  constructor(private profileService: ProfileService, private route: ActivatedRoute,private objetiveService: ObjetiveService) { }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const objetiveId = params.get('id');
      if (objetiveId) {
        this.objetiveService.getObjetiveById((objetiveId)).subscribe(
          objetive => {
            this.actualObjetive = objetive;
            console.log(objetive);
          },
          error => {
            console.error('Error al obtener el usuario:', error);
          }
        );
      }
    });
}}

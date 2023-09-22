import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Objective, Register, User } from 'src/app/models/user.model';
import { ProfileService } from 'src/app/services/profile.service';

@Component({
  selector: 'app-registers',
  templateUrl: './registers.component.html',
  styleUrls: ['./registers.component.scss']
})
export class RegistersComponent {
  actualUser: User | undefined;

  objetives: Objective |undefined;

  register: Register | undefined;

  selectedIdobjetive: number | undefined;

  constructor(private profileService: ProfileService, private route: ActivatedRoute) { }

  verDetalleObjetive(idobjetive: number) {
    this.selectedIdobjetive = idobjetive;
  }

  ngOnInit(): void {
    this.route.paramMap.subscribe(params => {
      const userId = params.get('id');
      if (userId) {
        this.profileService.getUserById((userId)).subscribe(
          user => {
            this.actualUser = user;
            console.log(user);
          },
          error => {
            console.error('Error al obtener el usuario:', error);
          }
        );
      }
    });
  }
}

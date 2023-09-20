import { Component } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProfileService } from 'src/app/services/profile.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-register',
  templateUrl: './form-register.component.html',
  styleUrls: ['./form-register.component.scss']
})
export class FormRegisterComponent {

  formregister!: FormGroup;

  constructor(private usersService: ProfileService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.formregister = this.formBuilder.group({
      email: ['', Validators.email],
      password: ['', [Validators.required, Validators.minLength(4)]]
    });
  }

  register() {
    if (this.formregister.valid) {
      const email = this.formregister.get('email')?.value;
      const password = this.formregister.get('password')?.value;

      this.usersService.registerUser({ email, password })
        .subscribe(
          (response) => {
            console.log('Usuario registrado con éxito:', response);
            this.router.navigate(['/profile']);
          },
          (error) => {
            console.error('Error al registrar usuario:', error);
          }
        );
    }
  }
}

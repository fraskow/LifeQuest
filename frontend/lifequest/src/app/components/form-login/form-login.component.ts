import { Component } from '@angular/core';
import { HttpHeaders } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProfileService } from 'src/app/services/profile.service';
import { Router } from '@angular/router';
import { User } from 'src/app/models/user.model';


@Component({
  selector: 'app-form-login',
  templateUrl: './form-login.component.html',
  styleUrls: ['./form-login.component.scss']
})

export class FormLoginComponent {
  formlogin!: FormGroup;
  errorMessage: string | null = null; // Variable para mostrar mensajes de error

  constructor(private usersService: ProfileService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit() {
    this.formlogin = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', [Validators.required, Validators.minLength(4)]]
    });
  }

  login() {
    this.errorMessage = null;

    if (this.formlogin.invalid) {
      return;
    }

    const username = this.formlogin.value.username;
    const password = this.formlogin.value.password;

    const authHeader = 'Basic ' + btoa(username + ':' + password);
    const headers = new HttpHeaders({ 'Authorization': authHeader });

    this.usersService.loginUser(username, password, headers).subscribe(
      (data) => {
        console.log(data);
        this.getUserId(username).subscribe((userId) => {
          console.log(userId);
          this.router.navigate(['/profile', userId]);
        });
      },
      (error) => {
        console.error('Login error:', error);
        if (error.status === 401) {
          this.errorMessage = 'Credenciales incorrectas. Por favor, verifica tus datos.';
        } else {
          this.errorMessage = 'Hubo un error en el inicio de sesión. Por favor, intenta de nuevo más tarde.';
        }
      }
    );
  }
  getUserId(email: string){
    return this.usersService.getUserIdByEmail(email)
  }
}

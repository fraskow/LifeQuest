import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RegistersFormComponent } from './registers-form.component';

describe('RegistersFormComponent', () => {
  let component: RegistersFormComponent;
  let fixture: ComponentFixture<RegistersFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [RegistersFormComponent]
    });
    fixture = TestBed.createComponent(RegistersFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

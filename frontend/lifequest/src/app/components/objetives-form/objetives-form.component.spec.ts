import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObjetivesFormComponent } from './objetives-form.component';

describe('ObjetivesFormComponent', () => {
  let component: ObjetivesFormComponent;
  let fixture: ComponentFixture<ObjetivesFormComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ObjetivesFormComponent]
    });
    fixture = TestBed.createComponent(ObjetivesFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

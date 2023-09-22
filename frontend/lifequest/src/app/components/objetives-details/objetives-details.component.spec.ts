import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ObjetivesDetailsComponent } from './objetives-details.component';

describe('ObjetivesDetailsComponent', () => {
  let component: ObjetivesDetailsComponent;
  let fixture: ComponentFixture<ObjetivesDetailsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ObjetivesDetailsComponent]
    });
    fixture = TestBed.createComponent(ObjetivesDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

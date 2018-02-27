import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlAllergyComponent } from './ml-allergy.component';

describe('MlAllergyComponent', () => {
  let component: MlAllergyComponent;
  let fixture: ComponentFixture<MlAllergyComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlAllergyComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlAllergyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

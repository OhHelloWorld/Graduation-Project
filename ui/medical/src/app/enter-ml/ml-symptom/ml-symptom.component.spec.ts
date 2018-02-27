import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlSymptomComponent } from './ml-symptom.component';

describe('MlSymptomComponent', () => {
  let component: MlSymptomComponent;
  let fixture: ComponentFixture<MlSymptomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlSymptomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlSymptomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

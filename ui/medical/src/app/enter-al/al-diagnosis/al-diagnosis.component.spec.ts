import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlDiagnosisComponent } from './al-diagnosis.component';

describe('AlDiagnosisComponent', () => {
  let component: AlDiagnosisComponent;
  let fixture: ComponentFixture<AlDiagnosisComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlDiagnosisComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlDiagnosisComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlDiseaseComponent } from './ml-disease.component';

describe('MlDiseaseComponent', () => {
  let component: MlDiseaseComponent;
  let fixture: ComponentFixture<MlDiseaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlDiseaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlDiseaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

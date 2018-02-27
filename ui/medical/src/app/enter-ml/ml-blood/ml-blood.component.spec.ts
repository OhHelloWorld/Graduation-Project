import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlBloodComponent } from './ml-blood.component';

describe('MlBloodComponent', () => {
  let component: MlBloodComponent;
  let fixture: ComponentFixture<MlBloodComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlBloodComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlBloodComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

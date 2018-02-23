import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiseaseCaseComponent } from './disease-case.component';

describe('DiseaseCaseComponent', () => {
  let component: DiseaseCaseComponent;
  let fixture: ComponentFixture<DiseaseCaseComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiseaseCaseComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiseaseCaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

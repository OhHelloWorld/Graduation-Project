import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlExamComponent } from './al-exam.component';

describe('AlExamComponent', () => {
  let component: AlExamComponent;
  let fixture: ComponentFixture<AlExamComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlExamComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlExamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

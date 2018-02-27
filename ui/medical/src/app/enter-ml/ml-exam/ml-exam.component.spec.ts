import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlExamComponent } from './ml-exam.component';

describe('MlExamComponent', () => {
  let component: MlExamComponent;
  let fixture: ComponentFixture<MlExamComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlExamComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlExamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

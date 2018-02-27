import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlFourComponent } from './ml-four.component';

describe('MlFourComponent', () => {
  let component: MlFourComponent;
  let fixture: ComponentFixture<MlFourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlFourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlFourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

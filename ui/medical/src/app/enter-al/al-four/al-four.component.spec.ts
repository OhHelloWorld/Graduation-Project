import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlFourComponent } from './al-four.component';

describe('AlFourComponent', () => {
  let component: AlFourComponent;
  let fixture: ComponentFixture<AlFourComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlFourComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlFourComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

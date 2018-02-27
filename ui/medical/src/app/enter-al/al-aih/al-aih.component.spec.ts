import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlAihComponent } from './al-aih.component';

describe('AlAihComponent', () => {
  let component: AlAihComponent;
  let fixture: ComponentFixture<AlAihComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlAihComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlAihComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlPersonComponent } from './al-person.component';

describe('AlPersonComponent', () => {
  let component: AlPersonComponent;
  let fixture: ComponentFixture<AlPersonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlPersonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlPersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlPersonComponent } from './ml-person.component';

describe('MlPersonComponent', () => {
  let component: MlPersonComponent;
  let fixture: ComponentFixture<MlPersonComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlPersonComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlPersonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

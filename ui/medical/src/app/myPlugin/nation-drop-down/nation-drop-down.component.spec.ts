import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NationDropDownComponent } from './nation-drop-down.component';

describe('NationDropDownComponent', () => {
  let component: NationDropDownComponent;
  let fixture: ComponentFixture<NationDropDownComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NationDropDownComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NationDropDownComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

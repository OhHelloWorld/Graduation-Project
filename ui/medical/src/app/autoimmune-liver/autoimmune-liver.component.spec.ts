import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AutoimmuneLiverComponent } from './autoimmune-liver.component';

describe('AutoimmuneLiverComponent', () => {
  let component: AutoimmuneLiverComponent;
  let fixture: ComponentFixture<AutoimmuneLiverComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AutoimmuneLiverComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AutoimmuneLiverComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

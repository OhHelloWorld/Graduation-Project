import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlDrinkComponent } from './ml-drink.component';

describe('MlDrinkComponent', () => {
  let component: MlDrinkComponent;
  let fixture: ComponentFixture<MlDrinkComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlDrinkComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlDrinkComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

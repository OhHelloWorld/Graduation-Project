import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MedicineLiverComponent } from './medicine-liver.component';

describe('MedicineLiverComponent', () => {
  let component: MedicineLiverComponent;
  let fixture: ComponentFixture<MedicineLiverComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MedicineLiverComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MedicineLiverComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

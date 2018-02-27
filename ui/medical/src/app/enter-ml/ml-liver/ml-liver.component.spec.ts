import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MlLiverComponent } from './ml-liver.component';

describe('MlLiverComponent', () => {
  let component: MlLiverComponent;
  let fixture: ComponentFixture<MlLiverComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MlLiverComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MlLiverComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

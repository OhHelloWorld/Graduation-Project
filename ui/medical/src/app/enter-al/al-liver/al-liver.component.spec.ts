import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlLiverComponent } from './al-liver.component';

describe('AlLiverComponent', () => {
  let component: AlLiverComponent;
  let fixture: ComponentFixture<AlLiverComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlLiverComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlLiverComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

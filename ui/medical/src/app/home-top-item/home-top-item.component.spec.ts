import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HomeTopItemComponent } from './home-top-item.component';

describe('HomeTopItemComponent', () => {
  let component: HomeTopItemComponent;
  let fixture: ComponentFixture<HomeTopItemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HomeTopItemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeTopItemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

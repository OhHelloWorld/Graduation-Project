import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlTongueComponent } from './al-tongue.component';

describe('AlTongueComponent', () => {
  let component: AlTongueComponent;
  let fixture: ComponentFixture<AlTongueComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlTongueComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlTongueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

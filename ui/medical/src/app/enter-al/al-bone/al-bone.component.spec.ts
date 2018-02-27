import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AlBoneComponent } from './al-bone.component';

describe('AlBoneComponent', () => {
  let component: AlBoneComponent;
  let fixture: ComponentFixture<AlBoneComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AlBoneComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AlBoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

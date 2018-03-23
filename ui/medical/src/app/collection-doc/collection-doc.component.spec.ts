import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CollectionDocComponent } from './collection-doc.component';

describe('CollectionDocComponent', () => {
  let component: CollectionDocComponent;
  let fixture: ComponentFixture<CollectionDocComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CollectionDocComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CollectionDocComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

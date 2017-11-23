import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CsheaderComponent } from './csheader.component';

describe('CsheaderComponent', () => {
  let component: CsheaderComponent;
  let fixture: ComponentFixture<CsheaderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CsheaderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CsheaderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

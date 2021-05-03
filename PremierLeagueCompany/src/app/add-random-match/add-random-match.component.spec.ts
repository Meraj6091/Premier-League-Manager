import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddRandomMatchComponent } from './add-random-match.component';

describe('AddRandomMatchComponent', () => {
  let component: AddRandomMatchComponent;
  let fixture: ComponentFixture<AddRandomMatchComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddRandomMatchComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddRandomMatchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateclubComponent } from './createclub.component';

describe('CreateclubComponent', () => {
  let component: CreateclubComponent;
  let fixture: ComponentFixture<CreateclubComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateclubComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateclubComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PremierLeaguetableComponent } from './premier-leaguetable.component';

describe('PremierLeaguetableComponent', () => {
  let component: PremierLeaguetableComponent;
  let fixture: ComponentFixture<PremierLeaguetableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PremierLeaguetableComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PremierLeaguetableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

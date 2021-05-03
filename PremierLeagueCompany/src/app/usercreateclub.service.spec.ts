import { TestBed } from '@angular/core/testing';

import { UsercreateclubService } from './usercreateclub.service';

describe('UsercreateclubService', () => {
  let service: UsercreateclubService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UsercreateclubService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

import { TestBed } from '@angular/core/testing';

import { UseraddmatchService } from './useraddmatch.service';

describe('UseraddmatchService', () => {
  let service: UseraddmatchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UseraddmatchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

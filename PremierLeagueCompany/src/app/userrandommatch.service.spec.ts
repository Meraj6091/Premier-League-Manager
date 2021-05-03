import { TestBed } from '@angular/core/testing';

import { UserrandommatchService } from './userrandommatch.service';

describe('UserrandommatchService', () => {
  let service: UserrandommatchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UserrandommatchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});

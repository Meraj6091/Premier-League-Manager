import { Random } from './add-random-match/randommatch';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class UserrandommatchService {
  constructor(private http:HttpClient) { }
  

  public dorandom(Random){
    return this.http.post<Random[]>("http://localhost:8080/random",Random,{responseType:'text' as 'json'})

  }
}

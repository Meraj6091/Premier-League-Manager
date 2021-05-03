import { Match } from './add-match/match';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class UseraddmatchService {
  constructor(private http:HttpClient) { }
  

  public doaddmatch(Match){
    return this.http.post<Match[]>("http://localhost:8080/addMatch",Match,{responseType:'text' as 'json'})

  }
}

import { Search } from './search-match/searchmatch';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class SearchMatchService {
 
  constructor(private http:HttpClient) { }
  

  public dosearch(Search){
    return this.http.post<Search[]>("http://localhost:8080/searchMatch",Search,{responseType:'text' as 'json'})

  }
  
}

import { User } from './user';
import { Injectable } from '@angular/core';
import { clubdata } from './clubdata';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class UsercreateclubService {
  constructor(private http:HttpClient) { }
  

  public docreateclub(User){
    return this.http.post<User[]>("http://localhost:8080/output",User,{responseType:'text' as 'json'})

  }
}

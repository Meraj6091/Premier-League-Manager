import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'app-premier-leaguetable',
  templateUrl: './premier-leaguetable.component.html',
  styleUrls: ['./premier-leaguetable.component.css']
})
export class PremierLeaguetableComponent implements OnInit {
  
  premierleaguetables:any;
  constructor(private http:HttpClient) { }

  ngOnInit(){
   let response= this.http.get("http://localhost:8080/table");
  response.subscribe((data)=>this.premierleaguetables=data);
  }

}

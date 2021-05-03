import { Component, OnInit } from '@angular/core';
import{HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-goals',
  templateUrl: './goals.component.html',
  styleUrls: ['./goals.component.css']
})
export class GoalsComponent implements OnInit {

  Goal:any;

  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    let response=this.http.get("http://localhost:8080/Goals");
    response.subscribe((data)=>this.Goal=data);
  }

}

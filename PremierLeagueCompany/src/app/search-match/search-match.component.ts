import { SearchMatchService } from './../search-match.service';
import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Search } from './searchmatch';
@Component({
  selector: 'app-search-match',
  templateUrl: './search-match.component.html',
  styleUrls: ['./search-match.component.css']
})
export class SearchMatchComponent implements OnInit {
  search:Search=new Search("");
  message:any;
  viewmatches:any;
    constructor(private service1:SearchMatchService,private http:HttpClient) { }
   
    public SeatchMatch(){
      let response=this.service1.dosearch(this.search);
      response.subscribe((data)=>this.message=data);
      
    }
    
    ngOnInit(): void {
      let response= this.http.get("http://localhost:8080/Get");
    response.subscribe((data)=>this.viewmatches=data);
    }
    refresh(): void { window.location.reload(); }

}

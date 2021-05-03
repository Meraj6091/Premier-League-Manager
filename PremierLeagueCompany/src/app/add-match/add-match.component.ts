import { UserrandommatchService } from './../userrandommatch.service';
import { Random } from '../add-random-match/randommatch';
import { Match } from './match';
import { UseraddmatchService } from './../useraddmatch.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-match',
  templateUrl: './add-match.component.html',
  styleUrls: ['./add-match.component.css']
})
export class AddMatchComponent implements OnInit {

  match:Match=new Match("","","","","");
 
  message:any;
    constructor(private service:UseraddmatchService) { }
   
    ngOnInit(){
    }
  
  
    public addmatch(){
      let response=this.service.doaddmatch(this.match);
      response.subscribe((data)=>this.message=data);
      // alert(this.message);
    }


}

import { UserrandommatchService } from './../userrandommatch.service';
import { Random } from './randommatch';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-add-random-match',
  templateUrl: './add-random-match.component.html',
  styleUrls: ['./add-random-match.component.css']
})
export class AddRandomMatchComponent implements OnInit {

  random:Random=new Random("");
  message:any;
    constructor(private service2:UserrandommatchService) { }
   
    ngOnInit(){
    }
  
    public RandoMatch(){
      let response=this.service2.dorandom(this.random);
      response.subscribe((data)=>this.message=data);
     
    }
}

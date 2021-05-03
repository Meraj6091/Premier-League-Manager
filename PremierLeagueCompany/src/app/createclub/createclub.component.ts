import { UsercreateclubService } from './../usercreateclub.service';
import { clubdata } from './../clubdata';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-createclub',
  templateUrl: './createclub.component.html',
  styleUrls: ['./createclub.component.css']
})
export class CreateclubComponent implements OnInit {
  user:clubdata=new clubdata("","");
  message:any;
    constructor(private service:UsercreateclubService) { }
   
    ngOnInit(){
    }
  
  
    public registernow(){
      let response=this.service.docreateclub(this.user);
      response.subscribe((data)=>this.message=data);
     
    }
  
}

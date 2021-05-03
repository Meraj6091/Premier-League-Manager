import { SearchMatchService } from './search-match.service';
import { UserrandommatchService } from './userrandommatch.service';
import { UseraddmatchService } from './useraddmatch.service';
import {HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {AppRoutingModule,routingcomponents} from './app-routing.module'
import { AppComponent } from './app.component';
import { UIComponent } from './ui/ui.component';
import { PremierLeaguetableComponent } from './premier-leaguetable/premier-leaguetable.component';
import { WinsComponent } from './wins/wins.component';
import { GoalsComponent } from './goals/goals.component';
import { ViewMatchesComponent } from './view-matches/view-matches.component';
import { CreateclubComponent } from './createclub/createclub.component';
import { UsercreateclubService } from './usercreateclub.service';
import { FormsModule } from '@angular/forms';
import { AddMatchComponent } from './add-match/add-match.component';
import { AddRandomMatchComponent } from './add-random-match/add-random-match.component';
import { SearchMatchComponent } from './search-match/search-match.component';

@NgModule({
  declarations: [
    AppComponent,
    routingcomponents,
    WinsComponent,
    GoalsComponent,
    ViewMatchesComponent,
    CreateclubComponent,
    AddMatchComponent,
    AddRandomMatchComponent,
    SearchMatchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [UsercreateclubService,UseraddmatchService,UserrandommatchService,SearchMatchService],
  bootstrap: [AppComponent]
})
export class AppModule { }

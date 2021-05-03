import { SearchMatchComponent } from './search-match/search-match.component';
import { AddRandomMatchComponent } from './add-random-match/add-random-match.component';
import { CreateclubComponent } from './createclub/createclub.component';
import { ViewMatchesComponent } from './view-matches/view-matches.component';
import { GoalsComponent } from './goals/goals.component';
import { WinsComponent } from './wins/wins.component';
import { UIComponent } from './ui/ui.component';
import { PremierLeaguetableComponent } from './premier-leaguetable/premier-leaguetable.component';
import { NgModule, Component } from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import { AddMatchComponent } from './add-match/add-match.component';

const routes: Routes=[
    {path: 'premierleaguetable',component:PremierLeaguetableComponent},
    {path: 'ui', component:UIComponent},
    {path: 'wins', component:WinsComponent},
    {path: 'goals', component:GoalsComponent},
    {path: 'viewmatches', component:ViewMatchesComponent},
    {path: 'create', component:CreateclubComponent},
    {path: 'addmatch', component:AddMatchComponent},
    {path: 'random',component:AddRandomMatchComponent},
    {path: 'searchmatch',component:SearchMatchComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule{}
export const routingcomponents=[UIComponent,PremierLeaguetableComponent,WinsComponent,GoalsComponent,ViewMatchesComponent,CreateclubComponent,AddMatchComponent,AddRandomMatchComponent,SearchMatchComponent]
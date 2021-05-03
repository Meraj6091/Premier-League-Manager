export class Match{
    teamA?:String;
    teamB?:String;
    teamAScored?:String;
    teamBScored?:String;
    date?:String;
    constructor(
    teamA:String,
    teamB:String,
    teamAScored:String,
    teamBScored:String,
    date:String,
    
    ){this.teamA=teamA,this.teamB=teamB,this.teamAScored=teamAScored,this.teamBScored=teamBScored,this.date=date}
}
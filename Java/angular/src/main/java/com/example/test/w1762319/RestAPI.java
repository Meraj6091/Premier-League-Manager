package com.example.test.w1762319;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class RestAPI {
   static PremierLeagueManager premierLeagueManager = new PremierLeagueManager();


    @GetMapping("/table")
    public List<FootballClub> getRequest() {
        return premierLeagueManager.football();

    }

        @GetMapping("/viewMatches")
        public List<Match> getRequest1() {
            return premierLeagueManager.match();
        }

        @GetMapping("/Wins")
        public List<FootballClub> getRequest2() {
            return premierLeagueManager.Wins();
        }


        @GetMapping("/Goals")
        public List<FootballClub> getRequest3() {
            return premierLeagueManager.Goals();
        }


        @PostMapping("/output")
        public Object create(@RequestBody FootballClub football) {
            return premierLeagueManager.create(football);
        }

        @PostMapping("/addMatch")
        public Object match(@RequestBody Match match) {
        return premierLeagueManager.match(match);
    }

        @PostMapping("/random")
        public Object random(@RequestBody Match match) {
        return premierLeagueManager.random(match);
    }
        @PostMapping("/searchMatch")
        public Object search(@RequestBody Match match) {
        return premierLeagueManager.search(match);
    }

        @GetMapping("/Get")
        public List<Match> getRequest4() {
        return premierLeagueManager.get();

    }
}

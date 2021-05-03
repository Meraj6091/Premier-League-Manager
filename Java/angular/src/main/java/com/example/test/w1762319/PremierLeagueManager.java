package com.example.test.w1762319;
import org.springframework.stereotype.Component;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
@Component
public class PremierLeagueManager implements LeagueManager {
    private final static Scanner sc = new Scanner(System.in);
    private static List<FootballClub> league1 = new ArrayList<>();
    private static List<FootballClub> wins = new ArrayList<>();
    private static List<FootballClub> goalsScored = new ArrayList<>();
    private static List<Match> MatchData = new ArrayList<>();
    private static List<Match> MatchData2 = new ArrayList<>();

    public void displayMenu() throws IOException, ClassNotFoundException {

        while (true) {
            System.out.println("Press 1 : Create a new football club and add it in the premier league");
            System.out.println("Press 2 : Delete an existing club from the premier league ");
            System.out.println("Press 3 : Display the various statistics for a selected club ");
            System.out.println("Press 4 : Display the Premier League Table ");
            System.out.println("Press 5 : Add a played match ");
            System.out.println("Press 6 : Saving in a file of all the information entered by the user");
            System.out.println("Press 7 : Load back for the file");
            System.out.println("Press 8 : Open GUI");
            System.out.println("Press 9 : To Quit");
            String choice = sc.next();

            switch (choice) {
                case "1":
                    Add();
                    System.out.println(league1);
                    break;
                case "2":
                    Delete();
                    break;
                case "3":
                    Statistics();
                    break;
                case "4":
                    PremierLeagueTable();
                    break;
                case "5":
                    AddAPlayedMatch();
                    break;
                case "6":
                    SaveIntoAFile();
                    break;
                case "7":
                    Load();
                    break;
                case "8":
                    Runtime rt = Runtime.getRuntime();
                    rt.exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:4200/#home");
                    break;
                case "9":
                    System.out.println("Thank you for Using PremierLeagueManager");
                    System.exit(0);

                default:
                    System.out.println("Invalid Input.. Please try Again\n");
            }

        }
    }


    @Override
    public void Add() {
        if (league1.size() == numOfFootballClubs) {
            System.out.println("Sorry, league is Full");
            return;
        } else {
            FootballClub footballClub = new FootballClub();
            System.out.println("Enter the name of the club:");
            String name = sc.next();
            footballClub.setName(name);
            if (league1.contains(footballClub)) {
                System.out.println("Already in the league");
                return;
            } else {
                System.out.println("Enter the Club Location:");
                String location = sc.next();
                footballClub.setLocation(location);
                league1.add(footballClub);
                System.out.println("Added Successfully ");
            }

        }

    }

    @Override
    public void Delete() {
        if (league1.isEmpty()) {
            System.out.println("PremierLeague is empty");
            return;
        }
        System.out.println("Enter the club name:");
        String clubName = sc.next();
        for (FootballClub footballClub : league1) {
            if (footballClub.getName().equals(clubName)) {
                league1.remove(footballClub);
                System.out.printf(footballClub.getName() + " Successfully removed from the league\n");
                return;
            }
        }
        System.out.println("Invalid name");
    }

    @Override
    public void Statistics() {
        if (league1.size() == 0) {
            System.out.println("PremierLeague is Empty");
            return;
        }
        boolean t = false;
        System.out.println("Enter the club name:");
        String name = sc.next();
        for (FootballClub footballClub : league1) {
            if (footballClub.getName().equals(name)) {
                t = true;
                System.out.println("Scored Goals Count: " + footballClub.getScoredGoalsCount());
                System.out.println("Received Goals Count: " + footballClub.getReceivedGoalsCount());
                System.out.println("Currently Points:" + footballClub.getCurrentlyPoints());
                System.out.println("Match Played: " + footballClub.getMatchesPlayed());
                System.out.println("Wins: " + footballClub.getWins());
                System.out.println("Draws: " + footballClub.getDraws());
                System.out.println("Defeats: " + footballClub.getDefeats());
                return;
            }

        }
        if (!t) {
            System.out.println(name + " is not in the PremierLeagueManager");
        }
    }

    @Override
    public void PremierLeagueTable() {
        Collections.sort(league1, new FootballClub());
        if (league1.size() == 0) {
            System.out.println("PremierLeague is Empty");
            return;
        } else {
            for (FootballClub footballClub : league1) {
                System.out.println(footballClub.getName() + " - " + footballClub.getLocation() + " ==== " + "Scored Goals Count:" + footballClub.getScoredGoalsCount() + "  Received Goals Count:" + footballClub.getReceivedGoalsCount() + "  Currently Points:" + footballClub.getCurrentlyPoints());
            }
        }
    }

    @Override
    public void AddAPlayedMatch() {
        if (league1.size() == 0) {
            System.out.println("PremierLeague is Empty");
            return;
        } else {
            boolean t1 = false;
            Match math = new Match();
            String date = null;
            FootballClub A = null;
            FootballClub B = null;
            System.out.println("Enter the Team A:");
            String teamA = sc.next();
            for (FootballClub footballClub : league1) {
                if (footballClub.getName().equals(teamA)) {
                    t1 = true;
                    Date thisDate = new Date();
                    System.out.println("Enter the Date (YYYY/MM/DD)");
                    date = sc.next();
                    try {
                        thisDate = new SimpleDateFormat("YYYY/MM/DD").parse(date);
                        A = footballClub;

                    } catch (ParseException e) {
                        System.out.println("Please input the correct date format");
                        return;
                    }

                }
            }
            if (!t1) {
                System.out.println(teamA + " is not in the PremierLeagueManager");
                return;

            }

            System.out.println("Enter the Team B:");
            String teamB = sc.next();

            boolean t2 = false;
            for (FootballClub footballClub2 : league1) {
                if (footballClub2.getName().equals(teamB)) {
                    t2 = true;
                    B = footballClub2;
                }

            }
            if (!t2) {
                System.out.println(teamB + " is not in the PremierLeagueManager");
                return;

            }
            System.out.println("Enter Team A Score:");
            int score1 = sc.nextInt();
            System.out.println("Enter Team B score");
            int score2 = sc.nextInt();

            String[] DateSplit = date.split("/");
            String day = DateSplit[2];
            String month = DateSplit[1];
            String year = DateSplit[0];
            math.setDate(date);
            math.setDay(Integer.parseInt(day));
            math.setMonth(Integer.parseInt(month));
            math.setYear(Integer.parseInt(year));
            math.setTeamA(teamA);
            math.setTeamB(teamB);
            math.setTeamAScored(score1);
            math.setTeamBScored(score2);
            MatchData.add(math);

            if (score1 > score2) {
                A.setCurrentlyPoints(A.getCurrentlyPoints() + 3);
                A.setWins(A.getWins() + 1);
                A.setScoredGoalsCount(score1);
                A.setReceivedGoalsCount(score2);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);
                B.setDefeats(B.getDefeats() + 1);
                B.setReceivedGoalsCount(score1);
                B.setScoredGoalsCount(score2);


            } else if (score1 < score2) {
                B.setCurrentlyPoints(B.getCurrentlyPoints() + 3);
                B.setWins(A.getWins() + 1);
                B.setScoredGoalsCount(score2);
                B.setReceivedGoalsCount(score1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                A.setDefeats(A.getDefeats() + 1);
                A.setReceivedGoalsCount(score2);
                A.setScoredGoalsCount(score1);


            } else if (score1 == score2) {
                A.setScoredGoalsCount(score1);
                A.setReceivedGoalsCount(score2);
                B.setScoredGoalsCount(score2);
                B.setReceivedGoalsCount(score1);
                A.setCurrentlyPoints(A.getCurrentlyPoints() + 1);
                B.setCurrentlyPoints(B.getCurrentlyPoints() + 1);
                A.setDraws(A.getDraws() + 1);
                B.setDraws(B.getDraws() + 1);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);

            }


        }


    }

    @Override
    public void SaveIntoAFile() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("football.txt"));
        for (FootballClub footballClub : league1) {
            os.writeObject(footballClub);

        }
        ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("match.txt"));
        for (Match match : MatchData) {
            os2.writeObject(match);

        }
        os.close();
        os2.close();
        System.out.println("successfully saved");

    }

    @Override
    public void Load() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("football.txt");
        FileInputStream fileInputStream2 = new FileInputStream("match.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ObjectInputStream objectInputStream2 = new ObjectInputStream(fileInputStream2);
        for (; ; ) {
            try {
                league1.add((FootballClub) objectInputStream.readObject());
                //MatchData.add((Match) objectInputStream.readObject());
            } catch (EOFException e) {
                break;
            }

        }
        for (; ; ) {
            try {
                MatchData.add((Match) objectInputStream2.readObject());
                //MatchData.add((Match) objectInputStream.readObject());
            } catch (EOFException e) {
                break;
            }

        }
        System.out.println("successfully loaded");


    }

    @Override
    public List<FootballClub> football() {
        Collections.sort(league1, new FootballClub());
        return league1;
    }

    @Override
    public List<Match> match() {
        Collections.sort(MatchData, new CustomDateComparator());
        return MatchData;
    }

    @Override
    public List<FootballClub> Wins() {
        Collections.sort(league1, new CustomWinsComparator());
        return league1;
    }

    @Override
    public List<FootballClub> Goals() {
        Collections.sort(league1, new CustomScoreComparator());
        return league1;
    }

    @Override
    public Object create(FootballClub football) {
        System.out.println(football);
        if (football.getName().equals("") || football.getLocation().equals("")) {
            String message3 = "Fill The Following Requirements";
            return message3;
        } else if (league1.contains(football)) {
            String message = "Already in the league";
            return message;
        }
        league1.add(football);
        System.out.println(football);
        String message2 = "Successfully Added";
        return message2;
    }

    @Override
    public Object match(Match match) {
        if (league1.size() == 0) {
            String message = "Premier League Is Empty";
            return message;
        } else if (match.getDate().equals("") || match.getTeamA().equals("") || match.getTeamB().equals("") || match.getTeamAScored() == 0 || match.getTeamBScored() == 0) {
            String message3 = "Fill The Following Requirements";
            return message3;
        }
        else {
            boolean t1 = false;
            //Match math = new Match();
            String date = null;
            FootballClub A = null;
            FootballClub B = null;

            for (FootballClub footballClub : league1) {
                if (footballClub.getName().equals(match.getTeamA())) {
                    t1 = true;
                    Date thisDate = new Date();
                    date = match.getDate();
                    try {
                        thisDate = new SimpleDateFormat("YYYY/MM/DD").parse(date);
                        A = footballClub;

                    } catch (ParseException e) {
                        String dateVal=("Please input the correct date format");
                        return dateVal;

                    }

                }
            }
            if (!t1) {
                String teamAVal=(match.getTeamA()+ " is not in the PremierLeagueManager");
                return teamAVal;

            }

            boolean t2 = false;
            for (FootballClub footballClub2 : league1) {
                if (footballClub2.getName().equals(match.getTeamB())) {
                    t2 = true;
                    B = footballClub2;
                }

            }
            if (!t2) {
                String teamBVal=(match.getTeamB()+ " is not in the PremierLeagueManager");
                return teamBVal;

            }
            int score1 = Integer.parseInt(String.valueOf(match.getTeamAScored()));
            int score2 = Integer.parseInt(String.valueOf(match.getTeamBScored()));

            String[] DateSplit = date.split("/");
            String day = DateSplit[2];
            String month = DateSplit[1];
            String year = DateSplit[0];
            match.setDate(date);
            match.setDay(Integer.parseInt(day));
            match.setMonth(Integer.parseInt(month));
            match.setYear(Integer.parseInt(year));
            match.setTeamA(match.getTeamA());
            match.setTeamB(match.getTeamB());
            match.setTeamAScored(score1);
            match.setTeamBScored(score2);
            MatchData.add(match);

            if (score1 > score2) {
                A.setCurrentlyPoints(A.getCurrentlyPoints() + 3);
                A.setWins(A.getWins() + 1);
                A.setScoredGoalsCount(score1);
                A.setReceivedGoalsCount(score2);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);
                B.setDefeats(B.getDefeats() + 1);
                B.setReceivedGoalsCount(score1);
                B.setScoredGoalsCount(score2);


            } else if (score1 < score2) {
                B.setCurrentlyPoints(B.getCurrentlyPoints() + 3);
                B.setWins(A.getWins() + 1);
                B.setScoredGoalsCount(score2);
                B.setReceivedGoalsCount(score1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                A.setDefeats(A.getDefeats() + 1);
                A.setReceivedGoalsCount(score2);
                A.setScoredGoalsCount(score1);


            } else if (score1 == score2) {
                A.setScoredGoalsCount(score1);
                A.setReceivedGoalsCount(score2);
                B.setScoredGoalsCount(score2);
                B.setReceivedGoalsCount(score1);
                A.setCurrentlyPoints(A.getCurrentlyPoints() + 1);
                B.setCurrentlyPoints(B.getCurrentlyPoints() + 1);
                A.setDraws(A.getDraws() + 1);
                B.setDraws(B.getDraws() + 1);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);

            }


            String last=("Successfully Added");
            return last;

        }

    }
    @Override
    public Object random(Match match) {
        if (league1.size() == 0) {
            String dateVal = "Premier League Is Empty";
            return dateVal;
        } else if (match.getDate().equals("")) {
            String dateVal1 = "Enter the Date To Continue";
            return dateVal1;
        }
       String date=null;
        Date thisDate = new Date();
        date = match.getDate();
        try {
            thisDate = new SimpleDateFormat("YYYY/MM/DD").parse(date);

        } catch (ParseException e) {
            String dateVal=("Please input the correct date format");
            return dateVal;

        }

            FootballClub A = null;
            FootballClub B = null;

            Random randomA = new Random();
            Random randomB = new Random();
            Random randomS1 = new Random();
            Random randomS2 = new Random();
            int randomIndex;
            int randomIndex2;
            do {
                randomIndex = randomA.nextInt(league1.size());
                randomIndex2 = randomB.nextInt(league1.size());

            }
            while (randomIndex == randomIndex2);

            A = (league1.get(randomIndex));
            B = league1.get(randomIndex2);
            match.setTeamA(league1.get(randomIndex).getName());
            match.setTeamB(league1.get(randomIndex2).getName());

            int teamAS = 1 + randomS1.nextInt(30);
            int teamBS = 1 + randomS2.nextInt(30);
            match.setTeamAScored(teamAS);
            match.setTeamBScored(teamBS);

            String RandomDate = match.getDate();
            String[] DateSplit = RandomDate.split("/");
            String day = DateSplit[2];
            String month = DateSplit[1];
            String year = DateSplit[0];
            match.setDate(match.getDate());
            match.setDay(Integer.parseInt(day));
            match.setMonth(Integer.parseInt(month));
            match.setYear(Integer.parseInt(year));
            MatchData.add(match);

            System.out.println(MatchData);
            if (teamAS > teamBS) {
                A.setCurrentlyPoints(A.getCurrentlyPoints() + 3);
                A.setWins(A.getWins() + 1);
                A.setScoredGoalsCount(teamAS);
                A.setReceivedGoalsCount(teamBS);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);
                B.setDefeats(B.getDefeats() + 1);
                B.setReceivedGoalsCount(teamAS);
                B.setScoredGoalsCount(teamBS);

            } else if (teamAS < teamBS) {
                B.setCurrentlyPoints(B.getCurrentlyPoints() + 3);
                B.setWins(A.getWins() + 1);
                B.setScoredGoalsCount(teamBS);
                B.setReceivedGoalsCount(teamAS);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                A.setDefeats(A.getDefeats() + 1);
                A.setReceivedGoalsCount(teamBS);
                A.setScoredGoalsCount(teamAS);

            } else if (teamAS == teamBS) {
                A.setScoredGoalsCount(teamAS);
                A.setReceivedGoalsCount(teamBS);
                B.setScoredGoalsCount(teamBS);
                B.setReceivedGoalsCount(teamAS);
                A.setCurrentlyPoints(A.getCurrentlyPoints() + 1);
                B.setCurrentlyPoints(B.getCurrentlyPoints() + 1);
                A.setDraws(A.getDraws() + 1);
                B.setDraws(B.getDraws() + 1);
                A.setMatchesPlayed(A.getMatchesPlayed() + 1);
                B.setMatchesPlayed(B.getMatchesPlayed() + 1);

            }
            String random = "Successfully Added";
            return random;

    }
    @Override
    public Object search(Match match) {
        if(league1.size()==0){
            String message = "Premier League is Empty";
            return message;
        }
        MatchData2.clear();
        for (Match match2 : MatchData) {
            if (match2.getDate().equals(match.getDate())) {
                MatchData2.add(match2);
               return match2;

            }

        }
        String random = "Successfully Added";
        return random;
    }
    @Override
    public List<Match> get() {
        return MatchData2;
    }


}



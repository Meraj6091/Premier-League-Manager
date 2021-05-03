package com.example.test.w1762319;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class TestApplication{

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        LeagueManager leagueManager=new PremierLeagueManager();
        SpringApplication.run(TestApplication.class,args);
        leagueManager.displayMenu();
    }

}

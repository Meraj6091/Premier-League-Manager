package com.example.test.w1762319;
import java.io.Serializable;
import java.util.Objects;

public abstract class SportsClub implements Serializable {
    private String name;
    private String location;
    private String statistics;

    @Override
    public boolean equals(Object other){
       return this.name.equals(((SportsClub)other).name);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, location, statistics);
    }

    @Override
    public String toString() {
        return "SportsClub{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", statistics='" + statistics + '\'' +
                '}';
    }
}

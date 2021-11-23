package intermediate.classesandobjects;

import java.util.Random;

public class BasketbalPlayer {

    String name;
    String nickname;
    int yearOfBorn;
    String team;

    double freeThrowPercentage;
    double pointsPreGames;
    int gamesPlayed;

    public BasketbalPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPreGames, int gamesPlayed) {
        this.name = name;
        this.nickname = nickname;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPreGames = pointsPreGames;
        this.gamesPlayed = gamesPlayed;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage){
            System.out.println(name + " failed to score free throw.");
        } else{
            System.out.println(name + " scored free throw.");
        }
    }
}

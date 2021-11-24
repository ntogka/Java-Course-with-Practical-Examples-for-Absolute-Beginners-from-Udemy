package intermediate.polymorfism.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete {

    private double freeThrowPercentage;
    private double pointsPreGames;


    public BasketballPlayer(String name, String nickname, int yearOfBorn, String team, double freeThrowPercentage, double pointsPreGames, int gamesPlayed) {
        super(name, nickname, yearOfBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPreGames = pointsPreGames;
    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage){
            System.out.println(super.getName() + " failed to score free throw.");
        } else{
            System.out.println(super.getName() + " scored free throw.");
        }
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw percentage: " + freeThrowPercentage);
        System.out.println("Points per game: " + pointsPreGames);
    }

    @Override
    public void compete() {
        super.compete();
        freeThrow();
    }

    @Override
    public String getBodyType() {
        return "Tall and lean muscle.";
    }

    public double getFreeThrowPercentage() {
        return freeThrowPercentage;
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public double getPointsPreGames() {
        return pointsPreGames;
    }

    public void setPointsPreGames(double pointsPreGames) {
        this.pointsPreGames = pointsPreGames;
    }
}

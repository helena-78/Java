package edu04.homeworks;
import java.util.Scanner;
import java.lang.Enum;
public enum Season {
    WINTER("winter"), SPRING("spring"), SUMMER("summer"), AUTUMN("autumn");
    private final String en;

    Season(String en) {
        this.en = en;
    }
}

class Faculty {
    private int numberOfStudents;
    private Season currentSeason;

    public Faculty(int numberOfStudents, Season currentSeason) {
        this.numberOfStudents = numberOfStudents;
        this.currentSeason = currentSeason;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Override
    public String toString(){
        return "Faculty { numberOfStudents: "+numberOfStudents+", currentSeason: "+currentSeason+" }";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("input the number of students on the faculty: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();
        System.out.println("input current season: ");
        String seasonInput=sc.nextLine();
        Season currentSeason=switch(seasonInput.toLowerCase()){
            case "winter" -> Season.WINTER;
            case "summer" -> Season.SUMMER;
            case "autumn" -> Season.AUTUMN;
            case "spring" -> Season.SPRING;
            default -> null;
        };
        Faculty faculty=new Faculty(numberOfStudents, currentSeason);
        System.out.println(faculty);
        sc.close();
    }
}

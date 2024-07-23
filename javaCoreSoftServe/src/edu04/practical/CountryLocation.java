package edu04.practical;
import java.util.Scanner;
public enum CountryLocation {
    EUROPE,ASIA,AFRICA,AUSTRALIA,SOUTH_AMERICA,NORTH_AMERICA,ANTARCTICA;
}
class Countries{
    public static void main(String[] args) {
        CountryLocation countryLocation;
        Scanner sc = new Scanner(System.in);
        System.out.println("input country: ");
        String country=sc.nextLine();
        countryLocation=switch(country.toLowerCase()){
            case "usa","canada","mexico" -> CountryLocation.NORTH_AMERICA;
            case "brazil","peru","argentina" -> CountryLocation.SOUTH_AMERICA;
            case "new zealand","uk" -> CountryLocation.ANTARCTICA;
            case "china","india","japan" -> CountryLocation.ASIA;
            case "australia" -> CountryLocation.AUSTRALIA;
            case "nigeria","egypt","south africa" -> CountryLocation.AFRICA;
            case "france","germany","belgium","czech republic" -> CountryLocation.EUROPE;
            default -> null;
        };
        System.out.println(countryLocation);
        sc.close();
    }
}

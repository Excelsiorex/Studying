package enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Season season = Season.randomSeason();
        System.out.println("Season before: " + season);
        season = seasonReverse(season);
        System.out.println("Season after: " + season);

        getInfo(season);
    }

    private static void getInfo(Season season) {
        System.out.println("Inheritance from java.lang.Enum: " + Season.class.getSuperclass());
        System.out.println("Name: " + season.name());
        System.out.println("Ordinal: " + season.ordinal());
        System.out.println("All elements: " + Arrays.toString(Season.values()));
    }

    private static Season seasonReverse(Season season) {
        if (season == Season.SPRING) {
            return Season.AUTUMN;
        } else if (season == Season.AUTUMN) {
            return Season.SPRING;
        } else if (season == Season.SUMMER) {
            return Season.WINTER;
        } else {
            return Season.SUMMER;
        }
    }
}

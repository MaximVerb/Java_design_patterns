package maxim.patterns.behavioral.strategy.interface_strategy_design;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList<>();
        appleList.add(new Apple("red", 201.0));
        appleList.add(new Apple("red", 50.0));
        appleList.add(new Apple("yellow and red", 50.0));

        System.out.println(giveAllApplesAccordingToFilter(appleList, new AppleOnlyHeavy()));
        System.out.println("***************");
        System.out.println(giveAllApplesAccordingToFilter(appleList, new AppleHeavyAndRed()));


    }


    public static List<Apple> giveAllApplesAccordingToFilter(List<Apple> appleList, ApplePredicate ap) {
        List<Apple> filteredList = new ArrayList<>();
        for(Apple apple : appleList) {
            if (ap.test(apple)) {
                filteredList.add(apple);
            }
        }
        return filteredList;
    }
}

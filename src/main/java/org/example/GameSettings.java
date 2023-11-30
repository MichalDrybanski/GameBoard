package org.example;

public interface GameSettings {
    int [] scores = {100, 70, 40, 20, 10};
    int max_ad = 9;
    default void printGameSettings(){
        for(int i = 0; i < scores.length; i++){
            System.out.println("Runda " + (i+ 1) + " Punkty za ta runde: " + scores[i]);
        }
        System.out.println("Punkty za AD (pocieszenie) za rundę bez trafienia: 0-" + max_ad + " punktów");
    }
}

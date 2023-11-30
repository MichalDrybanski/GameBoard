public interface GameSettings {
    int pointsForXRound_1 = 100;
    int pointsForXRound_2 = 70;
    int pointsForXRound_3 = 40;
    int pointsForXRound_4 = 20;
    int pointsForXRound_5 = 10;

    int minScore = 0;
    int maxScore = 9;

    default int getAdScore(int distanceToClosestPoint){
        int difference = 10 - distanceToClosestPoint;
        int adScore = Math.max(minScore, Math.min(maxScore, difference));

        return adScore;
    }
    default void printGameSettings() {
        System.out.println("Punktacja za trafienie punktu X:");
        System.out.println("Runda 1: " + pointsForXRound_1);
        System.out.println("Runda 2: " + pointsForXRound_2);
        System.out.println("Runda 3: " + pointsForXRound_3);
        System.out.println("Runda 4: " + pointsForXRound_4);
        System.out.println("Runda 5: " + pointsForXRound_5);
        System.out.println("Minimalna punktacja 'pocieszenia' (AD): " + minScore);
        System.out.println("Maksymalna punktacja 'pocieszenia' (AD): " + maxScore);
    }
}

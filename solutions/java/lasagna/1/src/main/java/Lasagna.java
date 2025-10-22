public class Lasagna {

    private static final int MINUTES_PER_LAYER = 2;
    
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(final int actualMinutes) {
        return expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(final int numberOfLayers) {
        return MINUTES_PER_LAYER * numberOfLayers;
    }

    public int totalTimeInMinutes(final int numberOfLayers, final int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }

}

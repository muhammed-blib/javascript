package solid;

import java.util.List;
import java.util.Random;

public class TruthOrDare {

    public static void main(String[] args) {
        extracted(List.of("mosup", "raheem", "hasan", "mai", "sama", "yousef", "mohammed", "karim"));
    }

    private static void extracted(List<String> names) {
        int indexOfAskkers = new Random().nextInt(8);
        System.out.println("will ask " + names.get(indexOfAskkers));
        int indexOfAsked = new Random().nextInt(8);
        while (indexOfAskkers == indexOfAsked)
            indexOfAsked = new Random().nextInt(8);

        System.out.println("will be asked " + names.get(indexOfAsked));
    }
}

package ch.itninjas.labs.j7.set.lab1;

import ch.itninjas.utils.OutputValidation;

import java.util.Set;

public class Vereine {

    public static final OutputValidation outputValidation = new OutputValidation();

    static Set<String> fussballVerein = Set.of(
            "Emil", "Hans", "Felix", "Fritz", "Patrick",
            "Hanne", "Anja", "Paula", "Petra", "Anna"
    );

    static Set<String> schwimmVerein = Set.of(
            "Emil", "Klaus", "Paul", "Fritz", "Patrick",
            "Hanne", "Anina", "Nicole", "Petra", "Gerda"
    );

    static Set<String> musikVerein = Set.of(
            "Kari", "Hans", "Max",
            "Karin", "Petra", "Anna"
    );

    static Set<String> tanzVerein = Set.of(
            "Emil", "Hans", "Paul", "Felix", "Max",
            "Lara", "Anja", "Sabine", "Anna"
    );

    public static void main(String[] args) {
        // 1) Wie viele Personen machen min. in einem Verein mit:
        exerciseOne();

        // 2) Alle Personen, welche im Fussball und Tanz Verein sind
        exerciseTwo();

        // 3) Alle Personen, welche im Fussball sind und nicht im Tanz oder Schwimm Verein
        exerciseThree();

        // validation
        outputValidation.printControlHash();
        System.out.println(outputValidation.verifyControlHash(-1421274666));
    }

    // 1) Wie viele Personen machen min. in einem Verein mit:
    private static void exerciseOne() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    // 2) Alle Personen, welche im Fussball und Tanz Verein sind
    private static void exerciseTwo() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    // 3) Alle Personen, welche im Fussball sind und nicht im Tanz oder Schwimm Verein
    private static void exerciseThree() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }
}

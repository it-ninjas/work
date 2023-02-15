package ch.itninjas.labs.j7.map.lab1;

import ch.itninjas.helper.OutputValidation;

import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PlzInfo {
    private static final OutputValidation outputValidation = new OutputValidation();
    private static final String plzResourcePath = "/csv/Postleitzahlen_UTF8.csv";
    // or ISO-8859-1 if the UTF-8 doesn't work.
    // private static String plzResourcePath = "/csv/Postleitzahlen_ISO-8859-1";

    public PlzInfo(String filePath) throws URISyntaxException {
        URL resource = PlzInfo.class.getResource(filePath);
        Path plzPath = Paths.get(resource.toURI());
        readPlzCsv(plzPath);

        System.out.println("------------------------------------------------------------");
        printPlzInfosToConsole();
        System.out.println("------------------------------------------------------------");

        System.out.print("The console output hash is: ");
        outputValidation.printControlHash();
        System.out.printf("It is the same as the control hash: %b%n",
                outputValidation.verifyControlHash(196496747));
    }

    public static void main(String[] args) throws URISyntaxException {
        new PlzInfo(plzResourcePath);
    }

    private void readPlzCsv(Path plzPath) {
    }

    private void printPlzInfosToConsole() {
    }
}

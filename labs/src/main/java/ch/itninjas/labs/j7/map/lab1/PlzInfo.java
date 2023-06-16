package ch.itninjas.labs.j7.map.lab1;

import ch.itninjas.utils.OutputValidation;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Stream;

public class PlzInfo {
    public static final OutputValidation outputValidation = new OutputValidation();
    public static final String plzResourcePath = "/csv/Postleitzahlen_UTF8.csv";
    // or ISO-8859-1 if the UTF-8 doesn't work.
    // public static String plzResourcePath = "/csv/Postleitzahlen_ISO-8859-1";

    HashMap<Integer, String> plzMap = new HashMap<>();

    public static void main(String[] args) throws Exception {
        new PlzInfo(plzResourcePath);
    }

    public PlzInfo(String filePath) throws Exception {
        readPlzCsv(filePath);

        System.out.println("------------------------------------------------------------");
        printPlzInfosToConsole();
        System.out.println("------------------------------------------------------------");

        System.out.print("The console output hash is: ");
        outputValidation.printControlHash();
        System.out.printf("It is the same as the control hash: %b%n",
                outputValidation.verifyControlHash(1768988137));
    }

    public void readPlzCsv(String filePath) throws Exception {
        URL resource = PlzInfo.class.getResource(filePath);
        if(resource == null) {
            throw new Exception(String.format("File path is wrong: '%s'", filePath));
        }

        Path plzPath = Paths.get(resource.toURI());
        try (Stream<String> lines = Files.lines(plzPath, StandardCharsets.UTF_8)) {
            lines.map(String::trim)
                    .filter(line -> !line.isEmpty())
                    .filter(line -> !line.startsWith("\""))
                    .forEach(this::readLine);
        } catch (IOException e) {
            throw new Exception(String.format("Can not read the plz file: '%s'", plzPath.toString()), e);
        }
    }

    public void readLine(String line) {
        String[] values = line.split(",", 2);
        if (values.length == 2) {
            int plz = Integer.parseInt(values[0].trim());
            String city = values[1].trim();
            city = city.substring(1, city.length() - 1).trim();
            plzMap.put(plz, city);
        } else {
            System.out.println("This line can not processed: " + line);
        }
    }

    public void printPlzInfosToConsole() {
        countCities();
        smallestBernPlz();
        highestBernPlz();
        countCityWithMoreThat10Characters();
        countCityWith7Characters();
        countCitiesWithEnt();
        printCitiesWith3Characters();
        countCharactersOfSmallestCityAndSmallestCities();
        countCharactersOfBiggestCityAndHighestCities();
    }

    public void countCities() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void smallestBernPlz() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void highestBernPlz() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void countCityWithMoreThat10Characters() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void countCityWith7Characters() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void countCitiesWithEnt() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void printCitiesWith3Characters() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void countCharactersOfSmallestCityAndSmallestCities() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }

    public void countCharactersOfBiggestCityAndHighestCities() {
        // TODO: implement this method
        outputValidation.logAndPrint("- ...");
    }
}

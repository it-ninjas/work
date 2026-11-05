package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ProfileHelperTest {
  /** Prüft den Abstand und die Auswahl der ähnlichsten Referenz. */
  @Test
  void findsReferenceWithSmallestDistance() {
    int[] measured = {12, 18, 31, 39, 48};
    int[][] references = {
      {5, 10, 15, 20, 25},
      {10, 20, 30, 40, 50},
      {50, 40, 30, 20, 10},
      {12, 12, 12, 12, 12},
      {0, 25, 50, 25, 0}
    };
    assertEquals(1, ProfileHelper.bestMatch(measured, references));
    assertEquals(8, ProfileHelper.distance(measured, references[1]));

    // Diese Marker erzeugen das Ein- und Ausgabebeispiel in der README-Datei.
    System.out.println(
        "<itninja input lab=\"PatternMatch\">\n"
            + "int[] measured = {12, 18, 31, 39, 48};\n"
            + "int[][] references = {\n"
            + "  {5, 10, 15, 20, 25},\n"
            + "  {10, 20, 30, 40, 50},\n"
            + "  {50, 40, 30, 20, 10},\n"
            + "  {12, 12, 12, 12, 12},\n"
            + "  {0, 25, 50, 25, 0}\n"
            + "};\n"
            + "String[] names = {\n"
            + "  \"Langsam\", \"Steigend\", \"Fallend\", \"Konstant\", \"Spitze\"\n"
            + "};\n"
            + "ProfileHelper.printBestMatch(measured, references, names);\n"
            + "</itninja>\n"
            + "<itninja output lab=\"PatternMatch\">\n"
            + "Langsam    Abstand: 73\n"
            + "Steigend  Abstand: 8\n"
            + "Fallend   Abstand: 118\n"
            + "Konstant  Abstand: 88\n"
            + "Spitze    Abstand: 100\n"
            + "Beste Übereinstimmung: Steigend\n"
            + "</itninja>");
  }
}

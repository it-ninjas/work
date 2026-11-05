package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CharacterStatisticsTest {
  /** Prüft die von Gross- und Kleinschreibung unabhängige Zählung. */
  @Test
  void countsLettersCaseInsensitively() {
    int[] counts = CharacterStatistics.countLetters("Java macht Spass!");

    assertEquals(4, counts[0]);
    assertEquals(3, counts['s' - 'a']);
    int total = 0;
    for (int value : counts) {
      total += value;
    }
    assertEquals(14, total);

    // Diese Marker erzeugen das Ein- und Ausgabebeispiel in der README-Datei.
    System.out.println(
        "<itninja input lab=\"CharStatistics\">\n"
            + "CharacterStatistics.printStatistics(\"Java macht Spass!\");\n"
            + "</itninja>\n"
            + "<itninja output lab=\"CharStatistics\">\n"
            + "A |  4 | ####\n"
            + "C |  1 | #\n"
            + "H |  1 | #\n"
            + "J |  1 | #\n"
            + "M |  1 | #\n"
            + "P |  1 | #\n"
            + "S |  3 | ###\n"
            + "T |  1 | #\n"
            + "V |  1 | #\n"
            + "Gesamt: 14\n"
            + "Verschieden: 9\n"
            + "Am häufigsten: A (4)\n"
            + "</itninja>");
  }
}

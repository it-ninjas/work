package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class MatrixHelperTest {
  /** Prüft Blockmittelwerte und die Ausgabe in umgekehrter Zeilenreihenfolge. */
  @Test
  void calculatesBlockAveragesAndPrintsBottomUp() {
    int[][] matrix = MatrixHelper.createMatrix();

    assertEquals(6, MatrixHelper.blockAverage(matrix, 0, 0, 2, 3));
    assertEquals(75, MatrixHelper.blockAverage(matrix, 6, 9, 2, 3));

    ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(outputBuffer, true, StandardCharsets.UTF_8));
      MatrixHelper.printBottomUp(matrix);
    } finally {
      System.setOut(originalOut);
    }
    String bottomUpOutput = outputBuffer.toString(StandardCharsets.UTF_8);
    assertTrue(bottomUpOutput.startsWith(" 70 71 72 73 74 75 76 77 78 79 80 81"));
    assertTrue(bottomUpOutput.contains("  0  1  2  3  4  5  6  7  8  9 10 11"));

    // Diese Marker erzeugen das Ein- und Ausgabebeispiel in der README-Datei.
    System.out.println(
        "<itninja input lab=\"MatrixBlocks\">\n"
            + "int[][] matrix = MatrixHelper.createMatrix();\n"
            + "// Blockbreite: 3 Spalten, Blockhöhe: 2 Zeilen\n"
            + "MatrixHelper.printBlockAverages(matrix, 3, 2);\n"
            + "System.out.println(\"Von unten nach oben:\");\n"
            + "MatrixHelper.printBottomUp(matrix);\n"
            + "</itninja>\n"
            + "<itninja output lab=\"MatrixBlocks\">\n"
            + "  6  9 12 15\n"
            + " 26 29 32 35\n"
            + " 46 49 52 55\n"
            + " 66 69 72 75\n"
            + "Von unten nach oben:\n"
            + bottomUpOutput
            + "</itninja>");
  }
}

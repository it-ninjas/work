package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class PointFileHelperTest {
  /** Prüft das Lesen mehrerer Datensätze inklusive Füllbytes. */
  @Test
  void parsesPaddedRecords() {
    // Header: Kennung "PT" und zwei Datensätze als 32-Bit-Zahl in Little Endian.
    byte[] data = {
      0x50,
      0x54,
      0x02,
      0x00,
      0x00,
      0x00,
      // Datensatz 1: x = 10, y = 20, danach vier Füllbytes.
      0x0A,
      0x00,
      0x14,
      0x00,
      0x00,
      0x00,
      0x00,
      0x00,
      // Datensatz 2: x = -5, y = 30, danach vier Füllbytes.
      (byte) 0xFB,
      (byte) 0xFF,
      0x1E,
      0x00,
      0x00,
      0x00,
      0x00,
      0x00
    };

    assertEquals(8, PointFileHelper.paddedSize(4));
    assertEquals(-5, PointFileHelper.readInt16LittleEndian(data, 14));

    ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    try {
      System.setOut(new PrintStream(outputBuffer, true, StandardCharsets.UTF_8));
      PointFileHelper.printPoints(data);
    } finally {
      System.setOut(originalOut);
    }

    String output = outputBuffer.toString(StandardCharsets.UTF_8);
    assertEquals("Punkte: 2\n1: (10, 20)\n2: (-5, 30)\n", normalizeNewLines(output));

    // Diese Marker erzeugen das Ein- und Ausgabebeispiel in der README-Datei.
    System.out.println(
        "<itninja input lab=\"BinaryFormat\">\n"
            + "byte[] data = {\n"
            + "    // Header: PT und Anzahl Datensätze\n"
            + "    0x50, 0x54, 0x02, 0x00, 0x00, 0x00,\n"
            + "    // Datensatz 1: x = 10, y = 20 und vier Füllbytes\n"
            + "    0x0A, 0x00, 0x14, 0x00, 0x00, 0x00, 0x00, 0x00,\n"
            + "    // Datensatz 2: x = -5, y = 30 und vier Füllbytes\n"
            + "    (byte) 0xFB, (byte) 0xFF, 0x1E, 0x00, 0x00, 0x00, 0x00, 0x00\n"
            + "};\n"
            + "PointFileHelper.printPoints(data);\n"
            + "</itninja>\n"
            + "<itninja output lab=\"BinaryFormat\">\n"
            + output
            + "</itninja>");
  }

  /**
   * Vereinheitlicht Windows- und Unix-Zeilenumbrüche für Vergleiche.
   *
   * @param text zu normalisierender Text
   * @return Text mit Unix-Zeilenumbrüchen
   */
  private static String normalizeNewLines(String text) {
    return text.replace("\r\n", "\n");
  }
}

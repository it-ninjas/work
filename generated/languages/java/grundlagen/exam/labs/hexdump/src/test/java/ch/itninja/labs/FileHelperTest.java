package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class FileHelperTest {

  /** Prüft die Spaltenausrichtung für vollständige und unvollständige Zeilen. */
  @Test
  void printsCompleteAndIncompleteRows() {
    byte[] data = {
      0x49,
      0x54,
      0x2D,
      0x4E,
      0x69,
      0x6E,
      0x6A,
      0x61,
      0x73,
      0x0A,
      0x00,
      0x1F,
      0x20,
      0x7E,
      0x7F,
      (byte) 0xFF,
      0x4A,
      0x61,
      0x76,
      0x61,
      0x21
    };
    String expected =
        """
        00000000  49 54 2D 4E 69 6E 6A 61  73 0A 00 1F 20 7E 7F FF  |IT-Ninjas... ~..|
        00000010  4A 61 76 61 21                                    |Java!|
        """;

    String output = captureHexDump(data);
    assertEquals(normalizeNewLines(expected), normalizeNewLines(output));

    System.out.println("<itninja input lab=\"Hexdump\">");
    System.out.println("byte[] data = { 0x49, 0x54, 0x2D, 0x4E, 0x69, 0x6E, 0x6A, 0x61,");
    System.out.println("                0x73, 0x0A, 0x00, 0x1F, 0x20, 0x7E, 0x7F, (byte) 0xFF,");
    System.out.println("                0x4A, 0x61, 0x76, 0x61, 0x21 };");
    System.out.println("FileHelper.printHexDump(data);");
    System.out.println("</itninja>");
    System.out.println("<itninja output lab=\"Hexdump\">");
    System.out.print(output);
    System.out.println("</itninja>");
  }

  /** Prüft die Grenzen des druckbaren ASCII-Bereichs. */
  @Test
  void convertsOnlyPrintableAsciiCharacters() {
    assertEquals(' ', FileHelper.toPrintableAscii(32));
    assertEquals('~', FileHelper.toPrintableAscii(126));
    assertEquals('.', FileHelper.toPrintableAscii(31));
    assertEquals('.', FileHelper.toPrintableAscii(127));
    assertEquals('.', FileHelper.toPrintableAscii(255));
  }

  /**
   * Führt die Hexdump-Ausgabe aus und fängt sie als Text ab.
   *
   * @param data auszugebende Bytes
   * @return abgefangene Konsolenausgabe
   */
  private static String captureHexDump(byte[] data) {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
      FileHelper.printHexDump(data);
    } finally {
      System.setOut(originalOut);
    }
    return buffer.toString(StandardCharsets.UTF_8);
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

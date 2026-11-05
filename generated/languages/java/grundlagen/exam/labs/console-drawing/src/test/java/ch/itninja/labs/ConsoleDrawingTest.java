package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class ConsoleDrawingTest {
  /** Prüft charakteristische Zeichen von Kreis, Sinuskurve und Verläufen. */
  @Test
  void drawsCircleSineAndBothGradients() {
    PrintStream originalOut = System.out;
    ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();
    try {
      System.setOut(new PrintStream(outputBuffer, true, StandardCharsets.UTF_8));
      ConsoleDrawing.drawFilledCircle(2);
      ConsoleDrawing.drawSine(31, 9);
      ConsoleDrawing.drawGradient(20, " .:-=+*#%@");
      ConsoleDrawing.drawGradient(20, " ░▒▓█");
    } finally {
      System.setOut(originalOut);
    }
    String output = outputBuffer.toString(StandardCharsets.UTF_8);
    assertTrue(output.contains("#####"));
    assertTrue(output.length() - output.replace("*", "").length() > 20);
    assertTrue(output.contains("░"));

    // Diese Marker erzeugen das Ein- und Ausgabebeispiel in der README-Datei.
    System.out.println(
        "<itninja input lab=\"ConsoleDrawing\">\n"
            + "ConsoleDrawing.drawFilledCircle(2);\n"
            + "ConsoleDrawing.drawSine(31, 9);\n"
            + "ConsoleDrawing.drawGradient(20, \" .:-=+*#%@\");\n"
            + "ConsoleDrawing.drawGradient(20, \" ░▒▓█\");\n"
            + "</itninja>\n"
            + "<itninja output lab=\"ConsoleDrawing\">\n"
            + output
            + "</itninja>");
  }
}

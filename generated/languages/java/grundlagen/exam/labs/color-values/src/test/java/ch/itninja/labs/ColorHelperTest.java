package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ColorHelperTest {
  /** Prüft die Farbkanäle und die gewichtete Helligkeitsberechnung. */
  @Test
  void extractsChannelsAndCalculatesBrightness() {
    assertEquals(128, ColorHelper.red(0x80C040));
    assertEquals(192, ColorHelper.green(0x80C040));
    assertEquals(64, ColorHelper.blue(0x80C040));
    assertEquals(158, ColorHelper.brightness(0x80C040));

    // Diese Marker erzeugen das Ein- und Ausgabebeispiel in der README-Datei.
    System.out.println(
        "<itninja input lab=\"ColorValues\">\n"
            + "ColorHelper.printColors(new int[] { 0xFF0000, 0x00FF00, 0x0000FF });\n"
            + "</itninja>\n"
            + "<itninja output lab=\"ColorValues\">\n"
            + "#FF0000  R=255 G=  0 B=  0  Helligkeit= 76\n"
            + "#00FF00  R=  0 G=255 B=  0  Helligkeit=149\n"
            + "#0000FF  R=  0 G=  0 B=255  Helligkeit= 29\n"
            + "</itninja>");
  }
}

package ch.itninja.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/** Liest Binärdateien und stellt deren Bytes als Hexdump dar. */
public class FileHelper {

  /**
   * Liest den vollständigen Inhalt einer Datei.
   *
   * @param fileName Pfad zur Datei
   * @return gelesene Bytes
   * @throws IOException wenn die Datei nicht gelesen werden kann
   */
  static byte[] readFile(String fileName) throws IOException {
    byte[] data = new byte[0];
    // IT-Ninja: Füge hier Deinen Code ein...
    return data;
  }

  /**
   * Gibt Bytes in Zeilen mit Offset-, Hex- und ASCII-Spalte aus.
   *
   * @param data auszugebende Bytes
   */
  static void printHexDump(byte[] data) {
    // IT-Ninja: Füge hier Deinen Code ein...
  }

  /**
   * Wandelt einen druckbaren ASCII-Wert in sein Zeichen um.
   *
   * @param value vorzeichenloser Bytewert zwischen 0 und 255
   * @return ASCII-Zeichen oder ein Punkt für nicht druckbare Werte
   */
  static char toPrintableAscii(int value) {
    char character = '.';
    // IT-Ninja: Füge hier Deinen Code ein...
    return character;
  }
}

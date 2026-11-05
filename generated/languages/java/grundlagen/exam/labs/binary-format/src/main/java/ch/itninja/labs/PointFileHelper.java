package ch.itninja.labs;

/** Liest Header und Datensätze des in dieser Übung definierten Punktformats. */
public class PointFileHelper {
  /**
   * Liest eine vorzeichenbehaftete 16-Bit-Zahl in Little Endian.
   *
   * @param data Quelldaten
   * @param offset Position des niederwertigsten Bytes
   * @return gelesene Zahl
   */
  static int readInt16LittleEndian(byte[] data, int offset) {
    int result = 0;
    // IT-Ninja: Füge hier Deinen Code ein...
    return result;
  }

  /**
   * Liest eine vorzeichenbehaftete 32-Bit-Zahl in Little Endian.
   *
   * @param data Quelldaten
   * @param offset Position des niederwertigsten Bytes
   * @return gelesene Zahl
   */
  static int readInt32LittleEndian(byte[] data, int offset) {
    int result = 0;
    // IT-Ninja: Füge hier Deinen Code ein...
    return result;
  }

  /**
   * Rundet eine Grösse auf das nächste Vielfache von acht auf.
   *
   * @param size ursprüngliche Grösse in Bytes
   * @return aufgefüllte Grösse in Bytes
   */
  static int paddedSize(int size) {
    int result = 0;
    // IT-Ninja: Füge hier Deinen Code ein...
    return result;
  }

  /**
   * Prüft und liest eine Punktdatei und gibt alle Koordinaten aus.
   *
   * @param data vollständiger Inhalt einer Punktdatei
   */
  static void printPoints(byte[] data) {
    // IT-Ninja: Füge hier Deinen Code ein...
  }
}

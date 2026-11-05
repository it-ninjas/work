package ch.itninja.labs;

/** Setzt einzelne Bytes in unterschiedlichen Byte-Reihenfolgen zu Ganzzahlen zusammen. */
public class ByteOrderHelper {
  /**
   * Liest eine vorzeichenlose 16-Bit-Zahl in Little Endian.
   *
   * @param data Quelldaten
   * @param offset Position des niederwertigsten Bytes
   * @return Wert zwischen 0 und 65535
   */
  static int readUInt16LittleEndian(byte[] data, int offset) {
    int result = 0;
    // IT-Ninja: Füge hier Deinen Code ein...
    return result;
  }

  /**
   * Liest eine vorzeichenlose 16-Bit-Zahl in Big Endian.
   *
   * @param data Quelldaten
   * @param offset Position des höherwertigsten Bytes
   * @return Wert zwischen 0 und 65535
   */
  static int readUInt16BigEndian(byte[] data, int offset) {
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
}

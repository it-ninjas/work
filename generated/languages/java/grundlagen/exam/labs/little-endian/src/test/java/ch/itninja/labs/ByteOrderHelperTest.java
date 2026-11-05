package ch.itninja.labs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ByteOrderHelperTest {
  /** Prüft die unterstützten Zahlenbreiten und Byte-Reihenfolgen. */
  @Test
  void readsBothByteOrders() {
    byte[] data = {0x34, 0x12, 0x78, 0x56, 0x34, 0x12};
    assertEquals(4660, ByteOrderHelper.readUInt16LittleEndian(data, 0));
    assertEquals(13330, ByteOrderHelper.readUInt16BigEndian(data, 0));
    assertEquals(305419896, ByteOrderHelper.readInt32LittleEndian(data, 2));
    System.out.println(
        "<itninja input lab=\"LittleEndian\">\n"
            + "byte[] data = { 0x34, 0x12, 0x78, 0x56, 0x34, 0x12 };\n"
            + "ByteOrderHelper.readUInt16LittleEndian(data, 0);\n"
            + "ByteOrderHelper.readUInt16BigEndian(data, 0);\n"
            + "ByteOrderHelper.readInt32LittleEndian(data, 2);\n"
            + "</itninja>");
    System.out.println(
        "<itninja output lab=\"LittleEndian\">\n"
            + "16 Bit Little Endian: 4660\n"
            + "16 Bit Big Endian:    13330\n"
            + "32 Bit Little Endian: 305419896\n"
            + "</itninja>");
  }
}

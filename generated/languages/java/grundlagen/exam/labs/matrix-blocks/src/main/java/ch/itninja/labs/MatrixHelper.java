package ch.itninja.labs;

/** Erstellt und verarbeitet zweidimensionale Zahlenmatrizen. */
public class MatrixHelper {
  /**
   * Erstellt die vorgegebene 8-mal-12-Testmatrix.
   *
   * @return vollständig gefüllte Matrix
   */
  static int[][] createMatrix() {
    int[][] matrix = new int[8][12];
    // IT-Ninja: Füge hier Deinen Code ein...
    return matrix;
  }

  /**
   * Berechnet den ganzzahligen Mittelwert eines rechteckigen Matrixblocks.
   *
   * @param matrix auszuwertende Matrix
   * @param startRow erste Zeile des Blocks
   * @param startColumn erste Spalte des Blocks
   * @param height Höhe des Blocks
   * @param width Breite des Blocks
   * @return ganzzahliger Mittelwert
   */
  static int blockAverage(int[][] matrix, int startRow, int startColumn, int height, int width) {
    int result = 0;
    // IT-Ninja: Füge hier Deinen Code ein...
    return result;
  }

  /**
   * Unterteilt eine Matrix in Blöcke und gibt deren Mittelwerte aus.
   *
   * @param matrix auszuwertende Matrix
   * @param width Breite jedes Blocks
   * @param height Höhe jedes Blocks
   */
  static void printBlockAverages(int[][] matrix, int width, int height) {
    // IT-Ninja: Füge hier Deinen Code ein...
  }

  /**
   * Gibt die Matrix zeilenweise von unten nach oben aus.
   *
   * @param matrix auszugebende Matrix
   */
  static void printBottomUp(int[][] matrix) {
    // IT-Ninja: Füge hier Deinen Code ein...
  }
}

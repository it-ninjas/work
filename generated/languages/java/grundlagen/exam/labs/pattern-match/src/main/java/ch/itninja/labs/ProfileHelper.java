package ch.itninja.labs;

/** Vergleicht Messreihen anhand der Summe ihrer absoluten Abweichungen. */
public class ProfileHelper {
  /**
   * Addiert die absoluten Abweichungen zweier gleich langer Profile.
   *
   * @param measured gemessenes Profil
   * @param reference Referenzprofil
   * @return Summe der absoluten Abweichungen
   */
  static int distance(int[] measured, int[] reference) {
    int distance = 0;
    // IT-Ninja: Füge hier Deinen Code ein...
    return distance;
  }

  /**
   * Bestimmt die Referenz mit dem kleinsten Abstand zum Messprofil.
   *
   * @param measured gemessenes Profil
   * @param references verfügbare Referenzprofile
   * @return Index der besten Referenz
   */
  static int bestMatch(int[] measured, int[][] references) {
    int best = -1;
    // IT-Ninja: Füge hier Deinen Code ein...
    return best;
  }

  /**
   * Gibt die Abstände aller Referenzen und die beste Übereinstimmung aus.
   *
   * @param measured gemessenes Profil
   * @param references verfügbare Referenzprofile
   * @param names Namen der Referenzprofile
   */
  static void printBestMatch(int[] measured, int[][] references, String[] names) {
    // IT-Ninja: Füge hier Deinen Code ein...
  }
}

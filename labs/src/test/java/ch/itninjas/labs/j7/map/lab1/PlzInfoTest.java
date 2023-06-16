package ch.itninjas.labs.j7.map.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlzInfoTest {

    @Test
    void verifyControlHash() throws Exception {
        new PlzInfo(PlzInfo.plzResourcePath);
        assertTrue(PlzInfo.outputValidation.verifyControlHash(1768988137));
    }
}
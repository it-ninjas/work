package ch.itninjas.labs.j7.set.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VereineTest {

    @Test
    void verifyControlHash() {
        Vereine.main(new String[]{});
        assertTrue(Vereine.outputValidation.verifyControlHash(-1421274666));
    }
}
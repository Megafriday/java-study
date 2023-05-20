package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPTest {

    @Test
    void check() {
        assertTrue(new CheckP().check("(test(data)test())"));
        assertFalse(new CheckP().check("((test(data)test()"));
        assertFalse(new CheckP().check("((tes(tdata)test())"));
        assertFalse(new CheckP().check(")(testdata)test())"));
    }
}
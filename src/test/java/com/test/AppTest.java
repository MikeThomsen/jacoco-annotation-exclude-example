package com.test;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    void testHi() {
        new App().sayHi("John");
    }

    @Test
    void testBye() {
        new App().sayBye("Jane");
    }
}

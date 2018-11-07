package edu;

import org.junit.jupiter.api.*;

public class Test1 {

    @BeforeAll
    static void init() {
        System.out.println("Witamy w testach");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("Kolejny test...");
    }


    @Test
    @DisplayName("Test hPa to mmHg")
    void hPaTOmmHg() {
        Assertions.assertEquals(0.75006157584566, CisnienieJednostki.hPaTOmmHg(1));
    }

    @Test
    @DisplayName("Test mmHg to hPa")
    void mmHgTOhPa() {
        Assertions.assertEquals(1.3332238741499935, CisnienieJednostki.mmHgTOhPa(1));
    }
}
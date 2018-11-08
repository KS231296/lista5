package edu;

import org.junit.jupiter.api.*;

public class TestCisnienie {

    @BeforeAll
    static void init() {
        System.out.println("Witamy w testach Ciśnienia");
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



    @Test
    @DisplayName("Test ujemne hPa")
    void ujemnehPa() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> CisnienieJednostki.hPaTOmmHg(-9.8));
    }

    @Test
    @DisplayName("Test ujemne mmHg")
    void ujemnemmHg() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> CisnienieJednostki.mmHgTOhPa(-20.3));
    }
}
package edu;

import org.junit.jupiter.api.*;

public class TestCalc {
    private  SimpleCalc sc;

    @BeforeAll
    static void init(){
        System.out.println("Witamy w testach");
    }

    @BeforeEach
    void beforeTest(){
        System.out.println("Kolejny test...");
    }


    @Test
    @DisplayName("Test +")
    void add(){
        sc = new SimpleCalc();
        Assertions.assertEquals(2, sc.add(1,1));
    }

}

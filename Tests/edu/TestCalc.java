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

    @Test
    @DisplayName("Test / w1")
    void divide(){
        sc = new SimpleCalc();
        Assertions.assertThrows(ArithmeticException.class, ()-> sc.divide(1,0));
    }

//    @Test
//    @DisplayName("Test / w2")
//    void divide() {
//        sc = new SimpleCalc();
//        Assertions.assertEquals(2, sc.divide(4, 2));
//    }

    @Test
    @DisplayName("Test pusty obiekt")
    void isCalcNull(){
        sc = null;
        Assertions.assertNull(sc , "obiekt nie jest pusty");
    }


    @Test
    @DisplayName("Test porównanie referencji")
    void compareCalc(){
        SimpleCalc sc1 = new SimpleCalc();
        SimpleCalc sc2 = new SimpleCalc();
        Assertions.assertNotSame(sc1, sc2);
    }

    @Test
    @DisplayName("Test prawda")
    void isTrue(){
        sc = new SimpleCalc();
        Assertions.assertTrue(sc instanceof SimpleCalc);
    }
}

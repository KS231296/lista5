package edu;


import org.junit.jupiter.api.*;


public class TestLodowka {

    private  Lodowka lodowka;

    @BeforeAll
    static void init(){
        System.out.println("Witamy w testach Lodówki");
    }

    @BeforeEach
    void beforeTest(){
        System.out.println("Kolejny test...");
    }


    @Test
    @DisplayName("Test +")
    void add(){
        lodowka = new Lodowka();
        lodowka.addProduct("mleko");
        Assertions.assertTrue(lodowka.getProducts().contains("mleko"));
    }


    @Test
    @DisplayName("Test - pierwszy")
    void remove() throws NoSuchFieldException {
        lodowka = new Lodowka();
        lodowka.addProduct("mleko");
        lodowka.addProduct("jajka");
        lodowka.removeProduct("mleko");
        Assertions.assertFalse(lodowka.getProducts().contains("mleko"));
    }

    @Test
    @DisplayName("Test - drugi")
    void remoeExc() throws NoSuchFieldException {
        lodowka = new Lodowka();
        lodowka.addProduct("mleko");
        Assertions.assertThrows(NoSuchFieldException.class, ()-> lodowka.removeProduct("jajko"));
    }

    @Test
    @DisplayName("Test not null")
    void notNull() {
        lodowka = new Lodowka();

        Assertions.assertNotNull(lodowka, "lodówka nie jest pusta");
    }

    @Test
    @DisplayName("Test  null")
    void isNull() {
        lodowka = new Lodowka();

        Assertions.assertNull(lodowka, "lodówka jest pusta");
    }


}

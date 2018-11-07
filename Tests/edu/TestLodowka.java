package edu;


public class TestLodowka {

    public static void main(String[] args) {

        Lodowka jedzonko = new Lodowka();

        jedzonko.addProduct("masło");
        jedzonko.addProduct("marchewka");
        jedzonko.addProduct("mleko");
        jedzonko.addProduct("jajka");
        jedzonko.addProduct("ser");
        System.out.println(jedzonko.products);
        jedzonko.removeProduct("mleko");
        System.out.println(jedzonko.products);
    }
}

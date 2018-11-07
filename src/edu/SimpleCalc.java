package edu;

public class SimpleCalc {
    public float add(float n1, float n2){
        System.out.println(n1+n2);
        return n1+n2;

    }

    public float substract(float n1, float n2){
        return n1-n2;
    }

    public float multiply(float n1, float n2){
        return n1*n2;
    }

    public float divide(float n1, float n2) throws ArithmeticException{
        if ((int)n2 ==0) {
            throw new ArithmeticException("cannot divide by 0");
        }
        return n1/n2;
    }
}

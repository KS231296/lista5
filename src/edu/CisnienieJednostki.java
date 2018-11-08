package edu;

public class CisnienieJednostki {
    public static double hPaTOmmHg(double hPa) throws IllegalArgumentException {
        if(hPa < 0){
            throw new IllegalArgumentException("ujemne ciśnienie");
        }
        else{
            return 0.75006157584566 * hPa;
        }
    }

    public static double mmHgTOhPa(double mmHg) throws IllegalArgumentException{
        if(mmHg<0){
            throw new IllegalArgumentException("ujemne ciśnienie");
        }
        else {
            return 1.3332238741499935 * mmHg;
        }
    }
}

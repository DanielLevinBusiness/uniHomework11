/*
this program converts between different units of temperature, i.e Celsius to Kelvin.
the program receives an input form the user, a letter, 'K', 'F' or 'C', all in caps, which represent the unit.
then a space and then a number that represents the value of the temperature

this program was written by:
Daniel Levin
ID: 315048587
*/

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        // receive and input from the user
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char c = word.charAt(0);
        int temp = scan.nextInt();

        // values used in converting from C
        final double addCtoK = 273.15;
        final double multiCtoF = 9.0/5;
        final int addCtoF = 32;

        // values used in converting from F
        final double multiFtoC = 5.0/9;
        final int subFtoC = 32;
        final int subFtoK = 32;
        final double multiFtoK = 5.0/9;
        final double addFtoK = 273.15;

        // values used in converting from K
        final double subKtoC = 273.15;
        final double subKtoF = 273.15;
        final double multiKtoF = 9.0/5;
        final int addKtoF = 32;

        if (c == 'C'){ //received C as input

            // convert from C
            double tempCtoF = temp * multiCtoF + addCtoF;
            double tempCtoK = temp + addCtoK;

            System.out.println(temp + " C");
            System.out.println(tempCtoF + " F");
            System.out.println(tempCtoK + " K");

        }else if (c == 'F'){ //received F as input

            // convert from F
            double tempFtoC = multiFtoC*(temp - subFtoC);
            double tempFtoK = (temp - subFtoK) * multiFtoK + addFtoK;

            System.out.println(tempFtoC + " C");
            System.out.println(temp + " F");
            System.out.println(tempFtoK + " K");

        }else { //received K as input, no other letter then K,F or C can be received as stated in the maman11 notes.

            // convert from K
            double tempKtoC = temp - subKtoC;
            double tempKtoF = (temp - subKtoF) * multiKtoF + addKtoF;

            System.out.println(tempKtoC + " C");
            System.out.println(tempKtoF + " F");
            System.out.println(temp + " K");

        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {





    static void wechselgeldBerechnen(){ // Wechselgeld Betrag in Cent angeben
        final int[] muenzWert = {1,2,5,10,20,50,100,200}; // Liste mit den Wertangaben der Schaechte
        final String[] muenzName = {"1 Cent","2 Cent","5 Cent","10 Cent","20 Cent","50 Cent","1 Euro","2 Euro"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wechselgeldrechner");
        System.out.print("Wie viele Euro?: ");
        int euro = scanner.nextInt();
        System.out.print("Wie viele Cent?: ");
        int cent = scanner.nextInt();

        int wechselgeld = euro * 100 + cent;

        int muenzen,i=7;
        while (wechselgeld>0){
            muenzen = wechselgeld / muenzWert[i];
            if (muenzen>0)
                System.out.println(muenzen +"  "+ muenzName[i]+" Muenze/n ");
            wechselgeld = wechselgeld % muenzWert[i];
            i--; //
        }
    }

    public static void main(String[] args) {
        wechselgeldBerechnen();
    }
}

import java.util.*;

public class vending {
    public static void main(String[] args) {
        System.out.println("CHIPS VENDING MACHINE");
        System.out.println("1. Naturel Chips: €0,90");
        System.out.println("2. Paprika Chips: €0,95");
        System.out.println("3. Kaas Chips: €0,85");
        System.out.println("4. Chocolade Chips: €1,00");

       /*int Naturel = 90;
        int Paprika = 95;
        int Kaas = 85;
        int Chocolade = 100;


        */
        int tien, vijf;
        int keuze = 0;
        int geld = 0;
        int hoeveel = 0;


        String[] producten = new String[4];

        producten[0] = "Naturel";
        producten[1] = "Paprika";
        producten[2] = "Kaas";
        producten[3] = "Chocolade";


        int[] kosten = new int[4];

        kosten[0] = 90;
        kosten[1] = 95;
        kosten[2] = 85;
        kosten[3] = 100;



        System.out.println("Selecteer jouw product.");
        Scanner input = new Scanner(System.in);
        keuze = input.nextInt();

        System.out.println("Hoeveel cent heeft u?");

        geld = input.nextInt();

        if ((geld >= 85) && (geld <= 100)) {

            switch (keuze) {
                case 1:
                    if (geld < 90){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {

                        System.out.println("Je hebt " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Naturel Chips gekozen. - .90");
                        hoeveel = geld - kosten[0];

                        System.out.println("Jouw wisselgeld: " + hoeveel + "cent");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");

                    }
                    break;

                case 2:
                    if (geld < 95){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {
                        System.out.println("Je hebt " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Paprika Chips gekozen. - .95");
                        hoeveel = geld - kosten[1];
                        System.out.println("Jouw wisselgeld: " + hoeveel + " cent");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");

                    }
                    break;

                case 3:
                    if (geld < 85){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {
                        System.out.println("je hebt " + geld + " cent ingeworpen.");
                        System.out.println("Je hebt Kaas Chips gekozen. - 1,00");
                        hoeveel = geld - kosten[2];
                        System.out.println("Jouw wisselgeld: " + hoeveel + " cent.");
                        System.out.println("Je krijgt dit terug: ");

                        hoeveel = hoeveel % 25;
                        tien = hoeveel / 10;
                        hoeveel = hoeveel % 10;
                        vijf = hoeveel / 5;

                        System.out.println(tien + " stuiver(s)");
                        System.out.println(vijf + " kwartje(s)");
                        System.out.println("Bedankt! En geniet van jouw product.");
                    }
                    break;

                case 4:
                    if (geld < 100){System.out.println("Je hebt te weinig geld ingeworpen!");}
                    else {
                    System.out.println("Je hebt: " + geld + " cent ingeworpen.");
                    System.out.println("Je hebt Chocolade Chips gekozen -.85");
                    hoeveel = geld - kosten[3];
                    System.out.println("Jouw wisselgeld: " + hoeveel + " cent");
                    System.out.println("Je krijgt dit terug: ");

                    hoeveel = hoeveel % 25;
                    tien = hoeveel / 10;
                    hoeveel = hoeveel % 10;
                    vijf = hoeveel / 5;

                    System.out.println(tien + " stuiver(s)");
                    System.out.println(vijf + " kwartje(s)");
                    System.out.println("Bedankt! En geniet van jouw product.");
                    }
                    break;

                default:

                    System.out.println("Je moet een keuze maken tussen 1 en 4.");
            }

        } else {
            if (geld < 85) {
                System.out.println("Je moet minimaal 85 cent inwerpen.");

            }
            if (geld > 100) {
                System.out.println("Je hebt teveel ingeworpen, maximaal 100cent!");
            }
        }

    }
}
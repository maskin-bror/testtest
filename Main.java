




package com.company;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        startSkärm();
    }

    public static void startSkärm(){
        Scanner input = new Scanner(System.in);

        System.out.println("   ______                         ____      ____      __                              \n" +
                " .' ___  |                       |_  _|    |_  _|    [  |  _                          \n" +
                "/ .'   \\_|  _   __  _ .--..--.     \\ \\  /\\  / /,--.   | | / ] .---.  __   _  _ .--.   \n" +
                "| |   ____ [ \\ [  ][ `.-. .-. |     \\ \\/  \\/ /`'_\\ :  | '' < / /__\\\\[  | | |[ '/'`\\ \\ \n" +
                "\\ `.___]  | \\ '/ /  | | | | | |      \\  /\\  / // | |, | |`\\ \\| \\__., | \\_/ |,| \\__/ | \n" +
                " `._____.'[\\_:  /  [___||__||__]      \\/  \\/  \\'-;__/[__|  \\_]'.__.' '.__.'_/| ;.__/  \n" +
                "           \\__.'                                                            [__|      ");
        System.out.println("1. Bli Medlem");
        System.out.println("2. Logga in");
        System.out.println("3. Boka plats på aktivitet");
        System.out.println("4. Avsluta");

        int menyval = input.nextInt();

        if (menyval == 1){ //Bli medlem
            medlemskap();
        }else if (menyval == 2){ //Logga in

            inlogg.inlogg();

        }else if (menyval == 3){ //Boka plats på aktivitet

            aktivitet.bokning();

        } else if (menyval == 4){ //Avsluta

        }
    }

    public static void medlemskap() {
        int pris;
        int medlemskapsPris = 100;
        Scanner inputM = new Scanner(System.in);

        System.out.println("Medlemskap 100:-");
        System.out.println("Medlemskap 1-2mån 400:-/månad");
        System.out.println("Medlemskap 3-6mån 350:-/månad");
        System.out.println("Medlemskap 7-12mån 300:-/månad");
        System.out.println("Medlemskap 12mån eller längre 250:-/månad");
        System.out.println("How many months do you want to be a member?");

        int medlemskapsval = inputM.nextInt();

        if (1 <= medlemskapsval && medlemskapsval <= 2){
            pris = 400;
        }
        else if (medlemskapsval <=6) {
            pris = 350;
        }
        else if (medlemskapsval > 12) {
            pris = 250;
        }
        else{
            pris = 300;
        }
        System.out.println("Mata in personnummer för registrering");
        String personNummer = inputM.next();
        boolean ligma = autentisering.validera(autentisering.sanitera(personNummer));
        if(ligma){
            System.out.println("Korrekt personnummer");
            System.out.println("Priset för medlemskap i " + medlemskapsval +"månader: ");
            System.out.print(medlemskapsPris + pris * medlemskapsval + " Kr");
        } else {
            System.out.println("Felaktigt personnummer");
        }
        startSkärm();
    }

    }
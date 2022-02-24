package Morsekod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MorseMain {

    public static void main (String [] args) {

        //Skriv in text
        HelloMorse myMorse = new HelloMorse();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to my morsecode");



        while(true){
            String text = scan.nextLine();
            String code = myMorse.getMorseCode(text);
            System.out.println(code);


            System.out.println(myMorse.agetMorsecode(scan.nextLine()));


        }




        }






    }


    //Skriv ett program som gör om morsekod till engelska och engelska till morsekod
    //Skriv programmet med minst en logikklass samt en klass som läser in text och skriver ut text (med en main-metod)
    //Skapa minst två felhanteringar i systemet som fångar två saker som användaren kan göra som går utanför det vanliga användandet av systemet


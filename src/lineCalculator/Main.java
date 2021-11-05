package lineCalculator;

import java.util.Scanner; // importera Scanner klassen
// Skriv ett program som läser in text
// ifrån kommandoraden rad för rad tills
//användaren skriver ordet stop.

public class Main {

    public static String addLines;

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        // Skriver ut ett välkomnande
        System.out.println("Välkommen till min ordräknare, kör hårt och börja skriva");
        String text = Scan.nextLine();
        Counter.endWord(text);


        while (Counter.endWord()) {
            //Programmet avslutas när användaren skrivit ordet "Stop"

            // Skriver in antal rader

            System.out.println(Counter.addLines(text));

            // Skriver in antal tecken

            System.out.println(Counter.addCharacters(text));

            // Fler rader kan skrivas in i programmet

            text = Scan.nextLine();

            Counter.endWord(text);

        }

        // Skriver ut antalet rader
        // System.out.println("Antal rader" + Counter.//getNumberofLines());

        // Skriver ut antalet tecken
        //System.out.println("Antal tecken" + Counter.getNumberofCharacters());


    }
}









package lineCalc;

import javax.xml.stream.events.Characters;
import java.util.Scanner; // importera Scanner klassen
// Skriv ett program som läser in text
// ifrån kommandoraden rad för rad tills
//användaren skriver ordet stop.

public class Main {

    public static String addLines;

    public static void main(String[] args) {

        Counter myCounter = new Counter();
        Scanner Scan = new Scanner(System.in);
        // Skriver ut ett välkomnande
        System.out.println("Välkommen till min ordräknare, kör hårt och börja skriva");

        String text = Scan.nextLine();
        myCounter.getendWord();
        myCounter.addCharacters(text);

        while (!myCounter.getendWord()) {


            myCounter.addLines();
            text = Scan.nextLine();
            myCounter.addCharacters(text);
            myCounter.getendWord();
        }


        System.out.println(myCounter.getNumberofCharacters());
        System.out.println(myCounter.getNumberofLines());


    } }




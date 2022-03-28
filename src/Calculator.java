import java.util.Scanner;

public class Calculator {

        private int FirstNR; // Attribut
        private int SecondNR; // Attribut

       // Konstraktor
        public Calculator(int FirstNumber, int SecondNumber){

                FirstNR = FirstNumber;
                SecondNR = SecondNumber;
        }

        public void printAddition(){
                System.out.println(FirstNR + SecondNR);
        }



}

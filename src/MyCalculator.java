import java.util.Scanner;

public class MyCalculator {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println(" Ange ett tal");
        int FirstNumber = Scan.nextInt();
        System.out.println(" Ange ett till tal");
        int SecondNumber = Scan.nextInt();

        Calculator calc = new Calculator(FirstNumber, SecondNumber);

        calc.printAddition();

    }
}

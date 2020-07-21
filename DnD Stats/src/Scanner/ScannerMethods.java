package Scanner;

import java.util.Scanner;

public class ScannerMethods {
    static Scanner Scan = new Scanner(System.in);

    public static String inputString(){
        String input = "";

        input = Scan.nextLine();

        return input;
    }

    public static int inputNum(){
        int input = 0;

        if(Scan.hasNextInt()){
            input = Scan.nextInt();
        }
        else{
            System.out.println("Sorry! It appears you have entered an incorrect variable. Returning to previous menu.");
        }
        Scan.nextLine();

        return input;
    }

    public static double inputDouble(){
        double input = 0;

        if(Scan.hasNextDouble()){
            input = Scan.nextDouble();
        }
        else{
            System.out.println("Sorry! It appears you have entered an incorrect variable. Returning to previous menu.");
        }
        Scan.nextLine();

        return input;
    }
}

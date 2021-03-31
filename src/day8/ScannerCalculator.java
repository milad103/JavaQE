package day8;

import java.util.Scanner;

public class ScannerCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum= num1+num2;
        System.out.println("The total is :" + sum);



    }
}

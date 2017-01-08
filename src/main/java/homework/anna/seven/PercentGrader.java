package homework.anna.seven;

import java.util.Scanner;

public class PercentGrader {
    public static void main(String[]args){
        Scanner percentage = new Scanner(System.in);
        int i = 0;
    if (i <= 100 && i >= 0) {

        System.out.println("Please, enter the percentage you scored (numbers between 1-100).");
            i = percentage.nextInt();
        }
    if (i <= 100 && i>95 ){

        System.out.println("Your grade is 6. Congratulations!");
    }
    if (i < 95 && i >= 85) {

        System.out.println("Your grade is 5. Congratulations!");
    }
    if (i <85 && i >= 75) {

        System.out.println("Your grade is 4.");
    }
    if (i < 75 && i >= 65) {

        System.out.println("Your grade is 3.");
    }
    if (i < 65 && i >= 55) {

        System.out.println("Your grade is 2.");
    }
    if (i < 55 && i >= 0) {

        System.out.println("Your grade is 1.");
    }

    }
}

package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");// input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");// input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        long d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;
        int sum = a + b + c + (int) d + (int) e + (int) f + (int) g + (int) h;
            System.out.println(sum);

        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scan = new Scanner(System.in);
            int x , y;
            x = scan.nextInt();
            y = scan.nextInt();

            int sum = x + y;
        System.out.println(sum);

        // input your solution here
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scan = new Scanner(System.in);
        int x , y;

        System.out.println("Before Swap:");
        System.out.println("x: " + "y: " + "After Swap:");

        x = scan.nextInt();
        y = scan.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x: " + x);
        System.out.println("y: " + y);


        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        int n1 , n2; // n1 steht für Nummer 1 und n2 steht für Nummer 2
        Scanner scan = new Scanner(System.in);
        System.out.print("n1: ");
        n1 = scan.nextInt();
        System.out.print("n2: ");
        n2 = scan.nextInt();
        if(n1 > n2){
            System.out.println("n1 > n2");
        }
        else if(n1 < n2){
            System.out.println("n2 > n1");
        }
        else{
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        int x; // x steht für den jährlichen Umsatz
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.print("Enter annual Revenue: ");
        if (x >= 0 && x < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (x >= 20000 && x < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (x >= 50000 && x < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (x >= 80000 && x < 100000) {
            System.out.println("Excellent Sales Revenue");
        } else {
            System.out.println("Invalid Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        int x; // x steht für die CommissionClass
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();

        System.out.print("Enter CommissionClass: ");
            switch(x){
                case 001:
                    System.out.println("Your Commission Rate was set to 0.01");
                    break;
                case 002:
                    System.out.println("Your Commission Rate was set to 0.02");
                    break;
                case 003:
                    System.out.println("Your Commission Rate was set to 0.03");
                    break;
                case 004:
                    System.out.println("Your Commission Rate was set to 0.04");
                    break;
                default:
                    System.out.println("Your Commission Rate was set to 0.0");
            }
        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        int x; // x steht für die Jahreszahl
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.print("Year: ");
        if (x % 400 != 0 && x % 100 == 0) {
            System.out.println("Not a Leapyear");
        } else if (x % 400 == 0 || x % 4 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        int x; // x steht für die eingebene Zahl
        int y; // y steht für die vorrübergehende Ziffer
        int z = 0; // z steht für die invertierte Zahl
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.print("Number: ");

        while(x > 0){
            y = x % 10;
            x = x / 10;
            z = z * 10 + y;
        }
        System.out.println(z);
        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}
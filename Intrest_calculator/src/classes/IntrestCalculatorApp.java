package classes;

import java.util.Scanner;

public class IntrestCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Interest Calculator – SB");
            System.out.println("2. Interest Calculator – FD");
            System.out.println("3. Interest Calculator – RD");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.println("Enter Average Amount:");
                        double sbAmount = sc.nextDouble();
                        System.out.println("Enter Account Type (Normal/NRI):");
                        String type = sc.next();
                        SBAccount sb = new SBAccount(sbAmount, type);
                        System.out.println("Interest gained: " + sb.calculateInterest());
                        break;

                    case 2:
                        System.out.println("Enter FD Amount:");
                        double fdAmount = sc.nextDouble();
                        System.out.println("Enter Number of Days:");
                        int days = sc.nextInt();
                        System.out.println("Enter Age:");
                        int age = sc.nextInt();
                        FDAccount fd = new FDAccount(fdAmount, days, age);
                        System.out.println("Interest gained: " + fd.calculateInterest());
                        break;

                    case 3:
                        System.out.println("Enter Monthly Amount:");
                        double monthly = sc.nextDouble();
                        System.out.println("Enter Number of Months:");
                        int months = sc.nextInt();
                        System.out.println("Enter Age:");
                        int rdAge = sc.nextInt();
                        RDAccount rd = new RDAccount(monthly, months, rdAge);
                        System.out.println("Interest gained: " + rd.calculateInterest());
                        break;

                    case 4:
                        System.exit(0);

                    default:
                        System.out.println("Invalid Option");
                }
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

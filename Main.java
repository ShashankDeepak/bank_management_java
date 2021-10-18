package com.BankManagementSystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while(true) {
            System.out.println("\t\tBank Management System");
            System.out.println("\n1- Login to your account");
            System.out.println("2-End");

            Scanner input = new Scanner(System.in);
            System.out.println("\nEnter your option: ");
            int n = input.nextInt();
            if(n == 1)
                login();
            if(n == 2)
                break;
            if(n != 1 || n != 2)
                System.out.println("Please enter a correct value\n");
        }
        System.out.println("Thanks for using this system!");

    }


    public static void login() {
        System.out.println("Enter your card number: ");
        Scanner logCardNumber = new Scanner(System.in);
        Double logCard = logCardNumber.nextDouble();

        System.out.println("\nEnter your password(numbers only): ");
        Scanner password = new Scanner(System.in);
        int logPass = password.nextInt();
        int amount = 0,add = 0,remove = 0;
        while(true) {
            System.out.println("\nChose the option you want to do now");
            System.out.println("1- View Balance");
            System.out.println("2- Add amount");
            System.out.println("3- Remove amount");
            System.out.println("4- Get your details");
            System.out.println("5- Log out");
            System.out.println("\nEnter your value: ");
            Scanner logInput = new Scanner(System.in);
            int logInt = logInput.nextInt();

            if(logInt == 1){
                System.out.println("Your balance is: "+ amount);
            }

            else if(logInt == 2){
                System.out.println("Enter the amount to be added: ");
                Scanner addAmount = new Scanner(System.in);
                add = addAmount.nextInt();
                amount += add;
                System.out.printf("%d added\n",add);
            }
            else if(logInt == 3){
                System.out.println("Enter the amount to be removed: ");
                Scanner removeAmount = new Scanner(System.in);
                remove = removeAmount.nextInt();
                if((amount - remove) >= 0) {
                    amount -= remove;
                }
                if((amount - remove) < 0){
                    System.out.println("The amount entered cannot be removed as it is too high");
                    remove = 0;
                }
                System.out.printf("%d removed\n",remove);
            }
            else if(logInt == 4){
                System.out.println("=========================================================");
                System.out.println("\t\t    \t          YOUR DETAILS\n");
                System.out.printf("Your card number: %.0f",logCard);
                System.out.println("\nYour password: "+ logPass);
                System.out.println("\nTotal amount: "+ amount);
                System.out.println("\nLast amount added: "+ add);
                System.out.println("\nLast amount removed: "+ remove);
                System.out.println("=======================================================");

            }
            else if(logInt == 5)
                break;


        }
    }


}

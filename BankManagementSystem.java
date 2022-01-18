import java.util.*;
import java.time.*;
public class BankManagementSystem{
    public static String name_of_person,date_add,date_withdrawl,time_add,time_withdrawl;
    public static long card_num;
    public static int card_password;
    public static float add,sub,total_amount = 0;
    public static void main(String[] args){
        while(true){
        System.out.println("\t BANK MANAGEMENT SYSTEM");
        System.out.println("  " + "---------------------------");
        System.out.println("1-Sign In");
        System.out.println("2-Exit");
        System.out.print("Enter Your Option: ");    
        Scanner options = new Scanner(System.in);
        int input;
        try {
            input = options.nextInt();    
        }catch (InputMismatchException ex) {
            System.err.println("***************************");
            System.err.println("Please Enter a Number");
            System.err.println("***************************");
            continue;
        }catch(Exception ex){
            System.err.println("***************************");
            System.err.println("Please choose a vaild option");
            System.err.println("***************************");
            continue;
        } 
                  
     if(input == 1){
            sign_in();
            break;
        }
        else if(input == 2) {
         System.out.println("Thanks For Using The System");
         break;
     }
        else if(input != 1 && input != 2){
            System.err.println("***************************");
            System.err.println("Please enter a valid option");
            System.err.println("***************************");
                continue;
            }
        }

        
    }

    public static void sign_in() throws InputMismatchException{ 
        while(true){
            System.out.println("\t\t  SIGN IN");
            System.out.println("  " + "------------------------");
            try {
        Scanner sign = new Scanner(System.in);
        System.out.print("Name: ");
        name_of_person = sign.nextLine();
        System.out.print("Card Number: ");
         card_num = sign.nextLong();
        System.out.print("Password: ");
         card_password = sign.nextInt();
        CheckPassword check = new CheckPassword();  
            } catch (InputMismatchException ex){
                System.err.println("***************************");
                System.err.println("Please enter acceptable details");
                System.err.println("***************************");
                continue;
            }catch(Exception ex){
                System.err.println("***************************");
                System.err.println("Please enter  valid details");
                System.err.println("***************************");
                continue;
            }
            break;
        }
        login();
    }
        public static void  login(){
        while(true){
            System.out.println("\t\t  LOG IN");
            System.out.println("  " + "------------------------");
            System.out.println("1-Login");
            System.out.println("2-Sign in");
            System.out.println("3-Exit");
            System.out.print("Enter Your Option: ");
            Scanner options = new Scanner(System.in);
            int input;
            try {
                input = options.nextInt();    
            }catch (InputMismatchException ex) {
                System.err.println("***************************");
                System.err.println("Please Enter a Number");
                System.err.println("***************************");
                continue;
            }catch(Exception ex){
                System.err.println("***************************");
                System.err.println("Please choose a valid option");
                System.err.println("***************************");
                continue;
            } 
                      
         if(input == 1){
                login(card_num,card_password);
                continue;
            }
         else if(input == 2)
                sign_in();
            else if(input == 3) {
             System.out.println("Thanks For Using The System");
                break;
         }
            else if(input != 1 && input != 2){
                System.err.println("***************************");
                System.err.println("Please enter a valid option");
                System.err.println("***************************");    
                continue;
            }
            break;
        }              
    }
    public static void login(long card,int pass) throws InputMismatchException {
        long card_number;
        int password;    
        CheckPassword check = new CheckPassword();
        check.sign_card = card;
        check.sign_pass = pass;
      while(true){
        while(true){
            System.out.print("Please enter your card number: ");                    
            try {
                Scanner number = new Scanner(System.in);
                card_number = number.nextLong();
                 check.login_card = card_number;
            }catch (InputMismatchException e) {
                System.err.println("***************************");
                System.err.println("Please enter a number");
                System.err.println("***************************");
                continue;
            }catch(Exception ex){
                System.err.println("***************************");
                System.err.println("Please choose a valid option");
                System.err.println("***************************");
                continue;
            }
            break;
        }
            while(true){
                try {
                Scanner number = new Scanner(System.in);
                System.out.print("Please Enter Your Password: ");
                password = number.nextInt();
                check.login_pass = password;
            } catch (InputMismatchException e) {
                System.err.println("***************************");
                System.err.println("Please enter a number");
                System.err.println("***************************");
                continue;
                }catch(Exception ex){
                    System.err.println("***************************");
                    System.err.println("Please choose a valid option");
                    System.err.println("***************************");
                    continue;
                }
                break;
                }
                 if(check.execute()){
                    break;
                    }
                else{
                    System.err.println("**********************************************************");
                    System.err.println("Your card number and password didnt match please try again");
                    System.err.println("**********************************************************");    
                    continue;
                }             
        }
        option_system();    
    }
    private static void option_system() {
        int menu;
        Scanner option = new Scanner(System.in);
        while (true) {
        System.out.println("\tBANK MANAGEMENT SYSTEM");
        System.out.println("  " + "--------------------------------");
        System.out.println("Choose your option: ");
        System.out.println("1-Add money\n2-Withdraw Moeny\n3-Show Recipt of last transaction\n4-My Profile\n5-Log Out");
        System.out.print("Enter your option: ");
            try {
                menu = option.nextInt();
        }catch(InputMismatchException e){
            System.err.println("***************************");
            System.err.println("Please enter a number");
            System.err.println("***************************");
            continue;
        }catch(Exception ex){
            System.err.println("***************************");
            System.err.println("Please choose a valid option");
            System.err.println("***************************");
            continue;
        }
        break;
    }
        while(true) {
            switch (menu){
                case 1:
                    try{    
                        LocalDate date = LocalDate.now();
                        LocalTime time = LocalTime.now();
                        date_add = date.toString();
                        time_add = time.toString();
                        System.out.println("Enter the amount to be ADDED: ");
                        add = option.nextFloat();
                        total_amount += add;
                        System.out.println("Total amount added = "+add+"\nRemaning amount = "+total_amount);
                        option_system();  
                    }catch(InputMismatchException ex){
                        System.err.println("************************");
                        System.err.println("Please enter number only");
                        System.err.println("************************");
                        continue;
                     }
                case 2:
                    try{        
                        LocalDate date = LocalDate.now();
                        date_withdrawl = date.toString();
                        LocalTime time = LocalTime.now();
                        time_withdrawl = time.toString();
                        System.out.println("Enter the amount to be WITHDRAWN: ");
                        sub = option.nextFloat();
                        if(sub>total_amount){
                            System.out.println("Insufficient Balance");
                            sub = 0;
                            date_withdrawl = "";
                            time_withdrawl = "";
                            option_system();
                        }
                        total_amount -= sub; 
                        System.out.println("Total amount withdrawn = "+sub+"\nRemaning amount = "+total_amount);
                        option_system();
                    }catch(InputMismatchException ex){
                        System.err.println("************************");
                        System.err.println("Please enter number only");
                        System.err.println("************************"); 
                        continue;                       
                }
                case 3:
                   System.out.println("\tFEE RECIPT");
                    System.out.println("  --------------------------");
                    System.out.println("Last Transaction");
                    System.out.println("Amount added = " + add);
                    System.out.println("At time = " + time_add);
                    System.out.println("Date = " + date_add);
                    System.out.println("\nAmount removed = "+sub);
                    System.out.println("At time = " + time_withdrawl);
                    System.out.println("Date = " + date_withdrawl);
                    option_system();
                    case 4:
                        System.out.println("\tProfile");
                         System.out.println("  --------------------------");
                         System.out.println("Name - " + name_of_person);
                         System.out.println("Card Number - " + card_num);
                         System.out.println("Password - " + card_password);
                         System.out.println("Balance - " + total_amount);
                         option_system();                        
                     case 5:
                         login();
            }
            break;
        }
    }
}
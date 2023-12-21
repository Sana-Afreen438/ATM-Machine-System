package ATMMachine;


//creating a class named ATM

import java.util.Scanner;

class ATM{

    //creating a float and int type of variables
    float Balance;
    int PIN = 5674;

    //creating a function here:
    public void checkpin(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        //Now to check we are using if else statements of PIN is valid or no:

        if(enteredpin==PIN){
            menu();
        }
        else{
            System.out.println("Enter a valid PIN");
            menu();
        }
    }

    //Now creating a menu method here:

    public void menu(){
        //Here we are printing 4 options for user:
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIt");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            checkBalance();
        }
        else if(opt == 2){
            withdrawMoney();
        }
        else if(opt == 3){
            depositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }

    //Now creating a function of all 4 choice

    public void checkBalance(){
        System.out.println("Balance: " + Balance);
        menu(); //Here we added menu bcoz if user again wants to go back to menu if he dont want to check balance in that case
    }
    public void withdrawMoney(){
        //First we are asking user that how much money user have to withdraw:
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat(); //whatever the user will be putting money it will be stored in the float variable (amount)

        //Here we are checking if the user is asking under balance or above balance. If he is within banace then
        if(amount>Balance){
            System.out.println("Insufficient Balance");
        }
        else{
            Balance = Balance - amount;
            System.out.println("Amount Withdrawl Successfully");
        }

        //Again we are sending back user to main menu bcoz if again user wants to check the balance
        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the Amount");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class ATMMachine{
    public static void main(String[] args){

        //Here we are creating an objects

        ATM obj = new ATM();
        obj.checkpin();
    }
}

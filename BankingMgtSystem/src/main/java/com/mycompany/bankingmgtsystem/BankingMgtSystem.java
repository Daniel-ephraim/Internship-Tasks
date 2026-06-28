/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingmgtsystem;

/**
 *
 * @author USER
 */
import java.util.Scanner;

class BankAccount{
    String AccName;
    private double balance;
    
    public BankAccount(String name, double accBalance){
        this.AccName = name;
        balance = accBalance;
    }
    
    public void deposit(double amount){
        if(amount>=5000){
            balance += amount;
            System.out.println("\nYou have deposited " + amount + " into your Account.");
        }else{
            System.out.println("The amount deposited should be 5000 or more.");
        }
    }
    
    public void withdraw(double amount){
        if(amount<500){
            System.out.println("The withdrawable amount should be 500 and more.");
        }else{
            balance-=amount;
            System.out.println("You have withdrawn " + amount);
        }
    }
    
    public void checkBal(){
        System.out.println("Your Account balance is: " + balance);
    }
}

public class BankingMgtSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Account Name: \n");
        String accName = input.nextLine();
        BankAccount account = new BankAccount(accName, 0);
        
        int choice;
        do{
            System.out.println("=== Bank With Us ===");
            System.out.println("1. Deposit into Account.");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Account Balance.");
            System.out.println("4. Exit!");
            System.out.println("\nEnter your choice: ");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("\nEnter the amount to Deposit: ");
                    double depo = input.nextDouble();
                    account.deposit(depo);
                    break;
                    
                case 2:
                    System.out.println("\nEnter the amount to Withdraw: ");
                    double withdrawAmnt = input.nextDouble();
                    account.withdraw(withdrawAmnt);
                    break;
                    
                case 3:
                    account.checkBal();
                    break;
                    
                case 4:
                    System.out.println("Thank you for banking with us " + accName);
                    break;
                    
                default:
                    System.out.println("Invalid choice, please choose from the provided menu.");
            }
        }while (choice!=4);
        
        input.close();
    }
}

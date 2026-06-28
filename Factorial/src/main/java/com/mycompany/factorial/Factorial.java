/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.factorial;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Factorial {
    
    public static long factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("Factorial is not available for negative figures.");
        }
        
        if(n==0 || n==1){
            return 1;
        }
        
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter a positive value to get it factorial: \n");
            
            int number = sc.nextInt();
            
            long result = factorial(number);
            
            System.out.println("The factorial of " + number + "is: " + result);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Invalid value, tyr again!!");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberguessinggame;

/**
 *
 * @author USER
 */
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        int randNum = rand.nextInt(20)+1;
        int maxAttempts = 5;
        int attempts = 0;
        boolean rightguess = false;
        
        System.out.println("Hello there, my name is Mugabi Daniel Ephraim Kabuye and this is a java development projoect from CodVeda inter program");
        System.out.println("====L3T US PLAY A NUMB3R GU3SS1NG GAM3.");
        System.out.println("""
                           \nI will choose a random number between 1 to 20.
                           You will guess the number in 5 tries.                          
                           All the best of luck...\n
                           """);
        
        while(attempts < maxAttempts && !rightguess){
            System.out.println("Enter your guess here: \n");
            
            try{
                int guess = scan.nextInt();
                attempts++;
                
                int diff = Math.abs(randNum-guess);
                
                if(guess == randNum){
                    rightguess = true;
                    System.out.println("You got the correct number in " + attempts + " attempts, CONGRATULATIONS!!");
                }
                else if(diff <= 5){
                    if(guess < randNum){
                        System.out.println("You are close, just a little higher.\n");
                    }else{
                        System.out.println("You are close, just a little lower.\n");
                    }
                }else if(diff <= 10){
                    System.out.println("Almost there...");
                }else{
                    if(guess < randNum){
                        System.out.println("Too low.\n");
                    }else{
                        System.out.println("Too high.\n");
                    }
                }
                System.out.println("Attempts remaining: " + (maxAttempts-attempts));
            }catch(Exception e){
                System.err.println("----Invalid Input!!!----");
            }
        }
        if(!rightguess){
            System.out.println("GAME OVER.");
            System.out.println("The correct number was " + randNum);
            System.out.println("Thank You for playing.");
        }
        System.out.println("Thank You for playing.");
        scan.close();
    }
}

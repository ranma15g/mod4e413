/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and check whether the letter is a vowel or consonant. 
Due: Sep 29 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

import java.util.Scanner; // We are importing the Scanner class from java.util 

public class Main { // Open the class block

    public static void main(String[] args) { // Open the main method block

        // Create the Scanner Object scanner for grabbing the user input
        Scanner scanner = new Scanner(System.in);

        // Create a loop for the program to continue for the user until the program ends
        while (true) { // open the while true block

            // Ask the user to enter a letter
            System.out.print("Enter a letter: ");

            // We grab the input and convert it to a lowercase for error handling
            String input = scanner.nextLine().toLowerCase();

            // Check if the input is a single letter
            if (input.length() != 1) { // tell the user what they did wrong
                System.out.println(input + " is invalid. You entered more than a single character. Please enter a single letter.\n");
                continue; // Go back to the beginning of the loop
            }

            // Check if the input is a letter
            if (!Character.isLetter(input.charAt(0))) { // tell the user what they did wrong
                System.out.println(input + " is a number, not a letter. Please enter a single letter.\n");
                continue; // Go back to the beginning of the loop
            }

            // Now that the input has passed the test we are converting it from a string to a char
            char letter = input.charAt(0);
            /* !! If we don't convert to a character, we will 
                get an error from the isVowel method !! */

            /* We run the isVowel method to the character stored in the 
               letter variable and store the result in a boolean variable */
            boolean vowel = letterCheck(letter);

            // if the isVowel method returns true
            if (vowel) {
                System.out.println(letter + " is a vowel.\n");
            } 

            // if the isVowel method returns false
            else {
                System.out.println(letter + " is a consonant.\n");
            }

        } // close the while true block

    } // close the main method block


    
    
    
    /* Declare a method for running the input through 
        an array of vowells to determine its letter status */
    private static boolean letterCheck(char letter) { // open the isVowel method block

        // Create an array of vowels
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        // Iterate through each vowel in the array
        for (char vowel : vowels) {
        
            // Check if the input letter matches the current vowel
            if (letter == vowel) {
            
                // If a match is found, return true (indicating the letter is a vowel)
                return true;
            }
        }    

        /* If no match is found after iterating through all vowels, 
            return false (indicating the letter is a consonant) */
        return false;
    } // close the isVowel method block

} // Close the Main class block
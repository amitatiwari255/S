package com.bridgelabz.workshop;
import java.util.Scanner;
public class FrequencyOfString {
    public static int getFrequency(char inputChar, String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputChar == inputString.charAt(i)) {
            }
            count++;
        }
        return count;
    }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the  string is: ");
            String inputString = scan.nextLine();
            System.out.println("Enter character to find frequency : ");
            char inputChar = scan.next().charAt(0);
            int result = getFrequency(inputChar , inputString);
            System.out.println("Frequency number is :" +result);
        }
    }


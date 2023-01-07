package com.bridgelabz.workshop;

import java.util.Scanner;

public class f {
    public static int getFrequency(char inputChar, char inputString) {
        int count = 0;
        for (int i = 0; i < inputString; i++) {
            if (inputChar == inputString) {
                ++count;
                System.out.println("Frequency is :" + count);
            }
        }
        return count;
    }
        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the  string is: ");
            String inputString = scan.nextLine();
            System.out.println("Enter character to find frequency : ");
            String inputChar = scan.nextLine();
        }
    }



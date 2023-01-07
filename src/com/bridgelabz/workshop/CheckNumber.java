package com.bridgelabz.workshop;

public class CheckNumber {
    int count = 0;
    public void checkNumber(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length() ; j++)
                if ('1' == arr[i].charAt(j) && ('0' == arr[i].charAt(j))) {
                    count++;
                }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        String arr[] = new String[]{"1111", "1110", "1100", "1000", "0000", "0001", "0011", "0111"};
        StringArray num = new StringArray();
        num.checkNumber(arr);
    }
}


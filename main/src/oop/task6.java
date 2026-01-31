package oop;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();

        String cleanStr = str.toLowerCase();
        int left = 0;
        int right = cleanStr.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                isPalindrome = false; 
                break;                
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }

        input.close();
    }
}
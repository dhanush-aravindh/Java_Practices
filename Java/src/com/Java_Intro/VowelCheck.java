package com.Java_Intro;

public class VowelCheck {
    public static void main(String[] args) {
        char my_char = 'a';
//        switch(my_char){
//            case 'A': case 'a':
//                System.out.println("A is a vowel");
//                break;
//            case 'E': case 'e':
//                System.out.println("E is a vowel");
//                break;
//            case 'I': case 'i':
//                System.out.println("I is a vowel");
//                break;
//            case 'O': case 'o':
//                System.out.println("O is a vowel");
//                break;
//            case 'U': case 'u':
//                System.out.println("U is a vowel");
//                break;
//            default:
//                System.out.println("Oops! Not a vowel");
//                break;
//
//        }
        switch (Character.toUpperCase(my_char)) {
            case 'A':
                System.out.println("A is a vowel");
                break;
            case 'E':
                System.out.println("E is a vowel");
                break;
            case 'I':
                System.out.println("I is a vowel");
                break;
            case 'O':
                System.out.println("O is a vowel");
                break;
            case 'U':
                System.out.println("U is a vowel");
                break;
            default:
                System.out.println("Oops! Not a vowel");
                break;
        }
    }
}

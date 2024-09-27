package com.Java_Intro;
//import java.util.Scanner;

import java.util.Scanner;

public class PlayingCat{

//    public static boolean isCatPlaying(boolean summer, int temp){
//        if(summer == true){
//            if(temp >=25  && temp <= 45){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//        else{
//            if(temp >=25 && temp <= 35){
//                return true;
//            }
//            else{
//                return false;
//            }
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        boolean summer = sc.nextBoolean();
//        int temp = sc.nextInt();
//
//        isCatPlaying(summer,temp);
//
//    }
public static boolean isCatPlaying(boolean summer, int temperature) {
    if (summer == true) {
        if (temperature >= 25 && temperature <= 45) {
            return true;
        }
        else
            return false;
    }
    else {
        if (temperature >= 25 && temperature <= 35) {
            return true;
        }
        else
            return false;
    }
}
    public static void main(String[] args){
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));
    }
}


package com.Java_Intro;
import java.util.Scanner;

public class KiloBytes {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the memory size:");
//        int KiloBytes = sc.nextInt();
//        System.out.println("Enter the memory size: "+KiloBytes + "KB");
//        printMegaBytes(KiloBytes);
//    }
//    public static void  printMegaBytes(int kiloBytes){
//        float MegaBytes = kiloBytes/1024f;
//        System.out.println("Memory size:" + MegaBytes + "MB");
//    }
public static void printMegaBytes(int kiloBytes){

    if (kiloBytes < 0){
        System.out.println("Invalid Value");
    } else {
        int megabytes = (kiloBytes/1024);
        int kiloRemainder = kiloBytes%1024;
        System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
    }

}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int kiloBytes=sc.nextInt();
        printMegaBytes(kiloBytes);
    }
}


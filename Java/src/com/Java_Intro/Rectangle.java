package com.Java_Intro;

public class Rectangle {
    public static void main(String[] args){
        int Length = 10;
        int breadth =5;
        double perimeter = 2*(Length + breadth);
        double area = Length * breadth;
        System.out.println("Perimeter of Rectangle: " + perimeter);
        System.out.println("Area of Rectangle: "+area);

//        byte b = 1; // line 1
//        b += 2;   //line 2
//        System.out.print(b+" ");
//        b = (byte) (b + 3);   // line 4  error : java: incompatible types: possible lossy conversion from int to byte
//        System.out.print(b); // line 5



        int i = 4;   //line 1
        String str = (i<3)?"sunday":(i<5)?"monday":"friday";   //line 2
        System.out.println(str);   // line 3

        String s="null";
        if(s.length()==0)
            System.out.println("zero");
        else if(s==null)
            System.out.println("null");
        else
            System.out.println("some");

        int x = 5;   // line 1
        x = 7 + 3 * x;  //line 2
        System.out.println (x);  //line 3

        System.out.println(10.0/0);
        System.out.println(0.0/0);
        System.out.println(0.0/10);
        System.out.println(-10.0/0);



    }

}









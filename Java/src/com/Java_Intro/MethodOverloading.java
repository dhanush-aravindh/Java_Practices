// If a class has multiple methods having same name
// but different in parameters, it is known as method overloading

//Advantages:
// Method overloading increases the readability of the program
// Different ways to overload the method.
// There are two ways to overload the method in Java:
// By changing number of arguments and data type





package com.Java_Intro;

public class MethodOverloading {
 public static void main(String[] args){
     String name = "Dhanush";
     int age = 24;
     char Grade = 'A';
     double height = 179.3;
     DisplayDetails(name,age,Grade,height);
     DisplayDetails(name,age,Grade);
     DisplayDetails(name,age);
     DisplayDetails(name,Grade);
     DisplayDetails();
 }
 // We can change the name of the attributes in the method while we are declaring
 public static void DisplayDetails(String UserName, int UserAge,char Grade,double height){
     System.out.println("The Name is: "+ UserName +". The age is: "+ UserAge
             + " The grade and heights are : " + Grade + " and " + height + " respectively.");


 }
 public static void DisplayDetails(String UserName, int UserAge,char Grade){
        System.out.println("The Name is: "+ UserName +". The age is: "+ UserAge
                + " The grade is : " + Grade + " respectively.");


    }
    public static void DisplayDetails(String UserName,int UserAge){

        System.out.println("The Name is: "+ UserName +". The age is: "+ UserAge);


    }
    public static void DisplayDetails(String UserName,char Grade) {

        System.out.println("The Name is: " + UserName
                + " The grade is : " + Grade + " respectively.");
    }

        public static void DisplayDetails(){
        System.out.println("I know nothing");


    }
}
// We cannot change the order of parameters while calling the method since we have made the order while declaring the method
// It should be followed while calling
// Just  by changing the return type of the method we cannot overload the method
// we change the number of parameters, datatype of the parameter, Sequence of the parameter
// Method overloading is the phenomenon of having multiple methods with the same method_name() but different arguments
// The difference between the arguments can either be the number of arguments or the datatype of arguments


// Method overloading helps  us to remember various methods as they have the same method name, and we can call them depending
// upon our requirements
// It improves the code re-usability and readability
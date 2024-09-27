package com.Java_Intro;

public class Quantity {
    public static void main(String[] args){
        double Budgetprice = (float) (1546.12);
        float floatPetrol = (float) (Budgetprice/84.11);
        float floatDiesel = (float) (Budgetprice/74.91);

        System.out.println("Petrol com.Operators.Quantity: "+floatPetrol);
        System.out.println("Diesel com.Operators.Quantity: "+floatDiesel);

        double doublePetrol =  (Budgetprice/84.11);
        double doubleDiesel =  (Budgetprice/74.91);
        System.out.println("Petrol com.Operators.Quantity: "+doublePetrol);
        System.out.println("Diesel com.Operators.Quantity: "+doubleDiesel);


        float petrol_quantity, diesel_quantity;
        Double petrol_quantity1, diesel_quantity1;
        float petrol_prices = 74.91f;
        float diesel_prices = 84.11f;
        float wallet_balance = 1546.12f;
        petrol_quantity = wallet_balance / petrol_prices;
        diesel_quantity = wallet_balance / diesel_prices;
        Double petrol_prices1 = 74.91;
        Double diesel_prices1 = 84.11;
        Double wallet_balance1 = 1546.12;
        petrol_quantity1 = wallet_balance1 / petrol_prices1;
        diesel_quantity1 = wallet_balance1 / diesel_prices1;

        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + petrol_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance + " is " + diesel_quantity);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + petrol_quantity1);
        System.out.println ("The quantity of petrol that we can buy in " +wallet_balance1 + " is " + diesel_quantity1);


        char myChar = 'A';
        char myChar2 = '1';
        System.out.println(myChar);
        System.out.println(myChar2);
        char myChar3 = (char) (myChar + myChar2);
        System.out.println(myChar3);

        char myUnicode = '\u0190';
        System.out.println(myUnicode);
        char myUnicode2 = '\u013f';
        System.out.println(myUnicode2);

        char maxValue = Character.MAX_VALUE;
        char minValue = Character.MIN_VALUE;
        System.out.println(maxValue);
        System.out.println(minValue);

        boolean myAgeis18 = false;
        if (myAgeis18 == true){
            System.out.println("You are eligible to vote");
        }
        if (!myAgeis18 == true){
            System.out.println("You are eligible to vote");
        }
        if (myAgeis18 == false){
            System.out.println("You are minor");
        }
        String myName = "My Name is Dhanush";
        String myAge = "My Age is 22 Years";
        String myPlace = "I am from Madurai";
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(myPlace);
        String myInfo = myName + myAge + myPlace;
        System.out.println(myInfo);
        System.out.println(myName + " "+ myAge+" "+myPlace);

        myName = myAge + myName;
        System.out.println(myName);

        int myInt = 100;
        myAge = myAge + myInt;
        System.out.println(myAge);

        String myInt1 ="100";
        String myInt2 = "200";
        int myInt3 = 300;
        double myDouble =545.1234;
        System.out.println(myInt1+myInt2+myInt3+myDouble);

        char myUnicode3 = '\u002B';
        System.out.println(myUnicode3);

        int myValue = 10;
        System.out.println(myValue);

        myValue = myValue+ 10;
        System.out.println(myValue);

        myValue = myValue -10;
        System.out.println(myValue);

        myValue = myValue*10;
        System.out.println(myValue);

        myValue = myValue/10;
        System.out.println(myValue);

        myValue = 10%3; // % symbol is the reminder operator which gives the remainder when 10 is divided by 3
        System.out.println(myValue);

        myValue +=10; // It is same as myValue = myValue + 10
        System.out.println(myValue);

        myValue -=10;
        System.out.println(myValue);

        myValue *=10;
        System.out.println(myValue);

        myValue /=10;
        System.out.println(myValue);

        //myValue = myValue + 1;
        myValue ++;
        System.out.println(myValue);

        //myValue = myValue -1;
        myValue = 100;
        myValue --;
        System.out.println(myValue);



     }
}

//Char: Char is a primitive data type and it represents a single character
// We define char in java program using single quote ('a')
// We cannot do operation on Char data type such as add , sub, div, multiply
// Arithmetic and Bitwise operation cannot be performed on Char data type
// Char in Java take 2 bytes (16 bit) storage memory
// What we have imported / inputed in the array at the end.
// Denoting flags while coding
// Width of the Char is 2 bytes / 16 bits
// Bloolean: In Java it is used to store two values either TRUE or FALSE.
// Datatypes:
// int-32 bit, byte - 8 bits, short - 16 bits, long - 64 bit
// float- 32 bit, double - 64 bits
// Char - 16 bit, boolen - 1 bit
// String is a special datatype in Java which is used to define a sequence of characters having a storage width equal to 2.14 billion
// String are always immutable when we declare a string it can never be changed
// While appending Integer to a string it converts the integer to string
// String is actually a class not datatype and it is immutable
// whenever we are creating new string with same variable name the old string will be deleted
// Operators, Operands & Expression:
// Operator in Java is a symbol which is used to perform
// Operands indicate what items to apply the action to
// An expression is a combination of one or more operators, ans zero or more pairs of parentheses
// Expression: a = b+c-d
// Operators: =,+,_
// Operands: a,b,c,d
// = --> It is called as assignment operator it is used for assigning values to a variable
// == --> It is equal to operator it checks whether given value is equal or greather or lower it like boolean datatypes
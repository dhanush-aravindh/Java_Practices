package com.Java_Intro;

public class DataTypes {
    public static void main(String[] args) {
        /// int value2= 1111111111111111111111;
        //System.out.println(value2);
        int maxRange = Integer.MAX_VALUE;
        int minRange = Integer.MIN_VALUE;
        System.out.println(maxRange);
        System.out.println(minRange);
        int sum1 = maxRange + 1;
        int sum2 = minRange - 1;
        System.out.println(sum1);
        System.out.println(sum2);
        byte maxValue = Byte.MAX_VALUE;
        byte minValue = Byte.MIN_VALUE;
        System.out.println("Byte Max value is " + maxValue);
        System.out.println("Byte Min value is " + minValue);

        short maxVal = Short.MAX_VALUE;
        short minVal = Short.MIN_VALUE;
        System.out.println("Short Max val: " + maxVal);
        System.out.println("Short Min val: " + minVal);

        long maxValue1 = Long.MAX_VALUE;
        long miniValue1 = Long.MIN_VALUE;
        System.out.println(maxValue1);
        System.out.println(miniValue1);

        short myvalue =32767;
        long veryLongValue = 21474836478769L;
        System.out.println(myvalue);
        System.out.println(veryLongValue);
        byte newByteValue = maxValue;
        System.out.println(newByteValue);
        byte newByteValue2 = (byte) (maxValue/2);
        System.out.println(newByteValue2);

        short newValue = (short) (myvalue/2);
        System.out.println(newValue);
        ;

        int a = 200000;
        byte b = 100;
        short c = 32767;
        int sum = a+b+c;
        long d = 1000 * sum;
        System.out.println(d);

        short shortSum =(short) d;
        System.out.println("Short Sum: " +shortSum);


        float floatMaxValue = Float.MAX_VALUE;
        float floatMinValue = Float.MIN_VALUE;
        System.out.println(floatMaxValue);
        System.out.println(floatMinValue);

        double doubleMaxValue = Double.MAX_VALUE;
        double doubleMinValue = Double.MIN_VALUE;
        System.out.println(doubleMaxValue);
        System.out.println(doubleMinValue);


        int x = 10;
        //float y =  (float)10.0;
        float y =  10.0F;
        double z = 10.0d;

        int intValue = 22/7;
        float floatValue = 22f/7f;
        double doubleValue = 22d/7d;
        System.out.println("Int Value: " + intValue);
        System.out.println("float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);


    }
}
// Java has eight primitive data types
// int,long,float, double, long,byte,boolean & Char
// Every integer has some range some maximum and minimum value
// Int data type has a minimum value of -2^31 and a maximum value of 2^31-1
// Integer range (2147483647 ,-2147483648)
// Overflow occurs when we assign such value to a variable which is more than the maximum permissible value;
// It overflows from the maximum range to minimum range we add values to maximum range
// Underflow occurs when we assign such value to a variable which is less than the minimum permissible value;
// It Underflows from the minimum range to maximum range we subtract values from the minimum range
// Byte has a minimum value of  -128 and a maximum value of 127(inclusive)
// Byte is the rarest used datatype in Java
// Short has a minimum value of -32,768 and a maximum value of 32,767(inclusive)
// Shift + ins (0) to fix the block cursor issue
// long has a minimum value of -2^63 and a maximum value of 2^63-1
// Casting: Converting a number from one data type to a different one is called casting in java.
// Challenge: Declare threee varaibles and initialize them with some valid values. one of type int,one of type byte, and one of tyoe short
// Finally create a variable of tyoe long which is equal to 1000 times the sum of the above values
// floating Point: float and Double
// the range of float data type in JAVA is : 3.40282347 * 10^38 - 1.40239846 * 10^-45
// float is called single precision and double is called double precision.
// The range of double value in JAVA is 1.7976931348623157*10^308 - 4.94065645864124654*10^-324.
// Bit size of float is 32 bits and bit size of double is 64 bits
// Double is prefered most because it is faster for calculations
// Big Decimal is the most precise floating value
// To get precise value in double we can use .0 or d after the given integer
// Challenge: Calculate the quantity of Petrol and diesel in a budget of 1546.12 Rs according to respective prices 84.11,74.91

package com.Java_Intro;

public class MethodChallenge {
    // Declare a string containing a student name,
    // declare a integer variable conataining marks of student from 0 to 100;
    // Create a method to calculate the grade of a student based on marks
    // Then finally create another method to display the student name and grade.

    public static void main(String[] args){
        String Student_name = "Dhanush ";
        int Student_Marks = 85;
        DisplayDetails("Dhanush",67);
        DisplayDetails("Aadhi",46);
        char Student_Grade = gradeCalculator(Student_Marks);
        DispDetails(Student_name,Student_Grade);

    }



    public static char gradeCalculator(int Student_Marks) {
       // this.Student_Marks = Student_Marks;
        char Grade;



        if (Student_Marks > 90 && Student_Marks <= 100) {
            Grade = 'S';
        } else if (Student_Marks > 80 && Student_Marks <= 90) {
            Grade = 'B';
        } else if (Student_Marks > 70 && Student_Marks <= 80) {
           Grade = 'C';
        } else if (Student_Marks > 60 && Student_Marks <= 70) {
            Grade = 'D';
        } else if ( Student_Marks > 50 && Student_Marks <= 60) {
            Grade = 'E';
        } else if (Student_Marks > 40 && Student_Marks <= 50) {
            Grade = 'F';
        } else {
            Grade = 'R';
        }
         return Grade;
    }
    public static void DisplayDetails(String name,int Student_Marks){

        char FinalGrade = gradeCalculator(Student_Marks);
        System.out.println("Name: "+ name + "\n"+"Grade: "+ FinalGrade);

    }

     public static void DispDetails(String Name,char Student_Grade){
         System.out.println("The Student Name:" + Name + "\n" + "His Grade:" + Student_Grade);

     }

}


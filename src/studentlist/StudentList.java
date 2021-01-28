package studentlist;

import java.util.Scanner;

public class StudentList {

    public static void main(String[] args) {

        Student[] students = new Student[4];
        
        Scanner input = new Scanner(System.in);
        
        //assign
        for (int i = 0; i < students.length; i++) {
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i] = student;
        }
        //display
        System.out.print("The student's name are ");
        for (Student student: students){
            System.out.printf("%s, ", student.getName());
            
        }

    }
    
}

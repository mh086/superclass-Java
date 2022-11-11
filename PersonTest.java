
package Question_1;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Student Name: ");
        String student_name = scan.nextLine();
        System.out.println("Enter the Student's year of birth: ");
        int student_yearOfBirth = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Student's Major: ");
        String student_major = scan.nextLine();
        Student s = new Student(student_name, student_yearOfBirth, student_major);

        System.out.println("Enter the Instructor Name: ");
        String instructor_name = scan.nextLine();
        System.out.println("Enter Instructor's year of birth: ");
        int instructor_yearOfBirth = scan.nextInt();
        System.out.println("Enter Instructor's Salary: ");
        int instructor_salary = scan.nextInt();
        Instructor i = new Instructor(instructor_name, instructor_yearOfBirth, instructor_salary);

        System.out.println("Student Details: ");
        System.out.println(s.toString());
        System.out.println("-------------------------");
        System.out.println("Instructor Details: ");
        System.out.println(i.toString());
    }

}
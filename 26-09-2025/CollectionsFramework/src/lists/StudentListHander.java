package lists;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListHander {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while (true) {
            System.out.println("1. Add Student 2. Read Student 3. Exit");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter Student Details");
                System.out.print("Please enter Student ID: ");
                int id = sc.nextInt();
                System.out.print("Please enter Student Name: ");
                sc.nextLine();
                String name =  sc.nextLine();
                        System.out.print("Please enter Student Marks: ");
                float score = sc.nextFloat();

                Student student = new Student(id, name, score);
                students.add(student);
                student = null;
                break;
            case 2:
                System.out.println("Please refer Student Details");
                for (Student studt : students) {
                    System.out.println(studt);
                }
                break;
            case 3:
                System.out.println("Thanks for using the app!");
                sc.close();
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");

            }
        }

    }
}

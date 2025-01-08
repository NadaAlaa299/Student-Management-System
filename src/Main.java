import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();

        while (true)
        {
            System.out.println("\n< Student Management System >");
            System.out.println("1) Add Student");
            System.out.println("2) Show Students");
            System.out.println("3) Find Student by ID");
            System.out.println("4) Remove Student by ID");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();

                switch (choice){
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Student Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        Student student = new Student(id, name, age);
                        manager.addStudent(student);
                        System.out.println("Student added successfully");
                        break;
                    case 2:
                        manager.showStudents();
                        break;
                    case 3:
                        System.out.print("Enter Student ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        student = manager.findStudent(id);
                        if (student != null)
                        {
                            System.out.println("Student found: " + "Name -> " + student.getName() + ", Age-> " + student.getAge());
                        }
                        else
                        {
                            System.out.println("Student not found");
                        }
                        break;
                    case 4:
                        System.out.print("Enter Student ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        manager.removeStudent(id);
                        System.out.println("Student removed successfully");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        System.exit(0);
                }
            } catch (Exception e)
            {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}
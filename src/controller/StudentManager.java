package controller;

import model.Student;
import storage.ReadFile;
import storage.WriteFile;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> studentList;
    Scanner scanner = new Scanner(System.in);

    public StudentManager() {
        studentList = new ArrayList<>();
        Student student = new Student(1,"cong",23,"nam","bg",6);
        Student student1 = new Student(2,"chung",24,"nam","bg",8);
        Student student2 = new Student(3,"tuan",33,"nam","bg",9);
        Student student3 = new Student(4,"nam",30,"nam","bg",7);
        Student student4 = new Student(5,"hai",26,"nam","bg",10);
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
    }
    public void displayInfo(){
        for (Student student : studentList) {
            System.out.println(student);
            System.out.println("Enter enter to display the next student information.");
            scanner.nextLine();
        }
        while (true){
            System.out.println("You can choice:");
            System.out.println("1. Add student.");
            System.out.println("2. Update student.");
            System.out.println("3. Delete student.");
            System.out.println("4. Exit.");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    addStudent();
                    break;
                case "2":
                    updateStudent();
                    break;
                case "3":
                    deleteStudent();
                    break;
                case "4":
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }}
    }
    public void addStudent(){
        Student student = new Student();
        System.out.println("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student1 : studentList) {
            if (student1.getIdStudent()==id){
                System.out.println(" Student id has existed.");
                return;
            }
        }
        student.setIdStudent(id);
        System.out.println("Enter name: ");
        student.setName(scanner.nextLine());
        System.out.println("Enter age:");
        student.setAge(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter gender: ");
        student.setGender(scanner.nextLine());
        System.out.println("Enter address: ");
        student.setAddress(scanner.nextLine());
        System.out.println("Enter averageScore");
        student.setAverageScore(scanner.nextDouble());
        scanner.nextLine();
        studentList.add(student);
        System.out.println("Add success.");
    }
    public void updateStudent(){
        System.out.println("Enter id student need update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student : studentList) {
            if (student.getIdStudent()==id){
                while (true){
                    System.out.println("Please choose the function: ");
                    System.out.println("1. Update id student: ");
                    System.out.println("2. Update name student: ");
                    System.out.println("3. Update age student: ");
                    System.out.println("4. Update gender student: ");
                    System.out.println("5. Update address student: ");
                    System.out.println("6. Update averageScore: ");
                    System.out.println("7. Exit: ");
                    System.out.println("Your choice: ");
                    String choice = scanner.nextLine();
                    switch (choice){
                        case "1":
                            System.out.println("Enter id: ");
                            student.setIdStudent(scanner.nextInt());
                            scanner.nextLine();
                            break;
                        case "2":
                            System.out.println("Enter name: ");
                            student.setName(scanner.nextLine());
                            break;
                        case "3":
                            System.out.println("Enter age: ");
                            student.setAge(scanner.nextInt());
                            scanner.nextLine();
                            break;
                        case "4":
                            System.out.println("Enter gender: ");
                            student.setGender(scanner.nextLine());
                            break;
                        case "5":
                            System.out.println("Enter address: ");
                            student.setAddress(scanner.nextLine());
                            break;
                        case "6":
                            System.out.println("Enter AverageScore: ");
                            student.setAverageScore(scanner.nextDouble());
                            scanner.nextLine();
                            break;
                        case "7":
                            return;
                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                }
            }
        }
        System.out.println("Can not find students. ");
    }
    public void deleteStudent(){
        System.out.println("Enter id student need delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Student student : studentList) {
            if (student.getIdStudent()==id){
                while (true){
                System.out.println("You definitely want to delete students:");
                System.out.println("1. Yes");
                System.out.println("2. No");
                String choice = scanner.nextLine();
                    switch (choice){
                    case "1":
                        studentList.remove(student);
                        System.out.println("Delete success.");
                        return;
                    case "2":
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }}
            }
        }System.out.println("Can not find students. ");
    }
    public void sort() {
                while (true){
                    System.out.println("Sort students by average score ");
                    System.out.println("Please choose the function: ");
                    System.out.println("1. Sort up ascending: ");
                    System.out.println("2. Sort decreasing: ");
                    System.out.println("3. Exit: ");
                    System.out.println("Your choice: ");
                    String choice = scanner.nextLine();
                    switch (choice){
                        case "1":
                            studentList.sort(Comparator.comparing(Student::getAverageScore));
                            System.out.println("Sort success.");
                            return;
                        case "2":
                            studentList.sort(Comparator.comparing(Student::getAverageScore).reversed());
                            System.out.println("Sort success.");
                            return;
                        case "3":
                            return;
                        default:
                            System.out.println("Invalid option. Please try again.");
                    }
                }
    }
    public void readFromFile(){
        ReadFile<Student> readFile = ReadFile.getReadFile();
        studentList = readFile.readFile();
    }
    public void writeToFile(){
        WriteFile<Student> writeFile = WriteFile.getWriteFile();
        writeFile.writeFile(studentList);
    }
    public void menu(){
        while (true){
            System.out.println("--- Student Management Program ---");
            System.out.println("Please choose the function: ");
            System.out.println("1. Display list student: ");
            System.out.println("2. Add new student: ");
            System.out.println("3. Update student: ");
            System.out.println("4. Delete student: ");
            System.out.println("5. Sort list: ");
            System.out.println("6. Read in the file: ");
            System.out.println("7. Write in the file: ");
            System.out.println("8. Exit: ");
            System.out.println("Your choice: ");
            String choice = scanner.nextLine();
            switch (choice){
                case "1":
                    displayInfo();
                    break;
                case "2":
                    addStudent();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    deleteStudent();
                    break;
                case "5":
                    sort();
                    break;
                case "6":
                    readFromFile();
                    break;
                case "7":
                    writeToFile();
                    break;
                case "8":
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}

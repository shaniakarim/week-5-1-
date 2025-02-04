package main;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", "12345");
        Student student2 = new Student("Bob Smith", "67890");

        Course course1 = new Course("Object-Oriented Programming", 30);
        Course course2 = new Course("Data Structures", 25);

        System.out.println("Students:");
        System.out.println(student1.getName() + " (" + student1.getStudentId() + ")");
        System.out.println(student2.getName() + " (" + student2.getStudentId() + ")");

        System.out.println("\nCourses:");
        System.out.println(course1.getCourseName() + " - Max Students: " + course1.getMaxStudents());
        System.out.println(course2.getCourseName() + " - Max Students: " + course2.getMaxStudents());
    }
}

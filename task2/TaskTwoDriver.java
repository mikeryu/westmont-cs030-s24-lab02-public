/**
 * Westmont College Spring 2024
 * CS 030 Lab 02, Task 2
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

package task2;

public class TaskTwoDriver {
    static Student notGrowingStudent = new Student(
            "Fancy",
            "Smartypants",
            1234, 4.5000,
            Student.ClassLevel.SOPHOMORE
    );

    static Student fastGrowingStudent = new Student(
            "Always",
            "Trymybesty",
            567891, 2.7324,
            Student.ClassLevel.FRESHMAN
    );

    public static void main(String[] args) {
        System.out.println("\n`notGrowingStudent` has the following attributes:");
        printStudentInfoManually(notGrowingStudent);

        System.out.println("\n`fastGrowingStudent` has the following attributes:");
        printStudentInfoManually(fastGrowingStudent);

        System.out.println("\nHere's the current roster:");
        System.out.println(notGrowingStudent);
        System.out.println(fastGrowingStudent);

        System.out.println("\nOh, looks like `notGrowingStudent` just failed a class!");
        notGrowingStudent.setGPA(4.15);

        System.out.println("Oh, looks like `fastGrowingStudent` just aced two classes!");
        fastGrowingStudent.setGPA(3.05);

        System.out.println("\nHere's the updated roster:");
        System.out.println(notGrowingStudent);
        System.out.println(fastGrowingStudent);

        if (notGrowingStudent.getGPA() != 4.15) throw new AssertionError();
        if (fastGrowingStudent.getGPA() != 3.05) throw new AssertionError();

        System.out.println("\nLet's move everyone up a year!");
        notGrowingStudent.moveUpAYear(3.99);
        fastGrowingStudent.moveUpAYear(3.10);

        System.out.println("\nHere's the updated roster:");
        System.out.println(notGrowingStudent);
        System.out.println(fastGrowingStudent);

        if (notGrowingStudent.getGPA() != 3.99) throw new AssertionError();
        if (notGrowingStudent.getClassLevel() != Student.ClassLevel.JUNIOR) throw new AssertionError();

        if (fastGrowingStudent.getGPA() != 3.10) throw new AssertionError();
        if (fastGrowingStudent.getClassLevel() != Student.ClassLevel.SOPHOMORE) throw new AssertionError();

        System.out.println("\nLet's move everyone up another year!");
        notGrowingStudent.moveUpAYear(3.32);
        fastGrowingStudent.moveUpAYear(3.34);

        System.out.println("\nHere's the updated roster:");
        System.out.println(notGrowingStudent);
        System.out.println(fastGrowingStudent);

        if (notGrowingStudent.getGPA() != 3.32) throw new AssertionError();
        if (notGrowingStudent.getClassLevel() != Student.ClassLevel.SENIOR) throw new AssertionError();

        if (fastGrowingStudent.getGPA() != 3.34) throw new AssertionError();
        if (fastGrowingStudent.getClassLevel() != Student.ClassLevel.JUNIOR) throw new AssertionError();

        System.out.println("\nWhat happens if we try to set a bad GPA?");
        try {
            notGrowingStudent.setGPA(9000.00);
        } catch (IllegalArgumentException e) {
            if (!e.getMessage().equals("GPA must be between 0.0 and 4.5")) throw new AssertionError(
                    "Expected an error message that reads: 'GPA must be between 0.0 and 4.5'"
            );

            System.out.println();
            e.printStackTrace(System.out);
            System.out.println("\nDon't panic! This error message (kind of) is expected.");
        }

        System.out.println("\nNo AssertionErrors now? Good job, you're almost done with Task 2 now!");
    }

    public static void printStudentInfoManually(Student s) {
        System.out.println("    First Name: " + s.getFirstName());
        System.out.println("     Last Name: " + s.getLastName());
        System.out.println("     ID Number: " + s.getIdNum());
        System.out.println("           GPA: " + s.getGPA());
        System.out.println("   Class Level: " + s.getClassLevel());
    }
}

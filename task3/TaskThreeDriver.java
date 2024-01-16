/**
 * Westmont College Spring 2024
 * CS 030 Lab 02, Task 3
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

package task3;

import task2.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskThreeDriver {

    public static void main(String[] args) {
        Scanner fileScanner;
        ArrayList<Student> studentList;

        String nonexistentFilePath = "this_file_does_not_exist!";
        fileScanner = InputOutput.getFileScanner(nonexistentFilePath);
        if (fileScanner != null) {
            throw new AssertionError("Expected fileScanner to be null.");
        } else {
            /*
             * Method call below should print the following output to the console:
             *
             * Could not open this_file_does_not_exist!
             */
            InputOutput.printFileError(nonexistentFilePath, "open");
        }

        String badFilePath = "task3/badfile.csv";
        fileScanner = InputOutput.getFileScanner(badFilePath);
        if (fileScanner == null) throw new AssertionError("Expected fileScanner to be NOT null.");

        try {
            InputOutput.getStudentsFromFileScanner(fileScanner);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            /*
             * Method call below should print the following output to the console:
             *
             * Could not read task3/badfile.csv
             */
            InputOutput.printFileError(badFilePath, "read");
        }

        fileScanner = InputOutput.getFileScanner("task3/students.csv");
        if (fileScanner == null) throw new AssertionError("Expected fileScanner to be NOT null.");

        studentList = InputOutput.getStudentsFromFileScanner(fileScanner);
        if (studentList.size() != 3) throw new AssertionError("Expected to have 3 students here.");

        /* Method call below should print the following output to console:
         *
         * [ID #002345] Class level:   ALUMNUS | GPA: 3.7500 | Name: Ryu, Mike
         * [ID #002346] Class level:    JUNIOR | GPA: 4.0000 | Name: Ryu, Jessica
         * [ID #002347] Class level:  FRESHMAN | GPA: 3.6000 | Name: Ryu, Autumn
         */
        InputOutput.printStudents(studentList);

        /* Method call below should print the following output to console:
         *
         * task2.Student ID #002345 has a GPA of 3.7500.
         * task2.Student ID #002346 has a GPA of 4.0000.
         * task2.Student ID #002347 has a GPA of 3.6000.
         */
        InputOutput.printStudentIDsAndGPAs(studentList);
    }
}

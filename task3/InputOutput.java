/**
 * Westmont College Spring 2024
 * CS 030 Lab 02, Task 3
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 * @author Boaty McBoatface bmcboatface@westmont.edu TODO: replace this with your info.
 */

package task3;

import task2.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Library of static methods that perform inputs and outputs (I/O).
 */
public class InputOutput {

    /**
     * Given a path to a file, returns a Scanner that reads from the specified file.
     *
     * @param filePath path to a file to create and return a Scanner object from.
     * @return Scanner if the file opened successfully, null otherwise.
     */
    public static Scanner getFileScanner(String filePath) {
        // TODO: Complete the method body.
        // HINT: Use a try-catch construct.
        //       Instantiate a File object and pass it to the constructor of Scanner.
        //       If the filePath could not be found (exception thrown), catch it and return null.

        return null; // TODO: Replace this with your own logic.
    }

    /**
     * Parses the student information using the Scanner object passed in.
     *
     * @param fileScanner Scanner object created on an input file that contains task2.Student information.
     * @return ArrayList of task2.Student objects parsed from the file the Scanner object was created on.
     */
    public static ArrayList<Student> getStudentsFromFileScanner(Scanner fileScanner) {
        // TODO: Complete the method body.
        // HINT: Use a while loop; keep going as long as Scanner still has remaining line(s) to return.
        //       Split a line from the file into tokens (split by a comma `,`), then index (e.g., [0], [1], ..._)
        //           each of the tokens in a resulting array to create arguments to pass to Student's constructor.
        //       Add each Student you instantiate to an ArrayList of Students then return it at the end.

        return null; // TODO: Replace this with your own logic.
    }

    /**
     * Prints the task2.Student ID and GPA to the console in a specific format.
     *
     * Format:
     *      task2.Student ID #NNNNNN has a GPA of N.NNNN.
     *
     * task2.Student ID number must be a 6-digit 0-paded integer.
     * task2.Student GPA must be a single integer, decimal (.), then 4-decimal digit floating point number.
     *
     * @param students ArrayList of task2.Student objects to display their task2.Student IDs and GPAs.
     */
    public static void printStudentIDsAndGPAs(ArrayList<Student> students) {
        // TODO: Complete the method body.
        // HINT: Use a for-each loop and string formatting with `printf`.
        //       Refer to the task3/inst_out for the exact formatting example.
    }

    /**
     * Prints each student in the list given to the console using task2.Student's toString method.
     *
     * @param students ArrayList of task2.Student objects to display.
     */
    public static void printStudents(ArrayList<Student> students) {
        // TODO: Complete the method body.
        // HINT: Use a for-each loop and rely on the toString method of Student class.
    }

    /**
     * Prints the string "Could not [open|read] ⟪filename⟫" to the console.
     *
     * @param fileName Name of the file that caused an error.
     * @param kind What kind of error occurred: either "open" or "read."
     */
    public static void printFileError(String fileName, String kind) {
        // TODO: Complete the method body.
        // HINT: See the `TaskThreeDriver` and task3/inst_out for the example output.
    }

    /**
     * Converts the given class level string (e.g., "FRESHMAN") to the task2.Student.ClassLevel enum.
     *
     * @param classLevelStr Case-sensitive string representation of the task2.Student.ClassLevel enum.
     * @return The corresponding task2.Student.ClassLevel enum object.
     */
    private static Student.ClassLevel parseClassLevel(String classLevelStr) {
        /* DO NOT MODIFY THIS METHOD -- USE IT AS GIVEN */
        return switch (classLevelStr) {
            case "NON_MATRICULATED" -> Student.ClassLevel.NON_MATRICULATED;
            case "FRESHMAN" -> Student.ClassLevel.FRESHMAN;
            case "SOPHOMORE" -> Student.ClassLevel.SOPHOMORE;
            case "JUNIOR" -> Student.ClassLevel.JUNIOR;
            case "SENIOR" -> Student.ClassLevel.SENIOR;
            case "ALUMNUS" -> Student.ClassLevel.ALUMNUS;
            default -> null;
        };
    }
}

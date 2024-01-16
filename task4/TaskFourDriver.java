/**
 * Westmont College Spring 2024
 * CS 030 Lab 02, Task 4
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

package task4;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskFourDriver {

    private static final String[] VALID_SUBJECT_CODES = {"CS", "DA", "MA", "EB"};
    private static final Integer[] VALID_NUM_UNITS = {1, 2, 4};
    private static final double VALID_MAX_STUDY_HOURS = 112.0;

    public static void main(String[] args) {
        ArrayList<Course> myCourses = new ArrayList<>();
        myCourses.add(new Course("Class Voice", "MU", 7, 2, 4.0));
        myCourses.add(new Course("DS & A in Java", "CS", 30, 4, 160.0));
        myCourses.add(new Course("Senior Seminar", "CS", 195, 4, 8.0));
        myCourses.add(new Course("Discrete Math", "MA", 15, 3, 6.0));

        CourseValidator cv = new CourseValidator(
                new ArrayList<>(Arrays.asList(VALID_SUBJECT_CODES)),
                new ArrayList<>(Arrays.asList(VALID_NUM_UNITS)),
                VALID_MAX_STUDY_HOURS
        );

        System.out.println("\nBefore validation, my courses looked like:");
        for (Course c : myCourses) {
            System.out.println(c);
        }

        cv.validateCourses(myCourses);
        System.out.println("\nAfter validation, my courses now look like:");
        for (Course c : myCourses) {
            System.out.println(c);
        }

        System.out.print("\nCourses that had validation issues were: ");
        System.out.println(cv.getInvalidCourseIDs() + " from above.");
    }
}

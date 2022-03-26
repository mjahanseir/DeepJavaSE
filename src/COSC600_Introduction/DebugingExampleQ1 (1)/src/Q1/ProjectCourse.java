
/*
 *  [File header includes information about the file being submitted.]
 *  Date submitted:
 *  Assignment number:
 *  Course name:  COSC 190
 *  Instructors: Andrea Grzesina, Sharon McDonald
 *  File path and name: J:\CST\ACOSC190\
 */


/*
 * Date submitted:
 * Assignment number:
 * Course: COSC 190
 * Instructors: Andrea Grzesina, Sharon McDonald
 * Path:  
 */
package Q1;

import java.util.Scanner;

/**
 *  Purpose: This class represents a project class where there are no exams.  
 *  This class allows marks to be provided only for assignments. 
 *
 * @author YOUR NAME AND CST NUMBER GO HERE
 */

/**
 * Purpose:
 * @author ins209
 */
public class ProjectCourse extends Course
{

    /**
     * Constructor for the ProjectCourse class.
     * @param name
     * @param numbAssignments
     * @param assignWeight
     * @param midtermWeight
     * @param finalWeight
     */
    public ProjectCourse(String name, int numbAssignments)
    {
        super(name, numbAssignments, 100, 0,0);
    }
   

    public void printCourseHeader()
    {
        //Print header for summary mark report, all assignments, followed by exams
        System.out.print("Course\t");
        for( int i = 1; i <= assignments.length; i++ )
        {
            System.out.print("\tAssign #" + i );
        }
        System.out.println("\t\tFinal Mark");
    }

    public void printCourseSummary()
    {
        System.out.println("Course Name: " + courseName );
        System.out.println("Number of Assignments: " + assignments.length );
    }
    
    public void printCourseMarks()
    {
        System.out.print( courseName);
        for( int i = 0; i < assignments.length; i++ )
        {
            System.out.print("\t\t" + assignments[i] + "\t" );
        }
        System.out.println("\t\t" + calculateFinalMark() );
       
    }
    

}

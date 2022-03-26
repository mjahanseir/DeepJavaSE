
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
package troubleshootDefective;

import java.io.Serializable;
import java.util.Scanner;

/**
 *  Purpose: Starting template for a new program. Replace these comments with
 *  your own. Briefly describe the purpose of the class, how the class is used
 *  in the program and how it interacts with other classes.
 *
 * @author YOUR NAME AND CST NUMBER GO HERE
 */

/**
 * Purpose:
 * @author ins209
 */
public class Student implements Serializable
{
    private String name;
    private Course[] courses;
    
    public Student( String name )
    {
        this.name = name;
        courses = new Course[0]; 
    }
    
    public void addCourse(Course c)
    {
        //Save contents of array
        Course[] tempArray = new Course[courses.length];
        System.arraycopy( courses, 0, tempArray, 0, courses.length);
        //Recreate array 1 bigger
        courses = new Course[ courses.length + 1];
        //Copy elements back
        System.arraycopy( tempArray, 0, courses, 0, tempArray.length );
        //Add new course
        courses[courses.length - 1] = c.clone();
    }
    
    public void displayMarkByCourse( String courseName )
    {
        boolean courseNotFound = true;
        
        for( int i = 0; i < courses.length && courseNotFound; i++ )
        {
            if ( courses[i].getCourseName().equals( courseName ) )
            {
                courseNotFound = false;
                System.out.println("\n" + name + ": " );
                courses[i].printCourseMarks();
            }
        }
    }
    
    public String getName()
    {
        return name;
    }

    public void printStudentSummary()
    {
        System.out.println("\nStudent: " + name );
        for( int i = 0; i < courses.length; i++ )
        {
            System.out.println();
            courses[i].printCourseHeader();
            courses[i].printCourseMarks();
        }
        System.out.println();
    }
    
    public void recordAssignMark( String courseName, int assignNumber )
    {
        boolean courseNotFound = true;
        for( int i = 0; i < courses.length && courseNotFound; i++ )
        {
            if ( courses[i].getCourseName().equals( courseName ) )
            {
                float mark = InputUtility.readFloat(
                        "Enter mark for " + name + ": " , 0, 100);
                courses[i].recordAssignMark( assignNumber, mark );
            }
        }
    }
    
    public void recordMidtermMark( String courseName)
    {
        boolean courseNotFound = true;
        for( int i = 0; i < courses.length && courseNotFound; i++ )
        {
            if ( courses[i].getCourseName().equals( courseName ) )
            {
                float mark = InputUtility.readFloat(
                        "Enter mark for " + name + ": " , 0, 100);
                courses[i].recordMidtermMark(  mark );
            }
        }
    }
    
    public void recordFinalMark( String courseName )
    {
        boolean courseNotFound = true;
        for( int i = 0; i < courses.length && courseNotFound; i++ )
        {
            if ( courses[i].getCourseName().equals( courseName ) )
            {
                float mark = InputUtility.readFloat(
                        "Enter mark for " + name + ": " , 0, 100);
                courses[i].recordFinalMark(  mark );
            }
        }
    }

}

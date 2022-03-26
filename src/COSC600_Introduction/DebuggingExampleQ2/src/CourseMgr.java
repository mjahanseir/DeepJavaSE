
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

import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

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
public class CourseMgr implements Serializable
{
    private Vector<Course> courseList;

    public CourseMgr()
    {
        courseList = new Vector<Course>();
    }

    public void addNewCourse()
    {
        String name = InputUtility.readString("Enter course name: " );
        int numbAssignments = InputUtility.readInt( "How many assignments?", 0,
                50);
        char hasExams = Character.toUpperCase( 
                InputUtility.readChar("Are there any exams?(y/n)","ynYN"));
        if ( hasExams == 'Y' )
        {
            int midtermWeight = 0;
            int finalWeight = 0; 
            System.out.println("Assign weights to the different components" 
                    + "(assignments/exams). The weights must sum to 100");
            do
            {
                midtermWeight = InputUtility.readInt(
                        "What weight should midterm exam have?(0 to 100 )", 0, 100 );
                finalWeight = InputUtility.readInt(
                        "What weight should final exam have?(0 to 100 )", 0, 100 );
                if ( midtermWeight + finalWeight > 100 )
                {
                   System.out.println("The combined weights for midterm and " +
                           "final exam cannot exceed 100.  Please re-enter");
                }
            } while( midtermWeight + finalWeight > 100  );

            int assignWeight = 100 - midtermWeight - finalWeight;
            System.out.println("Assignments will have the weight of " + 
                    assignWeight );
            Course c = new Course( name, numbAssignments, 
                    assignWeight, midtermWeight, finalWeight );
            courseList.add( c );
        }
        else
        {
            courseList.add( new ProjectCourse( name, numbAssignments ) );
        }
    }
    
    public void printCourses()
    {
        for( Course c : courseList )
        {
            System.out.println( "\n" + c.getCourseName() );
            c.printCourseSummary();
        }
        
    }
    public Course selectCourse()
    {
        Course selected = null;
        if ( courseList.size() == 1 )
        {
            selected = courseList.get(0);
        }
        else if ( courseList.size() > 1 )
        {
            System.out.println("Please select a course from the list below:");
            int index = 1;
            for( Course c : courseList )
            {
                System.out.println( index + " " + c.getCourseName() );
                index++;
            }
            int choice = InputUtility.readInt(
                    "Enter numeric index of course to select", 1, index );
            selected = courseList.get( choice - 1 );
        }
        return selected;
    }

}

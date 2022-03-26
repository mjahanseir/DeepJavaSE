
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
public class StudentMgr implements Serializable
{
    private Vector<Student> students;


    public StudentMgr()
    {
        students = new Vector<Student>();
    }


    public void createStudent()
    {
        String name = InputUtility.readString( "Please enter student's name" );
        Student s = new Student( name );
        students.add( s );
    }
    
    public void displayMarkByCourse( String courseName )
    {
        for( Student s : students )
        {
            s.displayMarkByCourse( courseName );
        }
    }
    
    public void recordAssignMark( String courseName, int assignNumber )
    {
        for( Student s : students )
        {
            s.recordAssignMark( courseName, assignNumber );
        }
    }
    
    public void recordMidtermMark( String courseName )
    {
        for( Student s : students )
        {
            s.recordMidtermMark( courseName );
        }
    }

    public void recordFinalMark( String courseName )
    {
        for( Student s : students )
        {
            s.recordFinalMark( courseName );
        }
    }
    
    public Student selectStudent()
    {
        Student selected = null;
        if ( students.size() == 1 )
        {
            selected = students.get(0);
        }
        else if ( students.size() > 1 )
        {
            System.out.println("Please select a student from the list below:");
            int index = 1;
            for( Student s : students )
            {
                System.out.println( index + " " + s.getName() );
                index++;
            }
            int choice = InputUtility.readInt(
                    "Enter numeric index of course to select", 1, index );
            selected = students.get( choice - 1 );
        }
        return selected;
    }
    
    public void displayStudentSummary()
    {
        System.out.println("Please select student from list using numeric index:");
        for( int i = 1; i <= students.size(); i++ )
        {
            System.out.println( i + ". " + students.get( i - 1 ).getName() );
        }
        int studentIndex = InputUtility.readInt( "", 1,
                students.size() );

        System.out.println();

        students.get( studentIndex ).printStudentSummary();

    }
}

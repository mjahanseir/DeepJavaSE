
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
public class Course implements Serializable, Cloneable
{
    protected String courseName;
    protected float[] assignments;
    private float midtermExam;
    private float finalExam;
    /*
     * Weights associated with each item
     *  0:  assignment weight
     *  1: midterm exam weight
     *  2: final exam weight
     */
    private int[] weights; 
    
    private static final int ASSIGNMENT_WEIGHT_INDEX = 0;
    private static final int MIDTERM_EXAM_WEIGHT_INDEX = 1;
    private static final int FINAL_EXAM_WEIGHT_INDEX = 2;
    
    private static final int NUMB_COMPONENTS = 3;
    
    public Course( String name, int numbAssignments, int assignWeight,
            int midtermWeight, int finalWeight )
    {
        if ( (assignWeight + midtermWeight + finalWeight)!= 100 )
        {
            throw new IllegalArgumentException( "The sum of the weights " + 
                    " for assignments and exams must equal 100");
        }
        courseName = name;
        assignments = new float[ numbAssignments];
        weights = new int[ NUMB_COMPONENTS ];
        weights[ASSIGNMENT_WEIGHT_INDEX] = assignWeight;
        weights[MIDTERM_EXAM_WEIGHT_INDEX] = midtermWeight;
        weights[FINAL_EXAM_WEIGHT_INDEX] = finalWeight; 
    }
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#clone()
     */
    /**
     * Purpose:
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Course clone() 
    {
        Course copy = null;
        try
        {
            copy = (Course) super.clone();
            //Deep copy - for object references and arrays
            copy.assignments = assignments.clone();
        }
        catch (CloneNotSupportedException e)
        {
            // TODO Auto-generated catch block
            System.out.println("Clone broke");
        }
        return copy;
    }


    public int getHighestAssigmentNumber()
    {
        return assignments.length;
    }
    public String getCourseName()
    {
        return courseName;
    }
    public void recordAssignMark( int assignNumber, float assignMark )
    {
        if ( assignNumber < 1 || assignNumber > assignments.length )
        {
            throw new IllegalArgumentException( 
                    "Assignment number is not valid based on number of "
                    + "assignments in this course: " + assignNumber );
        }
        assignments[assignNumber-1] = assignMark;
    }
    
    public void recordMidtermMark( float mark )
    {
        midtermExam = mark;
    }
    
    public void recordFinalMark( float mark )
    {
        finalExam = mark;
    }
    
    public float calculateFinalMark()
    {
        float assignmentAverage = 0;
        for( int i = 0; i < assignments.length; i++ )
        {
            assignmentAverage += assignments[i];
        }
        assignmentAverage = assignmentAverage / assignments.length;
        
        float finalMark = 
            (assignmentAverage *(weights[ASSIGNMENT_WEIGHT_INDEX]/100f )) +
            (midtermExam * ( weights[MIDTERM_EXAM_WEIGHT_INDEX] / 100f ) ) + 
            (finalExam * (weights[MIDTERM_EXAM_WEIGHT_INDEX]/100f ) );
        return finalMark;        
    }
    
    public void printCourseHeader()
    {
        //Print header for summary mark report, all assignments, followed by exams
        System.out.print("Course\t");
        for( int i = 1; i <= assignments.length; i++ )
        {
            System.out.print("\tAssign #" + i );
        }
        System.out.println("\tMidterm\t\tFinal Exam\t\tFinal Mark");
    }

    public void printCourseSummary()
    {
        System.out.println("Course Name: " + courseName );
        System.out.println("Number of Assignments: " + assignments.length );
        System.out.println("Weightings:  " + 
        		"\n  Assignments: " + weights[ASSIGNMENT_WEIGHT_INDEX] +
        		"\n  Midterm Exam: " + weights[MIDTERM_EXAM_WEIGHT_INDEX] +
        		"\n  Final Exam: " + weights[FINAL_EXAM_WEIGHT_INDEX]);
    }
    
    public void printCourseMarks()
    {
        System.out.print( courseName);
        for( int i = 0; i < assignments.length; i++ )
        {
            System.out.print("\t\t" + assignments[i] );
        }
        System.out.println("\t\t" + midtermExam + "\t\t\t" + finalExam +
                "\t\t" + calculateFinalMark() );
               
    }
}

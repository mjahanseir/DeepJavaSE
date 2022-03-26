
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

import java.util.Scanner;
import java.io.*;

/**
 *  Purpose: This class manages registration. It provides the menu menu
 *  options to the user and executes appropriate methods on CourseMgr and 
 *  StudentMgr class as required.
 *
 * @author CST100
 */
public class RegistrationMgr
{
    private CourseMgr cm = new CourseMgr();
    private StudentMgr sm = new StudentMgr();

    private final static String REGISTRATION_FILE = "regFile.bin";
    
    /**
     * 
     * Constructor for the RegistrationMgr class. Display initial message.
     */
    public RegistrationMgr()
    {
        System.out.println("Welcome to Student Registration System");
        readFile();
        while( true )
        {
            displayMainMenu();
            writeFile(); // Save Changes after every action
        }
    }

    /**
     * 
     * Purpose: Display main menu.
     */
    public void displayMainMenu()
    {
        System.out.println("\nPlease select from following options:" );
        System.out.println("\t1. Add course");
        System.out.println("\t2. Add student");
        System.out.println("\t3. Add course to student");
        System.out.println("\t4. Enter marks for course");
        System.out.println("\t5. Display marks by course");
        System.out.println("\t6. Display marks by student");
        System.out.println("\t7. Display all courses");
        System.out.println("\t8. Exit");
        getMenuAction();
    }
    
    /**
     * 
     * Purpose: Get action desired by user and take appropriate
     * action based on that choice. 
     */
    public void getMenuAction()
    {
        int choice = InputUtility.readInt( "Enter choice: ", 1, 8 );
        switch( choice )
        {
            case 1:
            {
                cm.addNewCourse();
                break;
            }
            case 2:
            {
                sm.createStudent();
                break;
            }
            case 3:
            {
                addCourseToStudent();
                break;
            }
            case 4:
            {
                enterMarkForCourse();
                break;
            }
            case 5:
            {
                displayMarkByCourse();
                break;
            }
            case 6:
            {
                displayMarkByStudent();
                break;
            }
            case 7:
            {
                cm.printCourses();
                break;
            }
            case 8:
            {
                System.exit( 0 );
            }
        }
    }

    /**
     * 
     * Purpose: Display mark by student action.
     */
    private void displayMarkByStudent()
    {
        Student s = sm.selectStudent();
        if ( s != null )
        {
            s.printStudentSummary();
        }
    }
    
    /**
     * 
     * Purpose:  Display mark by course action.
     */
    private void displayMarkByCourse()
    {
        Course c = cm.selectCourse();
        if ( c != null )
        {
            c.printCourseHeader();
            sm.displayMarkByCourse( c.getCourseName() );
        }
    }
    
    /**
     * 
     * Purpose: Add a course to student action.  
     */
    private void addCourseToStudent()
    {
        Student s = sm.selectStudent();
        Course c = cm.selectCourse();
        if ( s != null && c != null )
        {
            s.addCourse( (Course) c.clone() );
        }
    }
    
    /**
     * 
     * Purpose:  Enter mark by course
     */
    private void enterMarkForCourse()
    {
        Course c = cm.selectCourse();
        if ( c != null )
        {
            //ProjectCourse has no exams so don't ask type
            char type = 'A';

            if ( !( c instanceof ProjectCourse ) )
            {
                type = Character.toUpperCase( InputUtility.readChar(
                        "Enter mark for assignment(a), midterm(m) or final(f):",
                "aAmMfF") );
            }
            if ( type == 'A')
            {
                int assignNumber = InputUtility.readInt(
                        "Enter assignment number to enter mark for: ",
                        1, c.getHighestAssigmentNumber() );
                sm.recordAssignMark(c.getCourseName(), assignNumber);
            }
            else if ( type == 'M' )
            {
                sm.recordMidtermMark( c.getCourseName() );
            }
            else
            {
                sm.recordFinalMark( c.getCourseName() );
            }
        }
    }

    /**
     * 
     * Purpose:  Read current courses and students from file.   Read
     * using Object serialization. 
     */
    private void readFile()
    {
        ObjectInputStream ois = null;
        try
        {
            FileInputStream fis = new FileInputStream(new File( REGISTRATION_FILE ) );
            ois = new ObjectInputStream( fis );
            cm = (CourseMgr) ois.readObject();
            sm = (StudentMgr) ois.readObject();
        }
        catch (FileNotFoundException e)
        {
            //Do nothing - just assume first time
        }
        catch (IOException e)
        {
            System.out.println("IO error while reading file: " +
                    e.getMessage() );
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not find class during read: " +
                    e.getMessage() );
        }
        finally
        {
            if ( ois != null )
            {
                try
                {
                    ois.close();
                }
                catch (IOException e)
                {
                    System.out.println("Could not close input stream: " +
                            e.getMessage() );
                }
            }
        }
    }

    /**
     * 
     * Purpose:  Write current students and courses to file.  Uses Object
     * serialization. 
     */
    private void writeFile()
    {
        ObjectOutputStream oos = null;
        try
        {
            FileOutputStream fos = 
                new FileOutputStream( new File( REGISTRATION_FILE ) );
            oos = new ObjectOutputStream( fos );
            oos.writeObject( cm );
            oos.writeObject( sm );
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found during write: " +
                    e.getMessage() );
        }
        catch (IOException e)
        {
            System.out.println("IO exception during write: " + 
                    e.getMessage() );
        }
        finally
        {
            if ( oos != null )
            {
                try
                {
                    oos.close();
                }
                catch (IOException e)
                {
                    System.out.println("Could not close file during write: "
                            + e.getMessage() );
                }
            }
        }
    }
    
    /**
     * Purpose:  Main entry point for the program.
     * @param args  Command line arguments. 
     */
    public static void main(String[] args)
    {
        new RegistrationMgr();
    }

}

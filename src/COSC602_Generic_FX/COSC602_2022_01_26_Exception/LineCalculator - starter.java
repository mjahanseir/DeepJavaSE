//import java.util.Scanner;
//
//public class LineCalculator {
//    private double result;
//
//    private final static char ADD_OP = '+';
//    private final static char SUB_OP = '-';
//    private final static char MUL_OP = '*';
//    private final static char DIV_OP = '/';
//
//    private final static String CLEAR_CMD = "C";
//    private final static String QUIT_CMD = "Q";
//
//    private final static String PROMPT = "Enter [NUMBER] [OP] "
//            + "or [C] to clear or [Q] to quit: ";
//
//    public LineCalculator()
//    {
//        result = 0.0;
//    }
//
//    public void processKeyboardInput()
//    {
//        Scanner input = new Scanner( System.in );
//        boolean keepGoing = true;
//        while ( keepGoing )
//        {
//            displayResult();
//            System.out.println( PROMPT );
//            String line = input.nextLine();
//            keepGoing = processLine( line );
//        }
//    }
//
//    public boolean processLine( String line )
//    {
//        boolean doCalc = true;
//        line = line.trim().toUpperCase();
//        if ( line.equals( QUIT_CMD ) )
//        {
//            doCalc = false;
//        }
//        else if ( line.equals( CLEAR_CMD ) )
//        {
//            result = 0.0;
//        }
//        else
//        {
//            int spacePos = line.indexOf( ' ' );
//            String numString = line.substring( 0, spacePos );
//            double operand = Double.parseDouble( numString );
//            String opString = line.substring( spacePos ).trim();
//            char operator = opString.trim().charAt( 0 );
//            calculate(operand, operator);
//        }
//        return doCalc;
//    }
//
//    public void calculate( double operand, char operator )
//    {
//        switch ( operator )
//        {
//            case ADD_OP:
//                result += operand;
//                break;
//            case SUB_OP:
//                result -= operand;
//                break;
//            case MUL_OP:
//                result *= operand;
//                break;
//            case DIV_OP:
//                result /= operand;
//                break;
//            default:
//                System.out.println("Wrong Op");
//        }
//    }
//
//    public void displayResult()
//    {
//        System.out.println( "Result is: " + result );
//    }
//
//    public double getResult()
//    {
//        return result;
//    }
//
//    public static void main( String[] args )
//    {
//        LineCalculator calc = new LineCalculator();
//        calc.processKeyboardInput();
//
//    }
//}

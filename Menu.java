// All the program header comments are missing.  Replace them.
import java.util.Scanner;

public class Menu
{
    // You are allowed to place constants here, particularly if the same constant is being used in 
    // several different methods within this program.
    // In this course, you are NEVER EVER allowed to place variables here
    // (except for a Scanner which is attached to the keyboard, which may go here, if used.)

    // This is the constant for the user's command to exit.  You'll use this in part 3 of the lab.
    final static char EXIT = 'E';

    public static void main (String[] args)
    {
        printIdentification();
        testAllShapes();
    }
    
    private static void testAllShapes()
    {
        drawTriangle();
        printBlankLine();
        drawSquare();
        printBlankLine();
        drawDiamond();
        printBlankLine();
        drawLine(15);
        printBlankLine();
        System.out.println("Program Finished  .  Thanks for playing.");
    } // testAllShapes

    private static void drawSquare()
    {
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
    } // drawSquare

    private static void drawTriangle()
    {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
    } // drawTriangle

    private static void drawDiamond()
    {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *");
    } // drawDiamond

    private static void drawLine(int length)
    {
        final char STAR = '*';
        int count = 1;
    
        while (count <= length)
        {
            System.out.print(STAR);
            count++;
        }
    } // drawLine

    private static void printBlankLine() {
        System.out.println();
    } // printBlankLine
    
    private static void printIdentification()
    {
        System.out.println("### Lab 6: Menus   Author: Student Name  ###");
        System.out.println("### Course/Section - CPSC1150-7 ###");
        System.out.println("### St.# - 33550336 ###\n");
        System.out.println();
    } // printIdentification

    // ----------------------------------------------------------------------
    // The methods defined below are for part 3 of this lab.
    //
    
    // Insert interactiveMenu() method here.
    
    private static void displayMenu()
    {
        // you'll need to do something here so that I have a menu to use
        System.out.println("Your menu goes here");
        System.out.println( "(" + EXIT + ")xit -- Exit the program" );
    } // displayMenu

    private static boolean isValidInput(char character)
    {
		// Initially let's *assume* that every character that the user types is valid
		return true;
		
        // Obviously the above assumption is false and we will need to verify 
		// whether the character is valid or not.
		
		// Comment out the above return statement and uncomment the one below.
		// Now fix it so it works for all desired inputs.
        // return (character == EXIT); // test if the character is the EXIT character
    } // isValidInput

    private static void doCommands(char command)
    {
        // you will need to do something with command in this method
        if (command == EXIT) // test if the command is the EXIT command
        {
            ; // do nothing when you exit
        }
        else
        {    
            // When all the modifications to this program are completed, this statement should never appear.
			System.out.println("doCommands method discovered an unknown command: '" + command + "'");
        }
    } // doCommands
    
}
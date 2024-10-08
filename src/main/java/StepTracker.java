/*  INSTRUCTIONS
 * This class StepTracker will be used to create an object with a parameter 
 * that defines the minimum number of steps that must be taken for a day to 
 * be considered 'active'. This class will also have methods that allow the 
 * user to add daily steps, return the number of active days, and return the 
 * average steps.
 * 
 * The StepTracker class will provide a constructor and the following methods.
 * addDailySteps:   accumulates information about steps, in readings taken once per day
 * activeDays:      returns the number of active days
 * averageSteps:    returns the average number of steps per day, calculated by dividing 
 *                  the total number of steps taken by the number of days tracked
 * 
 * Example of class and methods being used:
 * 
 * Statements                   Value Returned      Comments
 * StepTracker tr = new                             Days with at least 10,000 are considered active.
 *      StepTracker(10000);
 * tr.activeDays();                 0               activeDays has a default vaule of 0
 * tr.averageSteps();               0.0             averageSteps has a default value of 0.0
 * tr.addDailySteps(9000);                          This day has too few steps to be considered active
 * tr.addDailySteps(5000);                          This day has too few steps to be considered active
 * tr.activeDays();                 0               No days had at least 10,000 steps
 * tr.averageSteps();               7000.0          The average number of steps per day is (14000 / 2)
 * tr.addDailySteps(13000);                         This day is considered active
 * tr.activeDays();                 1               One day out of three is considered active
 * tr.averageSteps();               9000.0          The average number of steps per day is (27000 / 3)
 */

 // COMPLETE THIS CLASS
public class StepTracker {
    /* INSERT ANY VARIABLES BELOW HERE
     * Global variables should be private
     * You may need to declare at least 4 variables
     */




    /* INSERT CONSTRUCTOR BELOW
     * This constructor will have one parameter of type integer
     * Constructors need to have the same name as it's class, start with a capitalized
     * letter, and be public.
     */




    /* INSERT addDailySteps METHOD BELOW
     * This method will have one parameter of the type integer.
     * This method will return nothing.
     * This method needs to be public
     */




    /* INSERT activeDays METHOD BELOW
     * This method has no parameters.
     * This method will return an integer
     */

    


    /* INSERT averageSteps METHOD BELOW
     * This method has no parameters.
     * This method will return a double.
     */




    public static void main(String[] args) {
        // Uncomment the following code to test your class
        
        // StepTracker tr = new StepTracker(10000);
        // System.out.print("Expected: 0       ");
        // System.out.println("Result: " + tr.activeDays());
        // System.out.print("Expected: 0.0     ");
        // System.out.println("Result: " + tr.averageSteps());
        // tr.addDailySteps(9000);
        // tr.addDailySteps(5000);
        // System.out.print("Expected: 0       ");
        // System.out.println("Result: " + tr.activeDays());
        // System.out.print("Expected: 7000.0  ");
        // System.out.println("Result: " + tr.averageSteps());
        // tr.addDailySteps(13000);
        // System.out.print("Expected: 1       ");
        // System.out.println("Result: " + tr.activeDays());
        // System.out.print("Expected: 9000.0  ");
        // System.out.println("Result: " + tr.averageSteps());
    }
}

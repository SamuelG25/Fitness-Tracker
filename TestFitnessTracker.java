/*
 * Test Fitness Tracker
 * Author: S.G.
 * 2/3/21.
 */
package testfitnesstracker;

import java.time.LocalDate;

public class TestFitnessTracker {

    public static void main(String[] args) {
        //declare new objects
       FitnessTracker exercise1 = new FitnessTracker();
       //Chaneg the date of exercises
       LocalDate date = LocalDate.of(2021,2,2);
       
       FitnessTracker exercise2 = new FitnessTracker("biking", 45 ,date);
       FitnessTracker exercise3 = new FitnessTracker("weightlifting",55,date);
       
       
       //Print activity ,times ,and dates
       System.out.println("Exercise 1: ");
       System.out.println("Activity: " + exercise1.getActivity() );
       System.out.println("Time: " + exercise1.getMinutes());
       System.out.println("Date: " + exercise1.getDate() + "\n"); 
       
       System.out.println("Exercise 2: ");
       System.out.println("Activity: " + exercise2.getActivity() );
       System.out.println("Time: " + exercise2.getMinutes());
       System.out.println("Date: " + exercise3.getDate() + "\n"); 
       
       System.out.println("Exercise 3: ");
       System.out.println("Activity: " + exercise3.getActivity() );
       System.out.println("Time: " + exercise3.getMinutes());
       System.out.println("Date: " + exercise3.getDate() + "\n"); 
       
       
       
    }
    
}

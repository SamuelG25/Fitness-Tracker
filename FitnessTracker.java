/*
 * Fitness Tracker
 * Author: S.G.
 * 2/3/21.
 */
package testfitnesstracker;

import java.time.LocalDate;
import java.time.Month;

public class FitnessTracker {
    //Variables
    String activity;
    int minutes;
    LocalDate date;
    
    
    //Constrcutor
    public FitnessTracker(String activityname,int minutes, LocalDate dateValue){
        activity = activityname;
        this.minutes = minutes;
        date = dateValue;
        
        
    }
    
    
    public FitnessTracker(){
        this("running", 0 , LocalDate.of(2021, 1, 1));
        
        
    }
    public String getActivity(){//returns the activity name
        return activity;
    }
    
    public int getMinutes(){ //returns the minutes
        return minutes;
        
    }
    
    public LocalDate getDate(){ // return the date
        return date;
    }
    
}

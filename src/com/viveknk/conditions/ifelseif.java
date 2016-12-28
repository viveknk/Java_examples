
package com.viveknk.conditions;

public class ifelseif {
    
    public static void main(String[] args) {
        
        String day="sunday";
        
        if(day.equalsIgnoreCase("sunday")){
             System.out.println("Today is sunday");
        }
        else if(day.equalsIgnoreCase("monday")){
             System.out.println("Today is monday");
        }
        else if(day.equalsIgnoreCase("tueday")){
             System.out.println("Today is tueday");
        }
        else if(day.equalsIgnoreCase("wednesday")){
             System.out.println("Today is wednesday");
        }
        else if(day.equalsIgnoreCase("thrusday")){
             System.out.println("Today is thrusday");
        }
        else if(day.equalsIgnoreCase("friday")){
             System.out.println("Today is friday");
        }
        else{
            System.out.println("Today is Saturday");
        }
        
    }
}

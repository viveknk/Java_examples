
package com.viveknk.conditions;

import java.util.Scanner;

public class switchcase {
   
    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number :");
        int day=s.nextInt();
        
       switch(day){
           case 1:{
                System.out.println("sunday");
                break;                          // we must give break otherwise it will execute other cases also
           }
           case 2:{
                System.out.println("monday");
                break;
           }
           case 3:{
                System.out.println("tuesday");
                break;
           }
           case 4:{
                System.out.println("wednesday");
                break;
           }
           case 5:{
                System.out.println("thrusday");
                break;
           }
           case 6:{
                System.out.println("friday");
                break;
           }
           case 7:{
                System.out.println("saturday");
                break;
           }    
           default : {
               System.out.println("Please enter between 1 to 7");
           } 
        }
      
        
    }
}

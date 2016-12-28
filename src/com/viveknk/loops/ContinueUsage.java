
package com.viveknk.loops;

public class ContinueUsage {

     public static void main(String[] args) {
        
         int i=0;
         System.out.println("loop 1");
         while(i<=30){
              i++;      
             if(i==5 || i==10 || i==20){
                 continue;
             }
             else{
                 System.out.println(i);
             }
                       
         } 
         System.out.println("loop 2");
         while(i<=30){
             i++; 
             if(i==5 || i==10 || i==20){
                 continue;
             }
             else{
                 System.out.println(i);
             }
                             
         }  
    }
}

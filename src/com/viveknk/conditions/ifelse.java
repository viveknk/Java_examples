
package com.viveknk.conditions;

import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter value for a :");
        int a=s.nextInt();
        if(a%2==0){
            System.out.println("you entered value is even");
        }
        else
        {
            System.out.println("you entered value is odd");
        }       
    }
}

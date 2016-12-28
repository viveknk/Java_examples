
package com.viveknk.loops;

public class ContinueUsingLabel {
    
    public static void main(String[] args) {
        outerloop:
        for (int i=0; i < 5; i++) {
            for (int j=0; j < 5; j++) {
                if (i * j > 6) {
                    System.out.println("Breaking");
                    continue outerloop;
                }
            System.out.println(i + " " + j);
            }
        }
        System.out.println("Done");   
    }
}

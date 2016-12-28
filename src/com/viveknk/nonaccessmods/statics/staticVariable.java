
package com.viveknk.nonaccessmods.statics;

class staticVariable{  
    static int count=0;//will get memory only once and retain its value  
  
staticVariable(){  
    count++;  
    System.out.println(count);  
}  
  
public static void main(String args[]){    
    staticVariable c1=new staticVariable();  
    staticVariable c2=new staticVariable();  
    staticVariable c3=new staticVariable();   
 }  
}  

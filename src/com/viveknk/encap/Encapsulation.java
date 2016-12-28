
package com.viveknk.encap;

 class Student{  
    private String name;  
   
    public String getName(){  
        return name;  
    }  
    public void setName(String name){  
        this.name=name;  
    }  
}
public class Encapsulation{
    public static void main(String a[]){
        Student s=new Student();  
        s.setName("vijay");  
        System.out.println(s.getName());  
    }
}
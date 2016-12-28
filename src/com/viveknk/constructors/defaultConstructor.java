
package com.viveknk.constructors;

    class defaultConstructor{  
        int id;  
        String name;  
  
    void display(){System.out.println(id+" "+name);}  
  
    public static void main(String args[]){  
        defaultConstructor s1=new defaultConstructor();  
        defaultConstructor s2=new defaultConstructor();  
        s1.display();  
        s2.display();  
    }  
}  

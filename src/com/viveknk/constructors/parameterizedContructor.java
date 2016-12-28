
package com.viveknk.constructors;

class parameterizedContructor{  
    int id;  
    String name;  
      
    parameterizedContructor(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
        parameterizedContructor s1 = new parameterizedContructor(111,"Karan");  
        parameterizedContructor s2 = new parameterizedContructor(222,"Aryan");  
        s1.display();  
        s2.display();  
   }  
}  

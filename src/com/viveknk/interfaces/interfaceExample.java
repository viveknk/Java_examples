
package com.viveknk.interfaces;

interface Printable{  
    void print();  
    }  
  
interface Showable{  
    void show();  
    }  
  
class interfaceExample implements Printable,Showable{  
  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
  
    public static void main(String args[]){  
        interfaceExample obj = new interfaceExample();  
        obj.print();  
        obj.show();  
      }  
  }  

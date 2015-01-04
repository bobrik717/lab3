package classes;

import java.io.*;

public class Person {
    public String Name;
    public int Age;
    private static long Totals = 0;
    
    public Person(){
        Person.Totals++;
    }
    
    public Person(String name, int age){
        this();
        this.Name = name;
        this.Age = age;        
    }
    
    public static long getTotals(){
        return Person.Totals;
    }
    
    public static void showTotal(){
        System.out.printf("Totals %d\n",Person.Totals);
    }
    
    public void show(){
//        System.out.printf("%s - %d \n",this.Name,this.Age);
        this.show(System.out);
    }
    
    public void show(PrintStream s){
        s.print(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%s - %d \n",this.Name,this.Age);
    }
}

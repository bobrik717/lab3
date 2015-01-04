package main;

import classes.Person;
import classes.Singleton;
import classes.Staf;
import math.AvergeParams;
import math.Test;
public class Main {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        p1.Name = "Konstantin";
//        p1.Age = 27;
        Person p1 = new Person("Konstantin",27);
        Person p3 = new Person();
        Test t1 = new Test();
        Person p2 = p1;
        p2.Age = 26;        
        p1.show();
        t1.incrementAge(p1);
        p1.show();
        int x = 10;
        int y = 20;
        AvergeParams a1 = new AvergeParams(x, y);
        System.out.println( t1.averageOut( a1 ) );
        System.out.printf("x = %d\ny = %d\n",a1.a,a1.b);
        Person.showTotal();
        System.out.println(t1.average(1,4,7,9,60,63,78,65,34,2));
        System.out.println("********************************************");
        Staf st = new Staf("Konstantin",27,1,100000);
        st.show();
        System.out.println(Staf.getTotals());
        
        Singleton singl1 = Singleton.getInstance();
        Singleton singl2 = Singleton.getInstance();
        Singleton singl3=  Singleton.getInstance();
    }    
}

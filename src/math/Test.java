package math;
import classes.Person;
public class Test {
    public void incrementAge(Person p){
        p.Age++;
    }
    
    public double average(int a,int b){
        double avr = (a + b) / 2D;
        return avr;
    }
    
    public double average(double a,double b){
        double avr = (a + b) / 2D;
        return avr;
    }
    
    public double average(int... a){
        long s = 0L;
        for(int i: a){
            s += i;
        }
        return (double)s/a.length;
    }
    public double averageOut(AvergeParams a1){
        a1.a *= 10;
        a1.b *= 10;
        double avr = (a1.a + a1.b) / 2D;
        return avr;
    }
}

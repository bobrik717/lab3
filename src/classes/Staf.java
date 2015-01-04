package classes;

public class Staf extends Person{
    public int Number;
    public double Salary;
    
    public Staf(String name, int age, int number, double salary){
        super(name,age);
        this.Number = number;
        this.Salary = salary;
    }

//    @Override
//    public void show() {
//        super.show();        
//    }

    @Override
    public String toString() {
        return String.format("%d - %g \n %s",this.Number,this.Salary,super.toString());
    }
    
}

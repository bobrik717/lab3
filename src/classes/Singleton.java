package classes;


public class Singleton {
    public String data;
    private static Singleton instance;
    private Singleton(){
        this.data = "Hello";
    }
    
    public static Singleton getInstance(){
        if(Singleton.instance == null)
            Singleton.instance = new Singleton();
        return Singleton.instance;
    }
}

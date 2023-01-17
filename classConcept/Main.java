class Person{
    
    int def;
    private int Pid;
    protected int dob;
    public String name;
    public static int id=0;

    Person(){
        this.Pid = ++id;
    }

    public int getId()
    {
        return this.Pid;
    }
}


class Employee{
}

public class Main{
    public static void main(String[] args)
    {

    }
}
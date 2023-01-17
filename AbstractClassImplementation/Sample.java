abstract class Shape
{
    public abstract void area();
    public abstract void perimeter();

    public void printShape()
    {
        System.out.println("It is a shape and you can use many functionalities of it like calculating area and perimetr of the shape");
    }
}

class Square extends Shape
{
    public int a;
    Square(int a)
    {
        this.a = a;
    }
    public void area()
    {
        System.out.println("The Area of the square with side " + this.a + " is : "+a*a);
    }

    public void perimeter()
    {
        System.out.println("The Perimeter of the square with side " + this.a + " is : "+4*a);
    }
}

class Traingle extends Shape
{
    public int base, height;
    Traingle(int base, int height)
    {
        this.base = base;
        this.height = height;
    }
    public void area()
    {
        System.out.println("The Area of the triangle is : "+base*height/2);
    }

    public void perimeter()
    {
        System.out.println("The Perimeter of the traingle is : "+3*base);
    }
}

public class Sample {
    public static void main(String[] args) {

        // Shape p = new Shape();  This will give error that we cannot instanciate it because it is abstract class BUT
        // Shape p ; This will not give any error because the object is not instanciated

        System.out.println("\nTesting Square Class");
        Square sq = new Square(5);
        sq.printShape();
        sq.area();
        sq.perimeter();

        System.out.println("\nTesting Traingle Class");
        Traingle t = new Traingle(8, 10);
        t.printShape();
        t.area();
        t.perimeter();
    }
}

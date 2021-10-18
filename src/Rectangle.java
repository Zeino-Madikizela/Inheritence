public class Rectangle extends Point
{
    //Object fields
    double length;
    double breadth;


    //Default constructor, x,y,z and side = 0
    public Rectangle()
    {
        super();
        length = 0;
        breadth = 0;
    }


    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    //Initialize x,y and side
    public Rectangle(int x, int y, double length, double breadth)
    {
        super(x, y);
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int x, int y, int z)
    {
        super(x, y, z);
        this.length = 0;
        this.breadth = 0;
    }

    public Rectangle(int x, int y, int z, double length, double breadth)
    {
        super(x, y, z);
        this.length = length;
        this.breadth = breadth;
    }

    //Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    // Rectangle Methods

    public void setSides(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    // Set both sides to one side...
    public void setSides(double side)
    {
        this.length = side;
        this.breadth = side;
    }

    public double calcArea()
    {
        return this.length *this.breadth;
    }

    public double calPerimeter()
    {
        return 2*this.length + 2*this.breadth;
    }

    public double calPerimeter(double length, double breadth)
    {
        return 2*length + 2*breadth;
    }

    public double calcArea(double length, double breadth)
    {
        return length *breadth;
    }

}

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

    //Initialize x,y and side
    public Rectangle(int x, int y, double length, double breadth)
    {
        super(x, y);
        this.length = length;
        this.breadth = breadth;
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

    //Rectangle Methods

    public void setSides(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public double rectanglePerimeter(double length, double breadth)
    {
        return 2*length + 2*breadth;
    }

    public double rectangleArea(double length, double breadth)
    {
        return length *breadth;
    }

}

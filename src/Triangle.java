public class Triangle extends Point
{
    double height;
    double length;
    double side1;
    double side2;
    double side3;

    //Constructors
    public Triangle()
    {
        super();
        this.height = 0;
        this.length = 0;
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(int xCoord, int yCoord)
    {
        super(xCoord, yCoord);
        this.height = 0;
        this.length = 0;
        this.zCoord = 0;
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(int xCoord, int yCoord, int zCoord)
    {
        super(xCoord, yCoord, zCoord);
        this.height = 0;
        this.length = 0;
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;

    }

    public Triangle(int xCoord, int yCoord, int zCoord, double length, double height)
    {
        super(xCoord, yCoord, zCoord);
        this.height = height;
        this.length = length;
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    //Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public void setSides(double side1, double side2, double side3 )
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double perimeter()
    {
        return (side1 + side2 + side3);
    }

    public double perimeter(double side1, double side2, double side3)
    {
        return side1 + side2 + side3;
    }

    public double area ()
    {
        return (height + length)/2;
    }
    public double area(double height, double length)
    {
        return (height+length)/2;
    }

}

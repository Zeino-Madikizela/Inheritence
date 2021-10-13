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

    public String showSides()
    {

        return "\nSide 1 is : " + this.side1 + "\nSide 2 is : " + this.side2 + "\nSide 3 is : " + this.side3 + "\n";
    }

    public double perimeter()
    {
        return (this.side1 + this.side2 + this.side3);
    }

    public double perimeter(double side1, double side2, double side3)
    {
        return side1 + side2 + side3;
    }

    /**This area method needs all three sides in order to calculate the area
     * s stands for the Semi Perimeter, the equation is called the Heron's Formula
     */
    public double area ()
    {
        double s = perimeter()/2;
        return Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5);
    }

}

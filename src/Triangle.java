public class Triangle extends Point
{
    double side1;
    double side2;
    double side3;

    //Constructors
    public Triangle()
    {
        super();
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //Getters and Setters

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

        return "\nSide 1 is\t: " + this.side1 + "\nSide 2 is\t: " + this.side2 + "\nSide 3 is\t: " + this.side3 + "\n";
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

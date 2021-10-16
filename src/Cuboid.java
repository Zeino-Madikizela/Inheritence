public class Cuboid extends Rectangle
{
    //Fields
    double height;


    //Constructors

    public Cuboid()
    {
        super();
        this.height = 0;

    }

    public Cuboid(double length, double breadth, double height)
    {
        super(length, breadth);
        this.height = height;
    }

    public double area()
    {
        return (length*breadth + breadth*height + length*height)*2;
    }

    public double volume()
    {
        return length*breadth*height;
    }

    //Accommodating a cube where all sides are equal
    public void setSides(double side) {
        super.setSides(side, side);
        this.height = side;
    }

    public void setSides(double length, double breadth, double height) {
        super.setSides(length, breadth);
        this.height = height;
    }

    public String getSides()
    {
        return "\nLength\t: " + length + "\nBreadth\t: " + breadth + "\nHeight\t: " + height;
    }
}

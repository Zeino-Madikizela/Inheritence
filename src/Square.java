public class Square extends Point
{
    //Object fields
    double side;

    //Default constructor, x,y,z and side = 0
    public Square()
    {
        super();
        side = 0;
    }

    //Initialize x,y and side
    public Square(int x, int y, double side)
    {
        super(x, y);
        this.side = side;
    }

    public Square(int x, int y, int z, double side)
    {
        super(x, y, z);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Square Methods
    public double calcPerimeter(double side)
    {
        return 4*side;
    }

    public double calcArea(double side)
    {
        return Math.pow(side, 2);
    }

    public double calcPerimeter()
    {
        return 4*this.side;
    }

    public double calcArea()
    {
        return Math.pow(this.side, 2);
    }

}

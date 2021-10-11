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

    public double squarePerimeter(double side)
    {
        double perimeter;

        perimeter = 4*side;
        return perimeter;
    }

    public double squareArea(double side)
    {
        double area;

        area = Math.pow(side, 2);
        return area;
    }

}

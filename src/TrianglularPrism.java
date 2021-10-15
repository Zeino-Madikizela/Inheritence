public class TrianglularPrism extends Triangle
{

    //Fields
    double height;

    //Constructors
    public TrianglularPrism()
    {
        super();
        this.height = 0;
    }

    public TrianglularPrism(double side1, double side2, double side3, double height )
    {
        super(side1, side2, side3);
        this.height = height;
    }

    //Methods

    public String showDimensions()
    {
        return super.showSides() + "height is\t: ";
    }

    public double area()
    {
        double areaOfTriangles, areaOfRectangles;
        areaOfTriangles = 2*super.area();
        areaOfRectangles = height*(side1 + side2 + side3);
        return areaOfTriangles + areaOfRectangles;
    }

}

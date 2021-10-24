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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //Methods

    public void setSidesAndHeight(double side1, double side2, double side3, double height)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.height = height;

    }

    public String showDimensions()
    {
        return super.showSides() + "height is\t: ";
    }

    public double calcArea()
    {
        double areaOfTriangles, areaOfRectangles;
        areaOfTriangles = 2*super.calcArea();
        areaOfRectangles = height*(side1 + side2 + side3);
        return areaOfTriangles + areaOfRectangles;
    }

   public double calcVolume()
    {
        return super.calcArea()*this.height;
    }

}

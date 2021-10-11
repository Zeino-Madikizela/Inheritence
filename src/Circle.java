import java.lang.Math;

public class Circle extends Point
{
    //Object fields
    int center;
    double radius;
    final double pi = Math.PI;


    //Default Constructor, x,y,z and radius = 0
    public Circle()
    {
        super();
        radius = 0;
    }

    //Initialize x,y and radius to a value
    public Circle(int xCoord, int yCoord, int radius){
        super(xCoord, yCoord);
        this.radius = radius;
    }

    //Initialize x,y,z and radius to a value
    public Circle(int xCoord, int yCoord,int zCoord ,int radius){
        super(xCoord, yCoord, zCoord);
        this.radius = radius;
    }

    //Methods for the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public String printCenter() {
        return "(" + getxCoord() + ", " + getyCoord()  + ", " + getzCoord()+ ")";
    }

    public double printRadius(){
        return getRadius();
    }

    public double circleArea(){
        double area;
        area = pi*Math.pow(radius, 2);
        return area;
    }

    public double circlePerimeter(){
        double perimeter;
        perimeter = 2*pi*radius;
        return perimeter;
    }


}


public class Cylinder extends Circle
{
    double height;
    String center =  super.printCenter();

    //setting height
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(){
        return height;
    }

    //A method to set the coordinates of the center of the Cylinder Object
    public void setCenter(int xCoord,int yCoord)
    {
        super.setxCoord(xCoord);
        super.setyCoord(yCoord);
        super.setzCoord(0);
    } //If two parameters are entered


    public void setCenter(int xCoord,int yCoord,int zCoord)
    {
        super.setxCoord(xCoord);
        super.setyCoord(yCoord);
        super.setzCoord(zCoord);
    }//If three parameters are entered

    public void setAllPoints(int xCoord,int yCoord,int zCoord, double radius, double height)
    {
        super.setxCoord(xCoord);
        super.setyCoord(yCoord);
        super.setzCoord(zCoord);
        super.setRadius(radius);
        setHeight(height);
    }


    public Cylinder()
    {
        super();
        this.height = 0;
    }

    public Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public double cylinderVolume()
    {
        return super.calcArea()*height;
    }

    public double cylinderArea()
    {
        return super.calcPerimeter() * (getHeight() + getRadius());
    }


}

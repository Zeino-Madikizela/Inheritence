public class Triangle extends Point
{
    double height;
    double length;

    //Constructors
    public Triangle()
    {
        super();
        this.height = 0;
        this.length = 0;
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


}

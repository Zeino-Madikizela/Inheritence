public class Point
{
    int xCoord;
    int yCoord;
    int zCoord;

    //Methods for xCoords
    public void setxCoord(int xCoord) {
        this.xCoord = xCoord;
    }

    public int getxCoord() {
        return xCoord;
    }

    //Methods for yCoords
    public void setyCoord(int yCoord) {
        this.yCoord = yCoord;
    }

    public int getyCoord()
    {
        return yCoord;
    }

    //Methods for zCoords
    public void setzCoord(int zCoord) {
        this.zCoord = zCoord;
    }

    public int getzCoord() {
        return zCoord;
    }

    //Default Constructor
    public Point()
    {
        this.xCoord = 0;
        this.yCoord = 0;
        this.zCoord = 0;
    }

    public Point(int xCoord, int yCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = 0;
    }

    public Point(int xCoord, int yCoord, int zCoord)
    {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.zCoord = zCoord;
    }

    public String showCoordinates(){
        String coordinates;
        coordinates = "(" + getxCoord() + ", " + getyCoord() + ", " + getzCoord() + ")";
        return coordinates;
    }


}

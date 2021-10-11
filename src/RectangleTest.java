
class RectangleTest {

    public static void main(String[] args)
    {
        //Create the Cylinder Object
        Rectangle myRectangle = new Rectangle();

        //The Perimeter and Area of the Rectangle
        System.out.println("The perimeter of the Rectangle with length : " + myRectangle.getLength() + " and breadth " + myRectangle.getBreadth()+ " is " + myRectangle.rectanglePerimeter(myRectangle.getLength(), myRectangle.getBreadth() ) );
        System.out.println("The area of the Rectangle with length : " + myRectangle.getLength() + " and breadth " + myRectangle.getBreadth()+ " is " + myRectangle.rectangleArea(myRectangle.getLength(), myRectangle.getBreadth() ) + "\n");


        //Testing the setters
        myRectangle.setLength(5);
        myRectangle.setBreadth(10);
        System.out.println("The perimeter of the Rectangle with length : " + myRectangle.getLength() + " and breadth " + myRectangle.getBreadth()+ " is " + myRectangle.rectanglePerimeter(myRectangle.getLength(), myRectangle.getBreadth() ) );
        System.out.println("The area of the Rectangle with length : " + myRectangle.getLength() + " and breadth " + myRectangle.getBreadth()+ " is " + myRectangle.rectangleArea(myRectangle.getLength(), myRectangle.getBreadth() ) + "\n");

        //Testing the setSides method
        myRectangle.setSides(6, 8);
        System.out.println("The perimeter of the Rectangle with length : " + myRectangle.getLength() + " and breadth " + myRectangle.getBreadth()+ " is " + myRectangle.rectanglePerimeter(myRectangle.getLength(), myRectangle.getBreadth() ) );
        System.out.println("The area of the Rectangle with length : " + myRectangle.getLength() + " and breadth " + myRectangle.getBreadth()+ " is " + myRectangle.rectangleArea(myRectangle.getLength(), myRectangle.getBreadth() ) );

        //All tested and work
    }
}

class TriangleTest {
    public static void main(String[] args)
    {
        Triangle myTriangle = new Triangle();

        //Print current coordinates
        System.out.println("These are the coordinates of the shape : " + myTriangle.showCoordinates());

        //Print the sides                                                                                               //Passed
        System.out.print("These are the sides of the shape : " + myTriangle.showSides());

        //Test the setters for coordinates                                                                              //Passed
        myTriangle.setxCoord(1);
        myTriangle.setyCoord(3);
        myTriangle.setzCoord(5);
        System.out.println("\nThese are the new points : " + myTriangle.showCoordinates());



    }

}
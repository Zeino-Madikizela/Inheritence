
class TriangleTest {
    public static void main(String[] args)
    {
        Triangle myTriangle = new Triangle();

        //Print current coordinates                                                                                     //Passed
        System.out.println("These are the coordinates of the shape : " + myTriangle.showCoordinates());

        //Print the sides                                                                                               //Passed
        System.out.print("These are the sides of the shape : " + myTriangle.showSides());

        //Test the setters for coordinates and sides                                                                    //Passed
        myTriangle.setxCoord(1);
        myTriangle.setyCoord(3);
        myTriangle.setzCoord(5);
        System.out.println("\nThese are the new points : " + myTriangle.showCoordinates());

        myTriangle.setSide1(5);
        myTriangle.setSide2(4);
        myTriangle.setSide3(6);

        //Test the setCoordinates method                                                                                //Passed
        myTriangle.setCoordinates(2,4,1);
        System.out.println("\nThese are the new points : " + myTriangle.showCoordinates());

        //Set the sides                                                                                                 //Passed
        myTriangle.setSides(3,4,5);


        //Test the getters                                                                                              //Passed
        System.out.println("The x coordinate is : "+ myTriangle.getxCoord() );
        System.out.println("The y coordinate is : "+ myTriangle.getyCoord() );
        System.out.println("The z coordinate is : "+ myTriangle.getzCoord() );
        System.out.println("Side 1 is : "+ myTriangle.getSide1() );
        System.out.println("Side 2 is : "+ myTriangle.getSide2() );
        System.out.println("Side 3 is : "+ myTriangle.getSide3() );

        //Testing the area and perimeter                                                                                //Passed
        System.out.println("The Perimeter is : " + myTriangle.calcPerimeter());
        System.out.println("The Area is : " + myTriangle.calcArea() );
    }

}
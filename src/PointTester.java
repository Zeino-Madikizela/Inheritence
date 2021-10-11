public class PointTester
{
    public static void main(String[] args)
    {
        //Creating the Point Object                             //Success
        Point myPoint = new Point();

        //Printing the Point Object's current Coordinates       //Success
        System.out.print("These are the current coordinates: ");
        System.out.println( myPoint.showCoordinates() );

        //Setting new coordinates                               //Success
        myPoint.setxCoord(4);
        myPoint.setyCoord(2);
        myPoint.setzCoord(6);

        System.out.print("These are the new set of coordinates: ");
        System.out.println( myPoint.showCoordinates() );

        System.out.println("\n" + "Individual Coordinates will be printed");


        //Printing out individual coordinates                   //Success

        System.out.println("The x coordinate is : " + myPoint.getxCoord() );
        System.out.println("The y coordinate is : " + myPoint.getyCoord() );
        System.out.println("The z coordinate is : " + myPoint.getzCoord() );



    }//main method
}

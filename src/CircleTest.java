public class CircleTest
{
    public static void main(String[] args)
    {
        //Creating the circle Object
        Circle myCircle = new Circle();

        //Printing it's parameters                                              //Success
        System.out.println( "The center is : " + myCircle.printCenter() );
        System.out.println("The radius is : " + myCircle.printRadius() );

        //Setting the new center                                                //Success
        myCircle.setxCoord(4);
        myCircle.setyCoord(6);
        myCircle.setzCoord(2);
        myCircle.setRadius(9);

        System.out.println("\n" + "The new center is : " + myCircle.printCenter() );
        System.out.println("The new radius is : " + myCircle.getRadius() );

        //Performing calculations
        System.out.println("\n" + "The Perimeter of the circle is : " + myCircle.calcPerimeter() + " units" );
        System.out.println("The area of the circle is : " + myCircle.calcArea() + " square units");

    }
}

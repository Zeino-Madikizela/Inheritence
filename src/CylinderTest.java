class CylinderTest
{

    public static void main(String[] args)
    {
        //Create the Cylinder Object
        Cylinder myCylinder = new Cylinder();

        //Printing the Point Object's current Coordinates                                                               //Success
        System.out.print("These are the current coordinates of the base : ");
        System.out.println( myCylinder.printCenter() + "\n");

        //setting the new center with setters                                                                           //Success

        System.out.println("Testing the setters");
        myCylinder.setxCoord(2);
        myCylinder.setyCoord(3);
        myCylinder.setzCoord(0);

        System.out.println("The new center of the base is : " + myCylinder.printCenter() + "\n");

        System.out.println("Setting the center with the setCenter method");
        myCylinder.setCenter(5,2);
        System.out.println("The new center is : " + myCylinder.printCenter() + "\n" );

        //Testing the area and Volume methods  | area should with r = 0 and h = 0 should be 0.0                         //Success
        System.out.println("The total area of the cylinder with radius = " + myCylinder.getRadius() + " and height "+ myCylinder.getHeight() + " is " + myCylinder.cylinderArea() );
        System.out.println("The volume of the cylinder with base area = " + (int)myCylinder.circleArea() + " is " + myCylinder.cylinderVolume() + "\n" );



        //setting the height and radius                                                                                 //Success
        myCylinder.setRadius(5);
        myCylinder.setHeight(12);

        //Testing the setRadius, setHeight and getRadius and getHeight  | Area with r = 5 and h = 12 should be                                                 //Success
        System.out.println("The radius is : " + myCylinder.getRadius() + " and the height is : " + myCylinder.getHeight());

        //Testing the area and Volume methods                                                                           //Success
        System.out.println("The total area of the cylinder with radius = " + myCylinder.getRadius() + " and height "+ myCylinder.getHeight() + " is " + myCylinder.cylinderArea() );
        System.out.println("The volume of the cylinder with base area = " + (int)myCylinder.circleArea() + " is " + myCylinder.cylinderVolume() + "\n" );


    }

}
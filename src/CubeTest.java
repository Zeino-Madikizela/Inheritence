class CubeTest
{

    public static void main(String[] args)
    {
        //Creating the object
        Cube myCube = new Cube();

        //Set the sides to all be 10                                                                                    //Passed
        myCube.setSides(10);

        //Calculating the total area, should be 600                                                                     //Passed
        System.out.println("The area is : " + myCube.calArea() + " units^2");
        //Calculating the volume
        System.out.println("The volume is " + myCube.calVolume() + "units^3");
        System.out.println("\nThe sides are : " + myCube.getSides());                                                   //Passed

    }


}
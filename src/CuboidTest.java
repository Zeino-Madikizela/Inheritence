class CuboidTest
{

    public static void main(String[] args)
    {
        //Creating the Object Cuboid and getSides method                                                                /Passed
        Cuboid myCuboid = new Cuboid();
        System.out.println("The current sides are : " + myCuboid.getSides());

        //Testing the setSides method
        myCuboid.setSides(5,5,9);                                                                   //Passed
        System.out.println("Points after setting : l=5,b=5 and h=9");
        System.out.println(myCuboid.getSides());

        //Testing the calculations                                                                                      //Passed
        System.out.println("The total surface area is : " + myCuboid.area() + " units^2");
        System.out.println("The volume is             : " + myCuboid.volume() + " units^3");

    }
}
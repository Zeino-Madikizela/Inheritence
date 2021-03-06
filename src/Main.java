import javax.swing.JOptionPane;

public class Main
{
     public static void main(String[] args)
     {
         String input;
         int choice;
         input = JOptionPane.showInputDialog("Please choose what you will be doing in this app \n1. Calculations of shapes");
         choice = Integer.parseInt(input);
         if (choice == 1 )
         {
             calShapes();
         }

         else
         {
             JOptionPane.showMessageDialog(null, "You have selected an invalid option");
         }

     }

     //Class variables
    static String input;
    static int choice;

    /**2D Shapes **********************************************
     * 1. Circle
     * 2. Rectangle
     * 3. Square
     * 4. Triangle
     */

     public static void calCircle()
     {
         double radius;
         boolean calcArea, calcPerimeter = false;

         Circle myCircle = new Circle();
         input = JOptionPane.showInputDialog("Enter the radius");
         radius = Double.parseDouble(input);
         myCircle.setRadius(radius);

         input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
         choice = Integer.parseInt(input);

         calcArea = (choice == 1);
         calcPerimeter = (choice == 2);

         if (calcArea)
             JOptionPane.showMessageDialog(null, "The area of the circle with radius " + myCircle.getRadius() + " is " + roundOff(myCircle.calcArea(),2) );

         else if(calcPerimeter)
             JOptionPane.showMessageDialog(null, "The Perimeter of the circle with radius " + myCircle.getRadius() + " is " + roundOff(myCircle.calcPerimeter(),2) );

     }

     public static void calRectangle()
     {
         double height, breadth;
         boolean calcArea, calcPerimeter = false;
         Rectangle myRectangle = new Rectangle();
         input = JOptionPane.showInputDialog("Enter the height : ");
         height = Double.parseDouble(input);
         input = JOptionPane.showInputDialog("Enter the breadth : ");
         breadth = Double.parseDouble(input);
         myRectangle.setSides(height,breadth);

         input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
         choice = Integer.parseInt(input);

         calcArea = (choice == 1);
         calcPerimeter = (choice == 2);

         if (calcArea)
         {
             JOptionPane.showMessageDialog(null, "The area of the rectangle is " + roundOff(myRectangle.calcArea(),2 ) );
         }

         else if(calcPerimeter)
         {
             JOptionPane.showMessageDialog(null, "The Perimeter of the rectangle is " + roundOff(myRectangle.calPerimeter(),2 ) );
         }

         else {JOptionPane.showMessageDialog(null, "You have selected an option that is not available yet");}

     }

     public static void calSquare()
     {
         double side;
         boolean calcArea, calcPerimeter = false;
         Square mySquare = new Square();
         input = JOptionPane.showInputDialog("Enter the side : ");
         side = Double.parseDouble(input);
         mySquare.setSide(side);

         input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
         choice = Integer.parseInt(input);

         calcArea = (choice == 1);
         calcPerimeter = (choice == 2);

         if (calcArea)
         {
             JOptionPane.showMessageDialog(null, "The area of the square is " + roundOff(mySquare.calcArea(),2 ) );
         }

         else if(calcPerimeter)
         {
             JOptionPane.showMessageDialog(null, "The Perimeter of the square is " + roundOff(mySquare.calcPerimeter(),2 ) );
         }

         else {JOptionPane.showMessageDialog(null, "You have selected an option that is not available yet");}

     }

    public static void calTriangle()
    {
        double side1, side2, side3;
        boolean calcArea, calcPerimeter = false;

       Triangle myTriangle = new Triangle();

       //User Prompts to enter sides
        input = JOptionPane.showInputDialog("Enter the side1 : ");
        side1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the side2 : ");
        side2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the side3 : ");
        side3 = Double.parseDouble(input);

        //Setting the new sides to the triangle
        myTriangle.setSides(side1, side2, side3);
        input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
        choice = Integer.parseInt(input);

        calcArea = (choice == 1);
        calcPerimeter = (choice == 2);

        //If the user want to calculate the area
        if (calcArea)
        {
            JOptionPane.showMessageDialog(null, "The area of the triangle is " + roundOff(myTriangle.calcArea(),2 ) );
        }

        //If the user want to calculate the perimeter
        else if(calcPerimeter)
        {
            JOptionPane.showMessageDialog(null, "The Perimeter of the square is " + roundOff(myTriangle.calcPerimeter(),2 ) );
        }

        //If the user has made an invalid selection
        else {JOptionPane.showMessageDialog(null, "You have selected an option that is not available yet");}

    }

    /**3D Shapes **********************************************
     * 1. Cylinder
     * 2. Cube
     * 3. Triangular Prism
     * 4. Cuboid
     */

    public static void calCylinder()
    {
        double radius, height;
        Cylinder myCylinder = new Cylinder();
        boolean calcSurfaceArea, calcVolume = false;

        input = JOptionPane.showInputDialog("Enter the radius : "); //Take input from user
        radius = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the height : ");
        height = Double.parseDouble(input);

        myCylinder.setRadius(radius);   //Set the dimensions
        myCylinder.setHeight(height);

        input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Total Surface Area \n2. Calculate Volume");
        choice = Integer.parseInt(input);

        calcSurfaceArea = choice==1;
        calcVolume = choice==2;

        if (calcSurfaceArea)
                    JOptionPane.showMessageDialog(null,"The Total Surface area is : " + roundOff(myCylinder.calcArea() , 2) );


        else if (calcVolume)
            JOptionPane.showMessageDialog(null, "The volume is : " + roundOff(myCylinder.calVolume(), 2) );

    }

    public static void calCube()
    {
        double side;
        boolean calcSurfaceArea, calcVolume = false;
        Cube myCube = new Cube();

        input = JOptionPane.showInputDialog("Enter the side : "); //Take input from user
        side = Double.parseDouble(input);

        myCube.setSides(side);
        input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Total Surface Area \n2. Calculate Volume");
        choice = Integer.parseInt(input);

        calcSurfaceArea = choice==1;
        calcVolume = choice==2;

        if (calcSurfaceArea)
            JOptionPane.showMessageDialog(null, "The Total Surface area is : " + roundOff(myCube.calcArea(),2) );
        else if (calcVolume)
            JOptionPane.showMessageDialog(null, "The volume of the cube is : " + roundOff(myCube.calVolume(), 2) );
    }

    public static void calCuboid()
    {
        Cuboid myCuboid = new Cuboid();
        double length, breadth, height;
        boolean calTotalSurfaceArea, calVolume = false;

        input = JOptionPane.showInputDialog("Enter length : ");
        length = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter breadth : ");
        breadth = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the height : ");
        height = Double.parseDouble(input);

        myCuboid.setSidesAndHeight(length, breadth, height);
        input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Total Surface Area \n2. Calculate Volume");
        choice = Integer.parseInt(input);

        calTotalSurfaceArea = choice==1;
        calVolume = choice==2;

        if (calTotalSurfaceArea)
            JOptionPane.showMessageDialog(null, "The area is " + roundOff(myCuboid.calArea(), 2));
        else if (calVolume)
            JOptionPane.showMessageDialog(null, "The volume is : " + roundOff(myCuboid.calVolume(), 2));
    }

    public static void calTriangularPrism()
    {
        double side1, side2, side3, height;
        boolean calTotalSurfaceArea, calVolume = false;

        TrianglularPrism myTPrism = new TrianglularPrism();

        input = JOptionPane.showInputDialog("Enter side1 : \t");
        side1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter side2 : \t");
        side2 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter side3 : \t");
        side3 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Enter the height : \t");
        height = Double.parseDouble(input);

        myTPrism.setSidesAndHeight(side1, side2, side3, height);

        input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Total Surface Area \n2. Calculate Volume");
        choice = Integer.parseInt(input);

        calTotalSurfaceArea = choice==1;
        calVolume = choice==2;

        if (calTotalSurfaceArea)
            JOptionPane.showMessageDialog(null, "The area is " + roundOff(myTPrism.calcArea(), 2));
        else if (calVolume)
            JOptionPane.showMessageDialog(null, "The volume is : " + roundOff(myTPrism.calcVolume(), 2));
    }

     public static void calShapes()
     {

         input = JOptionPane.showInputDialog("1. Enter 1 for 2D shapes  \n2. Enter 2 for 3D shapes : ");
         choice = Integer.parseInt(input);

         boolean choiceIs2DShapes = choice ==1;
         boolean choiceIs3DShapes = choice == 2;

         if (choiceIs2DShapes)   //2D Shapes
         {
             boolean choiceIsCircle, choiceIsSqare,choiceIsRectangle,choiceIsTriangle = false;

             input = JOptionPane.showInputDialog("Please choose the shape to perform calculations on\n1. Circle\n2. Square \n3. Triangle\n4. Rectangle ");
             choice = Integer.parseInt(input);

             choiceIsCircle = choice == 1;
             choiceIsSqare = choice == 2;
             choiceIsTriangle = choice == 3;
             choiceIsRectangle = choice == 4;


             if (choiceIsCircle)
                calCircle();

             else if (choiceIsSqare)
                 calSquare();

             else if (choiceIsTriangle)
                 calTriangle();

             else if (choiceIsRectangle)
                 calRectangle();
         }

         else if (choiceIs3DShapes)
         {
             input = JOptionPane.showInputDialog("Please choose the shape to perform calculations on\n1. Cylinder \n2. Cube\n3. Triangular Prism \n4. Cuboid ");
             choice = Integer.parseInt(input);

             boolean choiceIsCylinder, choiceIsCube, choiceIsCuboid, choiceIsTriangularPrism;
             choiceIsCylinder = choice==1;
             choiceIsCube = choice==2;
             choiceIsCuboid = choice==3;
             choiceIsTriangularPrism = choice==4;

             if (choiceIsCylinder)
                 calCylinder();

             else if (choiceIsCube)
                 calCube();

             else if (choiceIsCuboid)
                 calCuboid();

             else if (choiceIsTriangularPrism)
                 calTriangularPrism();
         }

         else
         {
             JOptionPane.showMessageDialog(null, "You have selected a wrong option please try again");
             calShapes();
         }

     }

     public static double roundOff(double value, int deciPlace)
     {
         int lastValue = (int)(value*(Math.pow(10, deciPlace + 1)) )%10;
         value = value*(Math.pow(10,deciPlace));
         int temp = (int) value;
         value = temp/Math.pow(10,deciPlace);
         if (lastValue >= 5)
         {
             value += Math.pow(10,-deciPlace);
         }
         return value;
     }

}

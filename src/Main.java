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

     }

     //Class variables
    static String input;
    static int choice;

     public static void calCircle()
     {
         Circle myCircle = new Circle();
         input = JOptionPane.showInputDialog("Enter the radius");
         choice = Integer.parseInt(input);
         myCircle.setRadius(choice);

         input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
         choice = Integer.parseInt(input);

         if (choice == 1)
         {
             JOptionPane.showMessageDialog(null, "The area of the circle with radius " + myCircle.getRadius() + " is " + roundOff(myCircle.calcArea(),2) );
         }

         else if(choice ==2)
         {
             JOptionPane.showMessageDialog(null, "The Perimeter of the circle with radius " + myCircle.getRadius() + " is " + roundOff(myCircle.calcPerimeter(),2) );
         }

     }

     public static void calRectangle()
     {
         double height, breadth;
         Rectangle myRectangle = new Rectangle();
         input = JOptionPane.showInputDialog("Enter the height : ");
         height = Integer.parseInt(input);
         input = JOptionPane.showInputDialog("Enter the breadth : ");
         breadth = Integer.parseInt(input);
         myRectangle.setSides(height,breadth);

         input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
         choice = Integer.parseInt(input);

         if (choice == 1)
         {
             JOptionPane.showMessageDialog(null, "The area of the rectangle is " + roundOff(myRectangle.calcArea(),2 ) );
         }

         else if(choice ==2)
         {
             JOptionPane.showMessageDialog(null, "The Perimeter of the rectangle is " + roundOff(myRectangle.calPerimeter(),2 ) );
         }

         else {JOptionPane.showMessageDialog(null, "You have selected an option that is not available yet");}

     }

     public static void calSquare()
     {
         double side;
         Square mySquare = new Square();
         input = JOptionPane.showInputDialog("Enter the side : ");
         side = Integer.parseInt(input);
         mySquare.setSide(side);

         input = JOptionPane.showInputDialog("Select what you would like to do\n1. Calculate Area \n2. Calculate Perimeter");
         choice = Integer.parseInt(input);

         if (choice == 1)
         {
             JOptionPane.showMessageDialog(null, "The area of the square is " + roundOff(mySquare.calcArea(),2 ) );
         }

         else if(choice ==2)
         {
             JOptionPane.showMessageDialog(null, "The Perimeter of the square is " + roundOff(mySquare.calcPerimeter(),2 ) );
         }

         else {JOptionPane.showMessageDialog(null, "You have selected an option that is not available yet");}

     }

     public static void calShapes()
     {

         input = JOptionPane.showInputDialog("1. Enter 1 for 2D shapes  \n2. Enter 2 for 3D shapes : ");
         choice = Integer.parseInt(input);

         if (choice == 1)   //2D Shapes
         {
             input = JOptionPane.showInputDialog("Please choose the shape to perform calculations on\n1. Circle \n2. Rectangle \n3. Square \n4. Triangle");
             choice = Integer.parseInt(input);

             if (choice == 1)   //If Circle is chosen
                calCircle();

             else if (choice == 2)
                 calRectangle();

             else if (choice == 3) //If Square is chosen
             {
                 calSquare();
             }

         }

         else if (choice == 2)
         {
             input = JOptionPane.showInputDialog("Please choose the shape to perform calculations on\n1. Cylinder \n2. Cuboid \n3. Cube \n4. Triangular Prism");
             choice = Integer.parseInt(input);

         }



     }

     public static double roundOff(double value, int deciPlace)
     {
         value = value*(Math.pow(10,deciPlace));
         int temp = (int) value;
         value = temp/Math.pow(10,deciPlace);
         return value;
     }

}

import javax.swing.JOptionPane;

public class main
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

    static String input;
    static int choice;

     public static void calCircle()
     {
         Circle myCircle = new Circle();
         input = JOptionPane.showInputDialog("Enter the radius");
         choice = Integer.parseInt(input);
         myCircle.setRadius(choice);
     }



     public static void calShapes()
     {

         input = JOptionPane.showInputDialog("1. Enter 1 for 2D shapes  \n2. Enter 2 for 3D shapes : ");
         choice = Integer.parseInt(input);

         if (choice == 1)   //2D Shapes
         {
             input = JOptionPane.showInputDialog("Please choose the shape to perform calculations on\n1. Circle \n2. Rectangle \n3. Square \n4. Triangle");

             if (choice == 1)   //If Circle is chosen
                calCircle();

         }
         else if (choice == 2)
         {
             input = JOptionPane.showInputDialog("Please choose the shape to perform calculations on\n1. Cylinder \n2. Cuboid \n3. Cube \n4. Triangular Prism");
             choice = Integer.parseInt(input);

         }
         
     }

}

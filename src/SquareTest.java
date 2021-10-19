class SquareTest
{

    public static void main(String[] args)
    {
        //Create the Cylinder Object
        Square mySquare = new Square();

        //The Perimeter and Area of the Square
        System.out.println("The perimeter of the Square with side : " + mySquare.getSide() + " is " + mySquare.calcPerimeter(mySquare.getSide() ) );
        System.out.println("The area of the Square with the side : " + mySquare.getSide() + " is " + mySquare.calcArea(mySquare.getSide() ) );

        //Testing the setters
        mySquare.setSide(5);
        System.out.println("\nThe perimeter of the Square with side : " + mySquare.getSide() + " is " + mySquare.calcPerimeter(mySquare.getSide() ) + " units");
        System.out.println("The area of the Square with the side : " + mySquare.getSide() + " is " + mySquare.calcArea(mySquare.getSide() ) + " units squared");

    }
}
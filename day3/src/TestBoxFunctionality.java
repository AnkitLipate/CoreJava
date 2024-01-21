java.util.Scanner;
class TestBoxFunctionality
{
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the side of cube : ");
   
   Box cube = new Box(sc.nextDouble());
   System.out.println("Cube : "+cube.getBoxDimensions());
   
   Box defInitedBox = new Box();
   System.out.println("Def inited Box "+defInitedBox.getBoxDimensions());

   System.out.println("Enter 1st Box Dimensions: w d h");
   Box b1 = new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());

   System.out.println("Enter 2nd Box Dimensions: w d h");
   Box b2 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

  System.out.println(b1.checkEquality(b2)?"Same":"Different");
  
  //close scanner
  sc.close();
  System.out.println("main over..."); 
}
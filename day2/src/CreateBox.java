import java.util.Scanner;
class CreateBox
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
   System.out.println("Enter Box Dimensions: w d h ");
   //int Data = 100;
     Box box1;
     box1 = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
     
     System.out.println(box1.getBoxDimensions());
 
     System.out.println("Volume : "+box1.getBoxVolume());     

     sc.close(); 
 }
}
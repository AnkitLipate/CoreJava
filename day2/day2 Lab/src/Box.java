class Box
{
 private double width, depth, height;

 Box(double w, double d, double height)
 {
   width = w;
   depth = d;
   this.height = height;
 }
 
 Box(double side)
 {
   //this.width = side;
   //this.depth = side;
   //this.height = side;
   //this.width = this.depth = this.height = side;
   this(side, side, side); //constructor chaining
 }

  String getBoxDimensions()
  {
   return "Box Dims "+width+" "+depth+" "+height;
  }
  double getBoxVolume()
  {
   return this.width*this.depth*this.height;
  }

  boolean checkEquality(Box anotherBox)
  {
   return this.width==anotherBox && this.depth==anotherBox.depth && this.height==anotherBox.height;
  }

}
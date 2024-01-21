class Box
{
 private double width, depth, height;

//1. Parameterized constructor
 Box(double w, double d, double height)
 {
   width = w;
   depth = d;
   this.height = height;
 }
 
//2. add overloaded constr to initstate of the cube
 Box(double side)
 {
   //this.width = side;
   //this.depth = side;
   //this.height = side;
   //this.width = this.depth = this.height = side;
   this(side, side, side); //constructor chaining
 }

//3.create initialized box with all of the sides set to -1 : const
  Box()
  {
    //width=depth=height=-1;
    this(-1);//constr chaning
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
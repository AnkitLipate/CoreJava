class Box
{
 private double width, depth, height;

 Box(double w, double d, double height)
 {
   width = w;
   depth = d;
   this.height = height;
 }
  String getBoxDimensions()
  {
   return "Box Dims "+width+" "+depth+" "+height;
  }
  double getBoxVolume()
  {
   return this.width*this.depth*this.height;
  }
}
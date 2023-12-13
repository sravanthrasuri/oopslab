public class Circle
{
   int r;
   double pi=3.14;
    Circle(int r) // constructor
   {
     this.setRadius(r);
   }
   void setRadius(int r)
   {
      this.r=r;
   }
   void getArea()
   {
      double res=pi*r*r;
      System.out.println("area of the circle is:"+res);
   }
   void getPerimeter()
   {
      double res=2*pi*r;
      System.out.println("perimeter of the circle is:"+res);
   }
}

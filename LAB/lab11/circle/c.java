class c
{
   public static void main(String[] args)
   {
     Circle circle1=new Circle(5);
     Circle circle2=new Circle(10);
     Circle circle3=new Circle(15);
     System.out.println("radius is "+circle1.r);
      circle1.getArea();
      circle1.getPerimeter();
      System.out.println("radius is "+circle2.r);
      circle2.getArea();
      circle2.getPerimeter();
      System.out.println("radius is "+circle3.r);
      circle3.getArea();
      circle3.getPerimeter();
      
   }

}

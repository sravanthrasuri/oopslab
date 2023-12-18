import java.util.*;
import java.io.*;
class Dog
{
   String name,breed,color,type;
   double height;
   Dog(String name,String breed,String color,String type,double height)
   {
   this.name=name;
   this.breed=breed;
   this.color=color;
   this.type=type;
   this.height=height;
   }
   String getBreed()
   {
      return breed;
   }
   String getName()
   {
     return name;
   }
   String getColor()
   {
      return color;
   }
   String getType()
   {
      return type;
   }
   double getHeight()
   {
      return height;
   }
}

public class Main
{
  public static void main(String[] args)
  {
    Dog snoopy=new Dog("snoopy","pomerian","white","gaurd",1);
    Dog rocky=new Dog("rocky","lab","brown","snipper",3);
    Dog snowy=new Dog("snowy","g.sheperd","black","sheperd",4);
    Scanner s=new Scanner(System.in);
    System.out.println("enter breed,type,color and height of the dog you want:");
    String breed,type,color;
    double height;
    breed=s.next();
     type=s.next();
      color=s.next();
       height=s.nextDouble();
       Dog[] dog={snoopy,rocky,snowy};
       for(Dog i:dog)
       {
         if(i.getBreed().equalsIgnoreCase(breed) && i.getType().equalsIgnoreCase(type) && i.getHeight()==height && i.getColor().equalsIgnoreCase(color))
         {
           System.out.println("as for your input you can take the "+i.getName());
           break;
         }
       //  System.out.println("as for your input you can take the "+i.getName()+i.getBreed());
       }
  }
}

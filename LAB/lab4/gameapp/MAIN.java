 class monster
{
 
   void attack()
   {
     System.out.println("this monster will attacks");
   }
}

 class firemonster extends monster
{
    void attack()
    {
      System.out.println(" this monster attacks with the fire");
    }
}

 class watermonster extends monster
{
    void attack()
    {
      System.out.println(" this monster attacks with the water");
    }
}

 class stonemonster extends monster
{
    void attack()
    {
      System.out.println(" this monster attacks with the stone");
    }
}

public class MAIN
{
	public static void main(String[] args)
	{
	monster a=new monster();
	     a.attack();
	   monster m1 = new firemonster();
	   monster m2 = new watermonster();
	   monster m3 = new stonemonster();
	   monster m[] = {m1,m2,m3};
	   for(monster mon:m)
	     mon.attack();
	     
	    // monster.attack();
	}
}

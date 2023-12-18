package week3;
class Monster {
    void attack(){
        System.out.println("Monster hunt starts:");
    }
}
class firemonster extends Monster{
    void attack(){
        System.out.println("Firemonster attacks with fire");
    }
}
class watermonster extends Monster{
    void attack(){
    System.out.println("Watermonster attacks with water");
    }
}
class stonemonster extends Monster{
    void attack(){
        System.out.println("Stonemonster monster attacks with the stone");
    }
}
public class Monstermain{
    public static void main(String args[]){
        Monster a=new Monster();
        a.attack();
        Monster m1 = new firemonster();
	    Monster m2 = new watermonster();
	    Monster m3 = new stonemonster();
	    Monster m[] = {m1,m2,m3};
	    for(Monster mon:m)
	        mon.attack();
    }
}
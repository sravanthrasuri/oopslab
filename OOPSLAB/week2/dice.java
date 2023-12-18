package week2;
import java.util.*;
public class dice {
    public static void main(String args[]){
        Random r=new Random();
        int c=0;
        for(int i=1;i<=10;i++){
            int r1=r.nextInt(6)+1;
            int r2=r.nextInt(6)+1;
            System.out.print(i+") ");
            System.out.print(r1+" , ");
            System.out.println(r2);
            if(r1==r2){
                c++;
            }
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(c);
    }
}

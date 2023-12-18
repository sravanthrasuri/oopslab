import dept.CSE;
import dept.ECE;
import dept.ME;
import dept.CE;
public class Maindept{
    public static void main(String args[]){
        CSE c=new CSE();
        ECE e=new ECE();
        ME m=new ME();
        CE ce=new CE();

        c.displaySubjects();
        System.out.println();
    
        e.displaySubjects();
        System.out.println();
  
        m.displaySubjects();
        System.out.println();
        ce.displaySubjects();
    }
}
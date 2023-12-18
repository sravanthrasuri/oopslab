package complex;
public class Arith{
    private int rp;
    private int ip;
    public Arith(){
        this.rp=0;
        this.ip=0;
    }
    public Arith(int rp,int ip){
        this.rp=rp;
        this.ip=ip;
    }
    public void add(Arith a1,Arith a2){
        this.rp=a1.rp+a2.rp;
        this.ip=a1.ip+a2.ip;
    }
    public void sub(Arith a1,Arith a2){
        this.rp=a1.rp-a2.rp;
        this.ip=a1.ip-a2.ip;
    }
    public void display(){
        System.out.println(this.rp + (this.ip >= 0 ? "+" : "") + this.ip + "i");
    }
}
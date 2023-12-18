package complex;

public class Arith {
    private int rp; // real part
    private int ip; // imaginary part

    // Default constructor
    public Arith() {
        this.rp = 0;
        this.ip = 0;
    }

    // Parameterized constructor
    public Arith(int rp, int ip) {
        this.rp = rp;
        this.ip = ip;
    }

    // Addition method
    public void add(Arith a1, Arith a2) {
        this.rp = a1.rp + a2.rp;
        this.ip = a1.ip + a2.ip;
    }

    // Subtraction method
    public void sub(Arith a1, Arith a2) {
        this.rp = a1.rp - a2.rp;
        this.ip = a1.ip - a2.ip;
    }

    // Display complex number
    public void display() {
        System.out.println(rp + (ip >= 0 ? "+" : "") + ip + "i");
    }
}


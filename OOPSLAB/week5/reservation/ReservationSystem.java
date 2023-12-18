package reservation;
public class ReservationSystem implements ReservationCost{
    public double Totalfare(Passenger[] passengers){
        double Totalfare=0;
    for(Passenger p:passengers){
        if(p instanceof child){
            Totalfare+=0;
        }
        else if(p instanceof student){
            Totalfare+=0.7*calculate(p);
        }
        else if(p instanceof citizen){
            Totalfare+=0.5*calculate(p);
        }
        else if(p instanceof seniorcitizen){
            Totalfare+=calculate(p);
        }
    }
        return Totalfare;
    }
    Private double calculate(Passenger p){
        return 100;
    }
}
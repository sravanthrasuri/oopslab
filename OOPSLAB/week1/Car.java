package week1;
class Car {
    String company;
    double mileage;
    double speed;
    String color;
    public Car(String company,double mileage,double speed,String color){
        this.company=company;
        this.mileage=mileage;
        this.speed=speed;
        this.color=color;
    }
    public double getMileage(){
        return mileage;
    }
    public double getSpeed(){
        return speed;
    }
}

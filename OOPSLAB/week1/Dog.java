package week1;
public class Dog {
    String name;
    String breed;
    String color;
    double height;
    String type;

    public Dog(String name, String breed, String color, double height, String type){
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.height=height;
        this.type=type;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public String getColor(){
        return color;
    }
    public double getHeight(){
        return height;
    }
    public String getType(){
        return type;
    }
}

public class Animal {
    private double weight;
    private String color;
    private String name;
    public Animal(){

    }
    public Animal(double weight,String color, String name){
        this.weight = weight;
        this.color = color;
        this.name = name;
    }
    public void move(){
        System.out.println("is moving");
    }
    public void eat(){
        System.out.println("is eating");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return "Weight :" +this.weight + " Color : " +this.color + " Name : "+this.name;
    }
}

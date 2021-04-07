public class Dog extends Animal {
    public Dog(){
        super();
    }
    public Dog(double weight,String color, String name){
        super(weight,color,name);
    }
    public void bark(){
        System.out.println("is barking");
    }
    public String toString(){
        return super.toString()+" Animal can bark";
    }
}

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(20,"black","cat");
//        System.out.println(animal);
        Dog dog = new Dog(30,"black","bun");
//        System.out.println(dog);
//        dog.eat();
//        dog.bark();
//        animal.move();
        DogBull dogbull = new DogBull();
        dogbull.cankonha();
        dogbull.bark();
        dogbull.bark(5);
        Animal animal1 = new Dog(10,"red","bull");
        System.out.println(animal1);
    }
}

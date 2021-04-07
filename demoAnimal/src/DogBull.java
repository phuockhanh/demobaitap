public class DogBull extends Dog {
    public DogBull(){
        super();
    }
    public void bark(int time){
        System.out.println("will bark in 5 minutes");
    }
    public void cankonha(){
        super.bark();
        System.out.println("can ko nha ");
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pig pig1 = new Pig();
        System.out.println("here is what pig1 says :");
        pig1.animalSound();
        pig1.sleep();
        pig1.Location();
        pig1.zooDetails();

        Dog dog1 = new Dog();
        dog1.animalSound();

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        Pig pig1 = new Pig();
        System.out.println("what pig1 says :");
        pig1.animalSound();
        pig1.sleep();
        pig1.Location();

        Dog dog1 = new Dog();
        dog1.animalSound();

    }
}
import java.util.Scanner;
import java.util.InputMismatchException;

public class Notebook {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //ask the user for a string . like name
        // if they dont enter it and just leave it empty


        try{
            System.out.print("Enter your name: ");
            String name = scnr.nextLine();

            if (name.trim().isEmpty()){
                throw new IllegalArgumentException("name cant be empty");
            }
            System.out.println("enter your zip code :");
            String zip = scnr.nextLine();

            if(!isNumeric(zip)){
                throw new IllegalArgumentException("you must enter a numeric zip code");
            }

        }
        catch (IllegalArgumentException e){
            System.out.println("Error:" + e.getMessage());

        }
        finally {
            scnr.close();
        }

        System.out.println("done");
    }
}

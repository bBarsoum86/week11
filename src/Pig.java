import javax.xml.stream.Location;

abstract class Pig extends Animal implements Location,ZooDetails {
        public void animalSound() {

            int age = 22;
            if(age <= 15 ) {
                // The body of animalSound() is provided here
                System.out.println("The pig says: wee wee");
            }
            else {
                System.out.println("this is an old pig! - it doesn't make sound");
            }


        }
        public void zooDetails () {
            System.out.println("zoo details example :" + NAME);

        }

        public void Location () {
        System.out.println("this pig located in the farm");

        }



}




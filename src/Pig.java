import javax.xml.stream.Location;

abstract class Pig extends Animal implements Location,ZooDetails {
        public void animalSound() {

            int age = 14;
            if(age <= 15) {
                // The body of animalSound() is provided here
                System.out.println("The pig says: wee wee");
            }
            else {
                System.out.println("this is old pig sound");
            }
            public void zooDetails(){
                System.out.println("zoo details example:" + name);
            }

        }

}




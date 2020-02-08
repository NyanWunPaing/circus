package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
<<<<<<< HEAD:src/main/java/circus/Trainer.java
import circus.animal.Parrot;
=======
>>>>>>> in-lecture:src/main/java/circus/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck();
        System.out.println(d.speak());
        Bird b = (Bird)d;  // upcasting
        Animal a = (Animal)b; // upcasting
        System.out.println(a.speak());
        Duck d2 = (Duck) a; // downcasting
        train(new Duck());
        // train(new Parrot());
<<<<<<< HEAD:src/main/java/circus/Trainer.java
=======
        //Animal a2 = new Animal();
        //Bird b2 = new Bird();
>>>>>>> in-lecture:src/main/java/circus/Trainer.java
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}

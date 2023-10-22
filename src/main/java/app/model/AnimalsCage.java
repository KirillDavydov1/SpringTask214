package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("myDog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }

    /*    @Autowired
        @Qualifier("dog")*/
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Timer getTimer() {
        return timer;
    }
}

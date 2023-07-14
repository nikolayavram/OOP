package HomeWork_2.veterinary;


import HomeWork_2.*;
import HomeWork_2.Runnable;
// import HomeWork_2.impl.Doctor;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;
    public VetClinic(Human headPhysician) {
        this.animals = new ArrayList<>();
    }
    public VetClinic() { this(null); }

    public List<Animal> getAllAnimals() { return this.animals; }

    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Runnable) runningAnimals.add((Runnable) a);

        return runningAnimals;
    }

    public List<Swimmable> getSwimmingAnimals() {
        List<Swimmable> swimmingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Swimmable) swimmingAnimals.add((Swimmable) a);

        return swimmingAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Flyable) flyingAnimals.add((Flyable) a);

        return flyingAnimals;
    }

    public List<Speakable> getSpeakingAnimals() {
        List<Speakable> speakingAnimals = new ArrayList<>();

        for (Animal a: this.animals)
            if (a instanceof Speakable) speakingAnimals.add((Speakable) a);

        return speakingAnimals;
    }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

}
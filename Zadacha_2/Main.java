package HomeWork_2;

import java.util.ArrayList;
import java.util.List;

import HomeWork_2.impl.*;
import HomeWork_2.impl.Doctor;
import HomeWork_2.veterinary.VetClinic;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();

        vetClinic
                .addAnimal(new Cat("Барсик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Bird("Кеша"))
                .addAnimal(new Parrot("Гоша"))
                .addAnimal(new Fish("Немо"))
                .addAnimal(new Shark("Меган"));
  
        Doctor merlova = new Doctor("Иванов Алексей Сергеевич");
        List<Doctor> doctors = new ArrayList<>();
        doctors.add(merlova);
     

        System.out.println("Все животные:");
        for (Animal a: vetClinic.getAllAnimals()) {
            System.out.println(a);
            a.speak();
        }

        System.out.println("\nБегающие животные:");
        for (Runnable r: vetClinic.getRunningAnimals()) {
            System.out.println(r + ", " + "Скорость: " + r.getRunningSpeed());
        }

        System.out.println("\nПлавающие животные:");
        for (Swimmable s: vetClinic.getSwimmingAnimals()) {
            System.out.println(s + ", " + "Скорость: " + s.getSwimmingSpeed());
        }

        System.out.println("\nЛетающие животные:");
        for (Flyable f: vetClinic.getFlyingAnimals()) {
            System.out.println(f + ", " + "Скорость: " + f.getFlightSpeed());
        }

        System.out.println("\nГоворящие животные:");
        for (Speakable sp: vetClinic.getSpeakingAnimals()) {
            System.out.println(sp);
            sp.speak();
        }

        System.out.println("\nГлавный ветиринарный врач:");
        System.out.println(doctors);
    
    }

}
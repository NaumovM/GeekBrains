package sem2hw;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Sharik", 3, "Retriever");
        animals[1] = new Cat("Boris", 5, "White");
        animals[0].makeSound();

        for (Animal animal : animals) {
            System.out.println("Name: " + animal.name + ", Age: " + animal.age);

            try {
                Method method = animal.getClass().getMethod("makeSound");
                method.invoke(animal);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                System.out.println("This animal doesn't make a sound.");
            }
        }
    }
}

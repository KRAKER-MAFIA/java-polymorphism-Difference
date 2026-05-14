class Animal {

    // Common properties
    String name;
    String color;
    int age;
    int legs;
    String sound;

    // Common method
    void showDetails() {

        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Legs: " + legs);
        System.out.println("Sound: " + sound);

        System.out.println("-------------------");
    }
}

// Dog class
class Dog extends Animal {

}

// Cat class
class Cat extends Animal {

}

// Lion class
class Lion extends Animal {

}

public class With_polymorphism {

    public static void main(String[] args) {

        // Polymorphism
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Lion();

        // Dog data
        a1.name = "Tommy";
        a1.color = "Brown";
        a1.age = 2;
        a1.legs = 4;
        a1.sound = "Barks";

        // Cat data
        a2.name = "Kitty";
        a2.color = "White";
        a2.age = 1;
        a2.legs = 4;
        a2.sound = "Meows";

        // Lion data
        a3.name = "Simba";
        a3.color = "Golden";
        a3.age = 5;
        a3.legs = 4;
        a3.sound = "Roars";

        // Array of animals
        Animal[] animals = {a1, a2, a3};

        // One loop handles all objects
        for (Animal a : animals) {

            a.showDetails();
        }
    }
}
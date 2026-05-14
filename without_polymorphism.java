class Dog {

    // Properties
    String name;
    String color;
    int age;
    int legs;

    // Method
    void showDetails() {

        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age: " + age);
        System.out.println("Legs: " + legs);

        System.out.println("----------------");
    }
}

public class Without_polymorphism {

    public static void main(String[] args) {

        // Dog 1
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.color = "Brown";
        d1.age = 2;
        d1.legs = 4;

        // Dog 2
        Dog d2 = new Dog();
        d2.name = "Sheru";
        d2.color = "Black";
        d2.age = 3;
        d2.legs = 4;

        // Dog 3
        Dog d3 = new Dog();
        d3.name = "Bruno";
        d3.color = "White";
        d3.age = 1;
        d3.legs = 4;

        // Dog 4
        Dog d4 = new Dog();
        d4.name = "Rocky";
        d4.color = "Golden";
        d4.age = 5;
        d4.legs = 4;

        // Show details
        d1.showDetails();
        d2.showDetails();
        d3.showDetails();
        d4.showDetails();
    }
}
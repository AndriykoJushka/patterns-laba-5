class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Person {
    private final Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    void interactWithAnimal() {
        animal.eat();
        animal.sleep();
    }
}

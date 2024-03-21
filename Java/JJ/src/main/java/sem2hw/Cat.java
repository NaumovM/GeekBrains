package sem2hw;

class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}
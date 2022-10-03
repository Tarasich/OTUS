public class Cat extends Animal {
    @Override
    public void Say() {
        System.out.println("Мяу");
    }

    public Cat(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

}

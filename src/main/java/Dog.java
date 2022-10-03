public class Dog extends Animal{
    @Override
    public void Say() {
        System.out.println("Гав");
    }

    public Dog(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

}

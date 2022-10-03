public class Duck extends Animal implements Flying {
    @Override
    public void Say() {
        System.out.println("Кря");
    }

    public void Fly() {
        System.out.println("Я лечу");
    }

    public Duck(String name, int age, double weight, String color) {
        super(name, age, weight, color);
    }

}

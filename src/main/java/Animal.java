public class Animal {
    private String name;
    private int age;
    private double weight;
    private String color;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void Say() {
        System.out.println("Я говорю");
    }

    public void Go() {
        System.out.println("Я иду");
    }

    public void Drink() {
        System.out.println("Я пью");
    }

    public void Eat() {
        System.out.println("Я ем");
    }

    @Override
    public String toString() {
        String validationAge = "";

        if (this.age % 10 == 1) {
            validationAge = " год ";
        } else if ((this.age % 10 == 0) || (this.age % 10 >= 5 && this.age % 10 <= 9)) {
            validationAge = " лет ";
        } else {
            validationAge = " года ";
        }

        return("Привет! меня зовут " + this.name + ", мне " + this.age + validationAge + ", я вешу - " + this.weight + " кг, мой цвет - " + this.color);
    }

    public Animal(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

}




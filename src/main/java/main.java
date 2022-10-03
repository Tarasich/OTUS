import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class main {

    public enum Commands {
        add,
        list,
        exit
    }

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner (System.in);
        ArrayList<Animal> animalList = new ArrayList<Animal>();

        while(flag) {
            System.out.println("Выберите команду: ");
            System.out.print("add \nlist \nexit \n");

            try {
                Commands action = Commands.valueOf(sc.next().toLowerCase());

            switch (action) {
                case add: {
                    System.out.println("Какое животное Вы хотите создать?");
                    System.out.print("cat\ndog\nduck\n");

                    String newAnimal = sc.next().toLowerCase();

                    switch (newAnimal) {
                        case ("cat"): {
                            System.out.println("Введите имя животного");
                            sc.nextLine();
                            String name = sc.nextLine();

                            System.out.println("Введите возраст животного");
                            int age = sc.nextInt();

                            System.out.println("Введите вес животного");
                            double weight = sc.nextDouble();

                            System.out.println("Введите цвет животного");
                            sc.nextLine();
                            String color = sc.nextLine().toLowerCase();

                            Animal Dich = new Cat(name, age, weight, color);
                            Dich.Say();
                            animalList.add(Dich);
                            break;
                        }

                        case ("dog"): {
                            System.out.println("Введите имя животного");
                            sc.nextLine();
                            String name = sc.nextLine();

                            System.out.println("Введите возраст животного");
                            int age = sc.nextInt();

                            System.out.println("Введите вес животного");
                            double weight = sc.nextDouble();

                            System.out.println("Введите цвет животного");
                            sc.nextLine();
                            String color = sc.nextLine().toLowerCase();

                            Animal Dich = new Dog(name, age, weight, color);
                            Dich.Say();
                            animalList.add(Dich);
                            break;
                        }

                        case ("duck"): {
                            System.out.println("Введите имя животного");
                            sc.nextLine();
                            String name = sc.nextLine();

                            System.out.println("Введите возраст животного");
                            int age = sc.nextInt();

                            System.out.println("Введите вес животного");
                            double weight = sc.nextDouble();

                            System.out.println("Введите цвет животного");
                            sc.nextLine();
                            String color = sc.nextLine().toLowerCase();

                            Animal Dich = new Duck(name, age, weight, color);
                            Dich.Say();
                            animalList.add(Dich);
                            break;
                        }
                        default: {
                            System.out.println("Ошибка!");
                            break;
                        }
                    }
                    break;
                }

                case list: {
                    System.out.println(animalList);
                    break;
                }

                case exit: {
                    flag = false;
                    break;
                }

                default: {
                    System.out.println("Ошибка!");
                    break;
                }

            }
            }
            catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }
    }

}

package sixthHW;

public class Main {
    public static void main(String[] args) {

        Animal[] zoo = {
                new Cat("Семён"),
                new Cat("Ромео"),
                new Cat("Том"),
                new Dog("Рональд"),
                new Dog("Максим"),
        };

        for (int i = 0; i < zoo.length; i++) {
            zoo[i].run(200);
            zoo[i].swim(6);
        }

        System.out.println("Котиков в зоопарке: " + Animal.catCount());
        System.out.println("Собак в зоопарке: " + Animal.dogCount());
        System.out.println("Животных в зоопарке: " + Animal.animalCount());
    }
}


package sixthHW;

// 1. Создать классы Собака и Кот с наследованием от класса Животное.
// 2. Все животные могут бежать и плыть.
// В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
// 3. У каждого животного есть ограничения на действия
// (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
// 4. * Добавить подсчет созданных котов, собак и животных.

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
        addAnimal();
    }

    public abstract int maxRun();

    public void run(int distance) {
        if (canRun()) {
            if (distance <= maxRun())
                System.out.println(name + " пробежал" + " " + distance + " м.");
            else
                System.out.println(name + " устал");
        } else
        System.out.println(name + " не умеет бегать");
    }

    public abstract int maxSwim();

    public void swim(int distance) {
        if (canSwim()) {
            if (distance <= maxSwim())
                System.out.println(name + " проплыл" + " " + distance + " м.");
            else
                System.out.println(name + " устал");
        } else
            System.out.println(name + " не умеет плавать");
    }

    public abstract boolean canSwim();
    public abstract boolean canRun();

    private static int animal_count = 0;
    private static int cat_count = 0;
    private static int dog_count = 0;

    public static int animalCount() {
        return animal_count;
    }

    public static int catCount() {
        return cat_count;
    }

    public static int dogCount() {
        return dog_count;
    }

    protected static void addAnimal() {
        animal_count++;
    }

    protected static void addCat() {
        cat_count++;
    }

    protected static void addDog() {
        dog_count++;
    }

}

package seventhHW;

public abstract class Animal {
    private String name;
    private int appetite;

    Animal(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        addAnimal();
    }

    public void feed(Plate plate) {
        if (plate.eatFood(appetite)) {
            appetite = 0;
        }
    }

    public boolean fullness() { return appetite == 0; }

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

    public static int animalCount() {
        return animal_count;
    }

    public static int catCount() {
        return cat_count;
    }

    protected static void addAnimal() {
        animal_count++;
    }

    protected static void addCat() {
        cat_count++;
    }
}

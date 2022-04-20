package seventhHW;

public class Dog extends Animal {
    Dog(String name) {
        this(name, 0);
    }

    Dog(String name, int appetite) {
        super(name, appetite);
    }

    @Override
    public int maxRun() {
        return 500;
    }

    @Override
    public int maxSwim() {
        return 10;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    @Override
    public boolean canRun() {
        return true;
    }
}

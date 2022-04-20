package sixthHW;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
        addDog();
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

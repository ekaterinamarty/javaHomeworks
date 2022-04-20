package sixthHW;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
        addCat();
    }

    @Override
    public int maxRun() {
        return 200;
    }

    @Override
    public int maxSwim() {
        return 0;
    }

    @Override
    public boolean canSwim() {
        return false;
    }

    @Override
    public boolean canRun() {
        return true;
    }
}
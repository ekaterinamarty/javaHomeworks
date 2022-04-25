package seventhHW;

public class Cat extends Animal {
    Cat(String name) {
        this(name, 0);
    }

    Cat(String name, int appetite) {
        super(name, appetite);
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
package seventhHW;

// 1. Расширить задачу про котов и тарелки с едой.
// +2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
// +3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
// +4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
// +6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

public class Main {
    public static void main(String[] args) {

        Animal[] zoo = new Animal[] {
                new Cat("Семён", 5),
                new Cat("Ромео", 9),
                new Cat("Том", 1),
        };

        Plate p = new Plate(0);
        p.addFood(10);


        for (int i = 0; i < zoo.length; i++) {
            zoo[i].feed(p);
            System.out.println(zoo[i].fullness());
        }
    }
}


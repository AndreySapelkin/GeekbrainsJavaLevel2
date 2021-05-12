package lection06.offline;

import lection06.offline.model.Animals;

public class Zoo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Борька");
        Cat cat3 = new Cat("Феликс");
        Cat cat4 = new Cat("Китикэт");
        Cat cat5 = new Cat("Котофей");

        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Бобик");
        Dog dog3 = new Dog("Собакен");
        Dog dog4 = new Dog("Кусакен");
        Dog dog5 = new Dog("Ушастик");

        Animals animal1 = new Animals("Неведома зверушка 1");
        Animals animal2 = new Animals("Неведома зверушка 2");
        Animals animal3 = new Animals("Неведома зверушка 3");
        Animals animal4 = new Animals("Неведома зверушка 4");
        Animals animal5 = new Animals("Неведома зверушка 5");

        System.out.println("Общее количество зверей, включая кошек и собак, равно: "
        + Animals.countAnimals);

        cat1.run(100);
        cat1.sail();
        cat2.run(200);
        cat2.sail();
        cat3.run(0);
        cat3.sail();
        cat4.run(-100);
        cat4.sail();
        cat5.run(250);
        cat5.sail();

        dog1.run(100);
        dog1.sail(1);
        dog2.run(500);
        dog2.sail(10);
        dog3.run(0);
        dog3.sail(0);
        dog4.run(-1);
        dog4.sail(-1);
        dog5.run(550);
        dog5.sail(12);

    }
}

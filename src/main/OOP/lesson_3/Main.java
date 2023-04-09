package lesson_3;

//Создать классы cat и dog
//Для них создать класс AnimalShelter с наследниками для cat и dog.
//Добавить возможность сравнения животных между собой и итерации по ним

public class Main {
    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                shelter.addAnimal(new Cat(i * 2, i * 3, "cat" + i));
            } else {
                shelter.addAnimal(new Dog(i * 4, i * 5, "dog" + i));
            }
        }
        shelter.print();
        shelter.sort(new AnimalComparator("age"));
        System.out.println("---");
        shelter.print();
    }
}

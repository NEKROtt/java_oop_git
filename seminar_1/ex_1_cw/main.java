package ex_1_cw;

public class main {
    public static void main(String[] args) {
        //------- 1) Создать класс Cat с полями: имя, цвет, кол-во лет. Поработать с полями напрямую
        //------- 2) Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
        
        Cat cat1 = new Cat();
        cat1.setName("Васька");
        cat1.setColor("Рыжый");
        cat1.setAge(3);
        System.out.println(cat1);
        Animal animal = new Animal("Конь");
        animal.jump();
        animal.animalInfo();
        cat1.animalInfo();
        cat1.voice();
        cat1.jump();

        //------- 3) Создайте класс, который описывает вектор (в трехмерном пространстве).
        // Vector vector1 = new Vector(1, 1, 5);
        // Vector vector2 = new Vector(2, 5, 2);
        // System.out.println("vector1 = " + vector1);
        // System.out.println("vector2 = " + vector2);
        // System.out.println("Длина vector1 = " + vector1.lengthVector());
        // System.out.println("Сколярное произведение вектора vector1 на вектор vector2 = " + vector1.scolar(vector2));
        // System.out.println("Векторное произведение vector1 и vector2 = " + vector1.multivector(vector2));
        // System.out.println("косинус между векторами vector1 и vector2 = " + vector1.cos(vector2));
    }
}

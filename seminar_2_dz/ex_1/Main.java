package seminar_2_dz.ex_1;

/**
 * 1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса, 
 * но есть общий класс родитель. Эти классы должны уметь бегать и прыгать, 
 * все также с выводом информации о действии в консоль.
 * 
 * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
 * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
 * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
 * (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
 *
 * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
 * этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
 * списку он препятствий не идет.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------------------");
        Athletics[] athletes = {
            new Human(500, 100),
            new Cat(50, 120),
            new Robot(1000, 10),
            new Cat(160, 220),
            new Human(1500, 130)
        };

        Crossable[] equipments = {
            new Barrier(60),
            new RunningTrack(700),
            new Barrier(90)
        };

        for (Athletics athlete : athletes) {
            for (Crossable equipment: equipments) {
                equipment.cross(athlete);
            }
        }
        System.out.println("----------------------\n");
    }
}
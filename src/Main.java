public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4 - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4 - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4 - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var flog = 3.5;
        System.out.println(flog);
        flog = flog * 10;
        System.out.println(flog);
        flog = flog / 3.5;
        System.out.println(flog);
        flog = flog + 4;
        System.out.println(flog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var weight = boxerOne + boxerTwo;
        System.out.println("Общий вес бойцов " + weight + "кг");
        var difference = boxerTwo % boxerOne;
        System.out.println("Разница в весе бойцов " + difference + "кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var difference1 = boxerTwo % boxerOne;
        System.out.println("Разница в весе бойцов 1 способ " + difference1 + "кг");
        var difference2 = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов 2 способ " + difference2 + "кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var hours = 640;
        var workingDay = 8;
        var staff = hours / workingDay;
        System.out.println("Всего работников в компании - " + staff + " человек");
        staff = staff + 94;
        workingDay = staff * 8;
        System.out.println( "Если в компании работает " + staff + " человек, то всего " + workingDay + " часов работы может быть поделено между сотрудниками "  );
    }
}
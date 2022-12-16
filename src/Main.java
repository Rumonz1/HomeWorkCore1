public class Main {
    public static void main(String[] args) {
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        Автомобиль auto1 = new Автомобиль("Lada", "",2015,"Россия","жёлтый",1.7);
        System.out.println(auto1);
        Автомобиль auto2 = new Автомобиль("Audi","A8 50 L TDI quattro",2020,"Германия","черный",3.0);
        System.out.println(auto2);
        Автомобиль auto3 = new Автомобиль("","Z8",2021,"Германия","черный",3.0);
        System.out.println(auto3);
        Автомобиль auto4 = new Автомобиль("Kia","Sportage 4-го поколения",2018,"Южная Корея","красный",2.4);
        System.out.println(auto4);
        Автомобиль auto5 = new Автомобиль("Hyundai","Avante",0,"Южная Корея","оранжевый",1.6);
        System.out.println(auto5);
        System.out.println();
        ////
        ////
        System.out.println();
        Human human1 = new Human("Максим", "Москва", 2001, "");
        System.out.println(human1);
        Human human2 = new Human("Аня", "Тырнополь", -2, "юрист 1-го разряда");
        System.out.println(human2);
        Human human3 = new Human("Катя", "Москва", 1989, "менеджер по продажам");
        System.out.println(human3);
        Human human4 = new Human("", "Волгоград", 1955, "директор завода");
        System.out.println(human4);
    }
}
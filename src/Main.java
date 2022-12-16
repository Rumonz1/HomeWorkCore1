public class Main {
    public static void main(String[] args) {
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        Автомобиль auto1 = new Автомобиль();
        auto1.brand = "Lada";
        auto1.model = "Granta";
        auto1.year = 2015;
        auto1.country = "Россия";
        auto1.color = "жёлтый";
        auto1.engineVolume = 1.7;
        System.out.println(auto1);
        Автомобиль auto2 = new Автомобиль();
        auto2.brand = "Audi";
        auto2.model = "A8 50 L TDI quattro";
        auto2.year = 2020;
        auto2.country = "Германия";
        auto2.color = "черный";
        auto2.engineVolume = 3.0;
        System.out.println(auto2);
        Автомобиль auto3 = new Автомобиль();
        auto3.brand = "BMW";
        auto3.model = "Z8";
        auto3.year = 2021;
        auto3.country = "Германия";
        auto3.color = "черный";
        auto3.engineVolume = 3.0;
        System.out.println(auto3);
        Автомобиль auto4 = new Автомобиль();
        auto4.brand = "Kia";
        auto4.model = "Sportage 4-го поколения";
        auto4.year = 2018;
        auto4.country = "Южная Корея";
        auto4.color = "красный";
        auto4.engineVolume = 2.4;
        System.out.println(auto4);
        Автомобиль auto5 = new Автомобиль();
        auto5.brand = "Hyundai";
        auto5.model = "Avante";
        auto5.year = 2016;
        auto5.country = "Южная Корея";
        auto5.color = "оранжевый";
        auto5.engineVolume = 1.6;
        System.out.println(auto5);
    }
}
public class Автомобиль {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
     public String toString(){
         return "Автомобиль - "+brand+" "+model+"."+" Год выпуска - "+year+"."+" Страна где собрано - "+country+"."+" Цвет  "+color+"."+" Объём двигателя - "+engineVolume+" литров.";
    }
}

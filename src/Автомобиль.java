public class Автомобиль {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    Автомобиль(String brand,String model,int year,String country,String color,double engineVolume ) {
        this.brand=brand;
        this.color = color;
        this.country = country;
        this.model = model;
        this.engineVolume = engineVolume;
        this.year =year;

    }

    public String toString(){
         return "Автомобиль - "+brand+" "+model+"."+" Год выпуска - "+year+"."+" Страна где собрано - "+country+"."+" Цвет  "+color+"."+" Объём двигателя - "+engineVolume+" литров.";
    }
}

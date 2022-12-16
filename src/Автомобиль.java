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
        if (brand  == null || brand == "") {
            this.brand = "default";
        }
        if (model == null || model == "") {
            this.model = "default";
        }
        if (country == null || country == "") {
            this.country = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color == null || color == "") {
            this. color = "белый";
        }
        if (year <= 0) {
            this.year = 2000;
        }

    }

    public String toString(){
         return "Автомобиль - "+brand+" "+model+"."+" Год выпуска - "+year+"."+" Страна где собрано - "+country+"."+" Цвет  "+color+"."+" Объём двигателя - "+engineVolume+" литров.";
    }
}

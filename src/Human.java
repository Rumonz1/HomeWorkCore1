public class Human {
    String name;
    String city;
    int year;
    String job;

    Human(String name,String city,int year,String job) {
        this.name = name;
        this.job = job;
        this.year = year;
        this.city = city;
        if (year < 0) {
            this.year = 0;
        }
        if (name == null || name == "") {
            this.name = "Информация не указана";
        }
        if (city == null || city == "") {
            this.city = "Информация не указана";
        }
        if (job == null || job == "") {
            this.job = "Информация не указана";
        }
    }

    public String toString() {
        return "Привет! Меня зовут "+name+". Я из города "+city+". Я родился в "+year+" году. Я работаю на должности "+job+". Будем знакомы!";
    }
}

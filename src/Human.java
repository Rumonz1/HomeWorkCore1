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
    }

    public String toString() {
        return "Привет! Меня зовут "+name+". Я из города "+city+". Я родился в "+year+" году. Я работаю на должности "+job+". Будем знакомы!";
    }
}

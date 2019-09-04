public class Film {
    String name;
    int duration;
    String genre;

    public static final String COMEDY = "Комедии";
    public static final String FANTAZY = "Фантастика";
    public static final String HORROR = "Ужасы";

    {
        System.out.println("=====Создаем новый фильм =====");
    }

    Film(String name){
        this.name = name;
        System.out.println("Фильм " + this.name + ", успешно\n" +
                "создана.»");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}

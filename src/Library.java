
public class Library {

    final String name;
    Film[] film;

    {
        film = new Film[5];
    }

    {
        film[0] = new Film("Один дома");
        film[1] = new Film("Маска");
        //film[2] = new Film("Перевозчик");
        //film[3] = new Film("Дум");
        //film[4] = new Film("Челюсти");
        System.out.println("Добавлены любимые фильмы");
    }


    public  Library(String name){
        this.name = name;
        System.out.println("«Библиотека " + this.name + ", успешно создана");

    }

    public String getName() {
        return name;
    }

    public Film[] getFilm() {
        return film;
    }

    public void setFilm(Film[] film) {
        this.film = film;
    }

}

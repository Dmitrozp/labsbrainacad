
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

    public int searchNullCellFilm() {
        for (int i = 0; i <5; i++) {
            if (this.film[i] == null) {
                System.out.println("Нет названия фильма в ячейке["
                                    + i + "]");
                return i;
            }
        }
        System.out.println("Библиотека заполнена");
        return -1;
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

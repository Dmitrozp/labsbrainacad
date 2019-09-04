import java.sql.Date;

public class Main {


    public static void main(String[] args) {

        Library library = new Library("бла бла бла");
        library.film[0].getFilmAllColums();

        for (int i = 0; i < 6; i++) {
            int freeIndex = library.searchNullCellFilm();

            if (freeIndex < 0) {
                System.out.println("Полный");
                return;
            }

            System.out.println("Новый фильм " + freeIndex);
            library.film[freeIndex] = new Film("Час Пик");

        }

        System.out.println("####Библиотека фильмов "
                + library.getName()
                + "####");

        library.getAllFilms();


    }
}

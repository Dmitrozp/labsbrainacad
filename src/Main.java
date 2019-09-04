
public class Main {


    public static void main(String[] args) {

        Library library = new Library("бла бла бла");

        for (int i = 0; i < 6; i++) {
            int freeIndex = library.searchNullCellFilm();
            
            if (freeIndex < 0) {
                System.out.println("Полный");
                return;
            }
            System.out.println("Новый фильм " + freeIndex);
            library.film[freeIndex] = new Film("asdasdf");

        }
    }
}

public class Pizzeria {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("4сыра", "состав 4 разных сыра",
                123, 5);

        Pizza[] pizzas = new Pizza[5];
        pizzas[0] = new Pizza ("4сыра", "состав 4 разных сыра", 123, 5);
        pizzas[1] = new Pizza ("aмерикана", "лук чеснок салями", 167, 7);
        pizzas[2] = new Pizza ("изабелла", "сыр и томатыа", 90, 6);
        pizzas[3] = new Pizza ("4 мяса", "лук и курица", 222, 8);
        pizzas[4] = new Pizza ("сырная", "сыр и салями", 145, 2);



        pizzas[0].getPizza();
        pizzas[3].getPizza();
        //Pizza[] pizzas = new  Pizza[5];
        //pizzas[] = ("4сыра", "состав 4 разных сыра", 123, 5);



        //for (int i = 0; i<=5; i++){
        //    pizzas[i]("4сыра", "состав 4 разных сыра", 123, 5);

        //}

    }
}

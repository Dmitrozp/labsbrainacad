public class Pizza {
    private Circle basis;
    private String name;
    private int cost;
    private String composition;

    public Pizza(String name, String composition, int cost,
                 int rudios ){

        Circle circle = new Circle(rudios);

        //System.out.println("проверка прокинулось ли в серкл = "
        //        + circle.getLongCircle()
        //       + "\nпеременная longpizza="
        //        + longpizza);

        this.basis = circle;
        this.name = name;
        this.composition = composition;
        this.cost = cost;
        System.out.println(
                "\nНазванеи = " + name +
                "\nСостав :" + composition +
                "\nЦена = " + cost +
                "\nРадиус пиццы = " + basis.getLongCircle()
        );

    }

    public void getPizza(){
        System.out.println(
                "\nНазванеи = " + name +
                        "\nСостав :" + composition +
                        "\nЦена = " + cost +
                        "\nРадиус пиццы = " + basis.getLongCircle());
    }

}

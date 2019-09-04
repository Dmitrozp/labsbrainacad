public class Circle {
    private int rudios;
    private  String color;
    private double longcircle;
    private double square;

    public  Circle(int rudios){
        this.rudios = rudios;
        //System.out.println("Радиус = " + rudios);
        this.longcircle =  Math.PI*rudios;
        //System.out.println("Длинна окружности = " + this.longcircle );
        square =  Math.PI*rudios*rudios;
        //System.out.println("Площадь окружности = " + square );
    }

    public Circle(int radios, String color){
        radios = rudios;
        color = color;
        System.out.println("Радиус = " + rudios);
        System.out.println("Цвет = " + color);
    }
    public Circle(){};

    double getLongCircle(){
        return longcircle;
    }


}

package ej3;

public class PizzaDemo {

    public static void main(String[] args) {

        NyPizza pizza1 = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE).build();
        System.out.println("pizza1 = " + pizza1);

        Calzone pizza2 = new Calzone.Builder().addTopping(Pizza.Topping.HAM).build();
        System.out.println("pizza2 = " + pizza2);
    }
}

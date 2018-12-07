public class ClassWithOverload {
    /*смысл перегрузки в том, что методы одного класса могут иметь одно
    и то же имя, но в них (в круглых скобках) можно задавать (или не задавать) разные по типу, количеству и
    последовательности параметры */

    void edaOrder(String nameOfPizza, int sumOfPizzas) {
        //метод для случая заказа только одного вида пиццы

        System.out.println("Ваш заказ: " + nameOfPizza + "* " + sumOfPizzas);
    }

    void edaOrder(String nameOfPizza, int sumOfPizzas, String anotherPizza, int sumOfAnotherPizzas) {
        //метод для случая заказа двух видов пиццы

        System.out.println("Ваш заказ: " + nameOfPizza + "* " + sumOfPizzas + "; " + nameOfPizza + "* " + sumOfPizzas);
    }


    // и тд

}

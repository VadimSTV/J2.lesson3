package J2.lesson3;

import javax.swing.*;

public class HomeWork3 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxApple = new Box<>();
        Box<Orange> boxOrange = new Box<>();
        System.out.println("Коробка с яблоками");
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        boxApple.addFruit(apple);
        System.out.println("Коробка с апельсинами");
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);

        boxApple.compare(boxOrange);
    }
}

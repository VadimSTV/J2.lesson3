package J2.lesson3;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private boolean //Метод который хранит значения true или false
    isFree = true;
    float maxWeigth = 100.0f;
    float currentWeigth = 0;
    ArrayList<T> arrayList;

    void addFruit(T fruit) {
        if (currentWeigth + 1 == maxWeigth) {
        arrayList.add(fruit);
        currentWeigth++;
        boolean isFree = true;
        if (arrayList.size() == 1)
            isFree = false;
        } else
            System.out.println("Коробка уже полна");
        }
    float getWeigth(Fruit f){
        return arrayList.size() * f.getWeigth();
    }

    boolean compare(Fruit f1, Fruit f2){
        if (getWeigth(f1) == getWeigth(f2)){
            return true;
        }else return false;
    }

    boolean compare(Box box){ //сравнение коробок
        if (currentWeigth == box.currentWeigth)
            return true;
        return false;
    }
}


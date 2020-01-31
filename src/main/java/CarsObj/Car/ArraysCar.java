package CarsObj.Car;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArraysCar {

    Random random = new Random();

    public boolean[] enterDoorArray() {

        boolean[] doorArray = new boolean[4];
        for (int i = 0; i < doorArray.length; i++) {

            doorArray[i] = random.nextBoolean();

        }
        return doorArray;
    }



    public double[] enterArrayWheel() {
        double[] arrayWheel = new double[4];
        for (int i = 0; i < arrayWheel.length; i++) {
            arrayWheel[i] = random.nextDouble();

        }


        return arrayWheel;
    }





    public double findMinValue(double[] arrayWheel) {
        double min = 1.0;
        for (int i = 0; i < arrayWheel.length; i++) {
            if (min < arrayWheel[i]) {
                min = arrayWheel[i];
            }
        }
        return min;
    }
}




import CarsObj.Car.ArraysCar;
import CarsObj.Car.BodyForLaunchCar;
import CarsObj.Car.LauncherForCar;
import CarsObj.CarDoors.LauncherForCarDoor;
import CarsObj.CarDoors.MessageForProgram;
import CarsObj.CarWheel.LauncherForCarWheel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean check = true;
        while (check) {

            System.out.println(MessageForProgram.CHOOSE_PROGRAM_FOR_MAIN);
            System.out.println(MessageForProgram.LIST_OF_PROGRAMS_MAIN);
            String input = scanner.nextLine();
            while (!input.matches("^[1-3]$")) {

                System.out.print(MessageForProgram.INVALID_INPUT_1_3);
                input = scanner.next();

            }
            byte condition = Byte.parseByte(input);
            if (condition == 1) {
                System.out.println(MessageForProgram.LAUNCH_CAR_DOOR);
                LauncherForCarDoor launcherForCarDoor1 = new LauncherForCarDoor();
                launcherForCarDoor1.launcherProgram();
            } else if (condition == 2) {
                System.out.println(MessageForProgram.LAUNCH_CAR_WHEEL);
                LauncherForCarWheel launcherForCarWheel = new LauncherForCarWheel();
                launcherForCarWheel.launchCarWheel();
            } else if (condition == 3) {
                System.out.println(MessageForProgram.LAUNCH_CAR);
                LauncherForCar launcherForCar = new LauncherForCar();
                launcherForCar.launchCar();
            }

            System.out.print(MessageForProgram.ASK_FOR_NEW_ACTIONS);
            String inputForFinish = scanner.next();
            while (!inputForFinish.matches("^[0-1]$")) {

                System.out.print(MessageForProgram.INVALID_INPUT_0_1);
                inputForFinish = scanner.next();

            }
            byte numberForFinish = Byte.parseByte(inputForFinish);
            if (numberForFinish == 1) {
                check = true;
            } else {
                check = false;
                System.out.println();

            }


        }


    }
}

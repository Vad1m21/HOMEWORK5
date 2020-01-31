package CarsObj.CarDoors;

import java.util.Scanner;

public class BodyForLaunchCarDoor {
    Scanner scanner = new Scanner(System.in);
    public CarDoor launchInput() {

        System.out.print(MessageForProgram.ENTER_IF_YOU_WANT_TO_CHOOSE_CONDITION);
        String input = scanner.nextLine();
        while (!input.matches("^[0-1]$")) {

            System.out.print(MessageForProgram.INVALID_INPUT_0_1);
            input = scanner.next();

        }
        Boolean condition = input.equals(MessageForProgram.NUMBER_FOR_CONDITION);
        if (condition == false) {
            CarDoor carDoor = new CarDoor();
            return carDoor;
        } else {
            System.out.print(MessageForProgram.ENTER_CONDITION_OF_DOOR);
            String inputDoor = scanner.nextLine();
            while (!inputDoor.matches("^[0-1]$")) {

                System.out.print(MessageForProgram.INVALID_INPUT_0_1);
                inputDoor = scanner.next();

            }
            Boolean conditionDoor = inputDoor.equals(MessageForProgram.NUMBER_FOR_CONDITION);

            System.out.print(MessageForProgram.ENTER_CONDITION_OF_WINDOW);

            String inputWindow = scanner.nextLine();
            while (!inputWindow.matches("^[0-1]$")) {

                System.out.print(MessageForProgram.INVALID_INPUT_0_1);
                inputWindow = scanner.next();

            }
            Boolean conditionWindow = inputWindow.equals(MessageForProgram.NUMBER_FOR_CONDITION);

            CarDoor carDoor = new CarDoor(conditionDoor, conditionWindow);
            return carDoor;

        }


    }


    public void launcher(CarDoor carDoor) {
        System.out.println();
        System.out.println(MessageForProgram.CHOOSE_PROGRAM);
        boolean check = true;
        while (check) {
            System.out.println(MessageForProgram.LIST_OF_ACTIONS);
            String inputForChoosing = scanner.next();
            while (!inputForChoosing.matches("^[1-7]$")) {

                System.out.print(MessageForProgram.INVALID_INPUT_1_7);
                inputForChoosing = scanner.next();

            }
            byte numberForChoosingProgram = Byte.parseByte(inputForChoosing);

            if (numberForChoosingProgram == 1) {
                carDoor.openDoor(carDoor.getDoor());

            } else if (numberForChoosingProgram == 2){
                carDoor.closeDoor(carDoor.getDoor());
            }else if(numberForChoosingProgram == 3){
                carDoor.doSomethingWithDoor(carDoor.getDoor(),true,false);
            }else if(numberForChoosingProgram == 4){
                carDoor.openWindow(carDoor.getCarWindow());
            }else if(numberForChoosingProgram == 5){
                carDoor.closeWindow(carDoor.getCarWindow());
            }else if(numberForChoosingProgram == 6){
                carDoor.doSomeThingWithWindow(carDoor.getCarWindow(),true,false);
            }else if(numberForChoosingProgram == 7){
                carDoor.returnStatus(carDoor.getDoor(),carDoor.getCarWindow());
            }
            System.out.println();
            System.out.print(MessageForProgram.ASK_FOR_NEW_ACTIONS);
            String inputForFinish = scanner.next();
            while (!inputForFinish.matches("^[0-1]$")) {

                System.out.print(MessageForProgram.INVALID_INPUT_0_1);
                inputForFinish = scanner.next();

            }
            byte numberForFinish = Byte.parseByte(inputForFinish);
            if(numberForFinish == 1){
                check = true;
            }
            else {
                check = false;
                System.out.println();

            }
        }

    }
}

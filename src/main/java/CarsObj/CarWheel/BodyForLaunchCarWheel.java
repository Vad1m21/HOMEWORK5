package CarsObj.CarWheel;

import CarsObj.CarDoors.MessageForProgram;

import java.util.Scanner;

public class BodyForLaunchCarWheel {

    Scanner scanner = new Scanner(System.in);
   MessageForProgram messageForProgram = new MessageForProgram();

    public CarWheel createObject (){
        System.out.println(MessageForProgram.ASK_ENTER_CONDITION_OF_TIRE);
        String input = scanner.nextLine();
        while (!input.matches("^[0-1]$")) {

            System.out.print(MessageForProgram.INVALID_INPUT_0_1);
            input = scanner.next();

        }
        Boolean condition = input.equals(MessageForProgram.NUMBER_FOR_CONDITION);

        if(condition == false){

           CarWheel carWheel = new CarWheel();
           return carWheel;
        }
        else{
            System.out.println(MessageForProgram.ENTER_CONDITION_OF_TIRE);
            String inputCondition = scanner.nextLine();


                while (!inputCondition.matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
                    System.out.println(MessageForProgram.INVALID_INPUT);
                    inputCondition = scanner.next();


                }

                double conditionOfTire = Double.parseDouble(inputCondition);

                    CarWheel carWheel = new CarWheel(conditionOfTire);

                return carWheel;

            }
        }

        public void launchProgram(CarWheel carWheel){
            System.out.println();
            System.out.println(MessageForProgram.CHOOSE_PROGRAM);
            boolean check = true;
            while (check) {
                System.out.println(MessageForProgram.CHOOSE_PROGRAM_FOR_WHEEL);
                String inputForChoosing = scanner.next();
                while (!inputForChoosing.matches("^[1-3]$")) {

                    System.out.print(MessageForProgram.INVALID_INPUT_1_3);
                    inputForChoosing = scanner.next();

                }
                byte numberForChoosingProgram = Byte.parseByte(inputForChoosing);

                if (numberForChoosingProgram == 1) {
                    carWheel.changeTireForNew();

                } else if (numberForChoosingProgram == 2){
                    System.out.println(MessageForProgram.ERASE_TIRE);
                    String inputConditionOfWheel = scanner.next();

                    while (!inputConditionOfWheel.matches("^[0-9]?[0-9]?[0-9]$")) {
                        System.out.println(MessageForProgram.INVALID_INPUT_0_9);
                        inputConditionOfWheel = scanner.next();

                    }
                    double conditionOfTire = Double.parseDouble(inputConditionOfWheel);
                    conditionOfTire /= 100;
                   double statusOfTire = carWheel.eraseTire(carWheel.getConditionOfWheel(),conditionOfTire);
                   if(statusOfTire < 0 ){
                       statusOfTire = 0;
                       System.out.println(MessageForProgram.TIRE_IS_ERASE + statusOfTire);
                   }else {
                       System.out.println(MessageForProgram.STATUS_OF_TIRE + statusOfTire);
                   }
                   }else if(numberForChoosingProgram == 3){
                   carWheel.getStatusOfTire();
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


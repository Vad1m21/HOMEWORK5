package CarsObj.Car;

import CarsObj.CarDoors.MessageForProgram;
import CarsObj.CarWheel.CarWheel;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BodyForLaunchCar {
      Scanner scanner = new Scanner(System.in);
   MessageForProgram messageForProgram = new MessageForProgram();
      public Car createObject(){
         System.out.println(MessageForProgram.CHOOSE_FOR_CREATION_OBJECT);
         String input = scanner.nextLine();
         while (!input.matches("^[0-1]$")) {

            System.out.print(MessageForProgram.INVALID_INPUT_0_1);
            input = scanner.next();

         }
         Boolean condition = input.equals(MessageForProgram.NUMBER_FOR_CONDITION);
         if(condition == false){
            System.out.println(MessageForProgram.ENTER_MANUFACTURING_DATE);
            String manufacturingDate = scanner.nextLine();

            Car car = new Car(manufacturingDate);
             ArraysCar arraysCar = new ArraysCar();
             double [] arrayWheel =  arraysCar.enterArrayWheel();
             for (int j = 0;j <arrayWheel.length;j++){
                 car.setArrayWheel(j,arrayWheel[j]);

             }
             double min = 1.0;
             for (int i = 0; i < arrayWheel.length; i++) {
                 if (min > arrayWheel[i]) {
                     min = arrayWheel[i];
                 }
                 car.setMinValueOfTire(min);
             }

             ArraysCar arraysCar1Car = new ArraysCar();
             boolean[] arrayDoor =  arraysCar1Car.enterDoorArray();
             for (int i = 0; i < arrayDoor.length-1; i++) {
                 car.setArrayDoors(i,arrayDoor[i]);
             }

             return car;
         }
         else{
            System.out.println(MessageForProgram.ENTER_MANUFACTURING_DATE);
            String manufacturingDate = scanner.nextLine();

            System.out.println(MessageForProgram.ENTER_NUMBER_OF_CYLINDERS);
            String inputNumberOfCylinders = scanner.next();
            while (!inputNumberOfCylinders.matches("^[0-9]?[0-9]?[0-9]$")) {
               System.out.println(MessageForProgram.INVALID_INPUT_TRY_AGAIN );
               inputNumberOfCylinders = scanner.next();

            }
            int numberOfCylinders = Integer.parseInt(inputNumberOfCylinders);

            System.out.println(MessageForProgram.ENTER_MAX_SPEED);
            String inputMaxSpeed = scanner.next();
            while (!inputMaxSpeed.matches("^[-+]?[0-9]?[0-9]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
               System.out.println(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
               inputMaxSpeed = scanner.next();

            }
            double maxSpeed = Double.parseDouble(inputMaxSpeed);

            System.out.println(MessageForProgram.ENTER_TIME_OFF_ACCELERATION);

            String inputTime = scanner.next();


            while (!inputTime.matches("^[-+]?[0-9]*[.,]?[0-9]+(?:[eE][-+]?[0-9]+)?$")) {
               System.out.println(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
               inputTime = scanner.next();


            }

            double timeForAcceleration = Double.parseDouble(inputTime);

            System.out.println(MessageForProgram.ENTER_CAPACITY_OF_CAR);

            String inputCapacity = scanner.next();
            while (!inputCapacity.matches("^[0-9]?[0-9]?[0-9]$")) {
               System.out.println(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
               inputCapacity = scanner.next();

            }
            int capacityOfCar = Integer.parseInt(inputCapacity);

            System.out.println(MessageForProgram.ENTER_HOW_MUCH_PASSENGERS_IN_CAR);
            String inputPassengers = scanner.next();
            while (!inputPassengers.matches("^[0-9]?[0-9]?[0-9]$")) {
               System.out.println(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
               inputPassengers = scanner.next();

            }
            int passengerInTheCar = Integer.parseInt(inputPassengers);

            System.out.println(MessageForProgram.ENTER_CURRENT_SPEED);
            String inputCurrentSpeed = scanner.next();
            while (!inputCurrentSpeed.matches("^[0-9]?[0-9]?[0-9]$")) {
               System.out.println(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
               inputCurrentSpeed = scanner.next();

            }
            int currentSpeed = Integer.parseInt(inputCurrentSpeed);

            Car car = new Car(manufacturingDate,numberOfCylinders,maxSpeed,timeForAcceleration,capacityOfCar,passengerInTheCar,currentSpeed);
             ArraysCar arraysCar = new ArraysCar();
             double [] arrayWheel =  arraysCar.enterArrayWheel();
             for (int j = 0;j <arrayWheel.length-1;j++){
                 car.setArrayWheel(j,arrayWheel[j]);

             }
             double min = 1.0;
             for (int i = 0; i < arrayWheel.length; i++) {
                 if (min > arrayWheel[i]) {
                     min = arrayWheel[i];
                 }
                 car.setMinValueOfTire(min);
             }


             ArraysCar arraysCar1Car = new ArraysCar();
             boolean[] arrayDoor =  arraysCar1Car.enterDoorArray();
             for (int i = 0; i < arrayDoor.length-1; i++) {
                 car.setArrayDoors(i,arrayDoor[i]);
             }

             return car;


            }
      }


      public void startProgram(Car car){

          System.out.println();
          System.out.println(MessageForProgram.CHOOSE_PROGRAM_FOR_CAR);
          boolean check = true;
          while (check) {
              System.out.println(MessageForProgram.LIST_OF_PROGRAMS);
              String inputForChoosing = scanner.next();
              while (!inputForChoosing.matches("^[1-9]?[0-9]$")) {

                  System.out.print(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
                  inputForChoosing = scanner.next();

              }
              byte numberForChoosingProgram = Byte.parseByte(inputForChoosing);

              if (numberForChoosingProgram == 1) {
                  System.out.println(MessageForProgram.CHANGE_CURRENT_SPEED);
                  String inputForSpeed = scanner.next();

                  while (!inputForSpeed.matches("^[0-9]?[0-9]?[0-9]$")) {

                      System.out.print(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
                      inputForSpeed = scanner.next();

                  }
                  int currentSpeed = Integer.parseInt(inputForSpeed);
                  System.out.println( car.changeCurrentSpeed(currentSpeed));

              } else if (numberForChoosingProgram == 2){
                  System.out.println(MessageForProgram.ADD_PASSENGER);
                  System.out.println( car.addPassenger(car.getPassengerInTheCar()));

                  }

              else if(numberForChoosingProgram == 3){
                  System.out.println(MessageForProgram.DROP_ALL_PASSENGERS);
                  System.out.println( car.dropOffAllPassenger(car.getPassengerInTheCar()));
              }else if(numberForChoosingProgram == 4){
                  System.out.println(MessageForProgram.DROP_ONE_PASSENGER);
                  System.out.println( car.dropOffPassenger(car.getPassengerInTheCar()));
              }else if(numberForChoosingProgram == 5){
                  System.out.println(MessageForProgram.TAKE_OFF_ALL_WHEELS);
                  System.out.println(car.takeOffAllWheels());
              }else if(numberForChoosingProgram == 6){
                  System.out.println(MessageForProgram.INSTALL_WHEELS);
                  String inputForWheels = scanner.next();
                  while (!inputForWheels.matches("^[1-9]?[0-9]$")) {

                      System.out.print(MessageForProgram.INVALID_INPUT_TRY_AGAIN);
                      inputForWheels = scanner.next();

                  }
                  int amountOfWheels = Integer.parseInt(inputForWheels);
                  System.out.println(car.installWheels(amountOfWheels));

              }else if(numberForChoosingProgram == 7){
                  System.out.println(MessageForProgram.GET_VALUE_OF_WHEELS_BY_INDEX);

                  String inputForWheels = scanner.next();
                  while (!inputForWheels.matches("^[0-3]$")) {

                      System.out.print(MessageForProgram.INVALID_INPUT_FOR_ARRAY);
                      inputForWheels = scanner.next();

                  }
                  int amountOfWheels = Integer.parseInt(inputForWheels);
                  System.out.println(car.valueOfWheel(amountOfWheels));
              }else if(numberForChoosingProgram == 8){
                  System.out.println(MessageForProgram.GET_VALUE_OF_DOOR_BY_INDEX);
                  String inputForDoor = scanner.next();
                  while (!inputForDoor.matches("^[0-3]$")) {

                      System.out.print(MessageForProgram.INVALID_INPUT_FOR_ARRAY);
                      inputForDoor = scanner.next();

                  }
                  int doorStatusIndex = Integer.parseInt(inputForDoor);
                  System.out.println(car.statusOfDoor(doorStatusIndex));
              }else if(numberForChoosingProgram == 9){
                  System.out.println(MessageForProgram.CALCULATE_NEW_MAX_SPEED);
                  System.out.println(car.newMaxSpeed(car.getMinValueOfTire(),car.getMaxSpeed(),car.getPassengerInTheCar()));

              }else if(numberForChoosingProgram == 10){
                  System.out.println(MessageForProgram.GET_STATUS_OF_CAR);
                  car.StatusCar();
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

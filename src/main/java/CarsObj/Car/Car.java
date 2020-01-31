package CarsObj.Car;

import CarsObj.CarDoors.MessageForProgram;

import java.util.Random;

public class Car {

    private  String manufacturingDate ;
    private int engine;
    private double maxSpeed;
    private double timeForAcceleration;
    private int capacityOfPassenger;
    private int passengerInTheCar;
    private int currentSpeed;
    private double [] arrayWheel = new double[4];
    private  boolean []arrayDoors = new boolean[4];
    private double minValueOfTire;

    Car(String manufacturingDate){
        this.manufacturingDate = manufacturingDate;

    }

    Car(String manufacturingDate,int engine,double maxSpeed,double timeForAcceleration,int capacityOfPassenger,int passengerInTheCar,int currentSpeed){
        this.manufacturingDate = manufacturingDate;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.timeForAcceleration = timeForAcceleration;
        this.capacityOfPassenger = capacityOfPassenger;
        this.passengerInTheCar = passengerInTheCar;
        this.currentSpeed = currentSpeed;

    }

    public String getManufacturingDate() {
        return manufacturingDate;
    }


    public int getEngine(){ return engine; }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTimeForAcceleration() {
        return timeForAcceleration;
    }
    public void setTimeForAcceleration(double timeForAcceleration){
        this.timeForAcceleration = timeForAcceleration;
    }

    public int getCapacityOfPassenger() {
        return capacityOfPassenger;
    }

    public void setCapacityOfPassenger(int capacityOfPassenger) {
        this.capacityOfPassenger = capacityOfPassenger;
    }

    public int getPassengerInTheCar() {
        return passengerInTheCar;
    }

    public void setPassengerInTheCar(int passengerInTheCar) {
        this.passengerInTheCar = passengerInTheCar;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean getArrayDoors(int index) {
        return arrayDoors[index];
    }

    public void setArrayDoors(int index,boolean value) {
        this.arrayDoors[index] = value;
    }

    public double getArrayWheel(int index) {
        return arrayWheel[index];
    }

    public int getArrayWheelLength(double [] arrayWheel){
        return arrayWheel.length;
    }

    public void setArrayWheel(int index,double value) {
        this.arrayWheel[index] = value;
    }

    public double getMinValueOfTire() {
        return minValueOfTire;
    }

    public void setMinValueOfTire(double minValueOfTire) {
        this.minValueOfTire = minValueOfTire;
    }






    public int changeCurrentSpeed (int currentSpeed){

        return this.currentSpeed = currentSpeed;
    }

    public int addPassenger (int passengerInTheCar){

        return this.passengerInTheCar = passengerInTheCar + 1;
    }

    public int dropOffPassenger (int passengerInTheCar){

        return this.passengerInTheCar = passengerInTheCar - 1;
    }

    public int dropOffAllPassenger (int passengerInTheCar){

        return this.passengerInTheCar = 0;
    }

    public boolean statusOfDoor (int index){
        return arrayDoors[index];
    }

    public double valueOfWheel(int index){
        return arrayWheel[index];
    }

    public int takeOffAllWheels( ){

        return this.arrayWheel.length - arrayWheel.length;
    }

    public int installWheels(int amountOfWheels){
        return arrayWheel.length + amountOfWheels;
    }

    public double newMaxSpeed(double minValueOfWheel,double maxSpeed,int passengerInTheCar){

        if(passengerInTheCar == 0){
           return this.maxSpeed = 0.0;

        }
        else{
           return this.maxSpeed = maxSpeed * minValueOfWheel;
        }
    }

    public void StatusCar(){
        System.out.println(MessageForProgram.MANUFACTURING_DATE + manufacturingDate);
        System.out.println(MessageForProgram.TYPE_OF_ENGINE + engine);
        System.out.println(MessageForProgram.MAX_SPEED + maxSpeed);
        System.out.println(MessageForProgram.TIME_FOR_ACCELERATION + timeForAcceleration);
        System.out.println(MessageForProgram.CAPACITY_OF_CAR + capacityOfPassenger);
        System.out.println(MessageForProgram.PASSENGERS_IN_CAR + passengerInTheCar);
        System.out.println(MessageForProgram.CURRENT_SPEED + currentSpeed);
    }



}


package CarsObj.CarDoors;

public class CarDoor {
    private boolean Door;
    private boolean CarWindow;



    public CarDoor(){
      Door = false;
      CarWindow = false;

    }

    public CarDoor(boolean door,boolean carWindow){
        this.Door = door;
        this.CarWindow = carWindow;

    }
    public boolean getDoor(){
        return Door;
    }

    public void setDoor(boolean door){
        this.Door = door;
    }

    public boolean getCarWindow(){return CarWindow;}

    public void setCarWindow(boolean carWindow){this.CarWindow = carWindow;}

    public boolean openDoor(boolean Door){
        System.out.println(MessageForProgram.DOOR_IS_OPEN);

        return this.Door = true;
    }
    public  boolean closeDoor(boolean Door){
        System.out.println(MessageForProgram.DOOR_IS_CLOSE);
        return this.Door = false;
    }

    public boolean doSomethingWithDoor(boolean Door,boolean open,boolean close){
        if(Door==close){

            System.out.println(MessageForProgram.DOOR_IS_OPEN);
            return this.Door = true;
        }
        else {

            System.out.println(MessageForProgram.DOOR_IS_CLOSE);
            return this.Door = false;
        }

    }

    public boolean openWindow(boolean window){
        System.out.println(MessageForProgram.WINDOW_IS_OPEN);
        return this.CarWindow = true;
    }

    public boolean closeWindow(boolean window){

        System.out.println(MessageForProgram.DOOR_IS_CLOSE);
        return this.CarWindow = false;
    }

    public boolean doSomeThingWithWindow(boolean window,boolean open,boolean close){
        if(window == close ){

            System.out.println(MessageForProgram.WINDOW_IS_OPEN);
            return this.CarWindow = true;
        }
        else{

            System.out.println(MessageForProgram.WINDOW_IS_CLOSE);
            return this.CarWindow = false;
        }

    }

    public void returnStatus(boolean door,boolean carWindow){
        System.out.println(MessageForProgram.DOOR_CONDITION + door);
        System.out.println(MessageForProgram.WINDOW_CONDITION + carWindow);
    }


}

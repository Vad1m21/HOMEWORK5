package CarsObj.CarDoors;

public class CarDoor {
    private boolean Door;
    private boolean Window;



    public CarDoor(){
      Door = false;
      Window = false;

    }

    public CarDoor(boolean door,boolean carWindow){
        this.Door = door;
        this.Window = carWindow;

    }
    public boolean getDoor(){
        return Door;
    }

    public void setDoor(boolean door){
        this.Door = door;
    }

    public boolean getCarWindow(){return Window;}

    public void setCarWindow(boolean carWindow){this.Window = carWindow;}




    public void openDoor(){

       this.Door = true;
    }
    public  void closeDoor(){

       this.Door = false;
    }

    public void doSomethingWithDoor(boolean Door,boolean open,boolean close){
        if(Door==close){


           this.Door = true;
        }
        else {


          this.Door = false;
        }

    }

    public void openWindow(){

       this.Window = true;
    }

    public void closeWindow(){

        this.Window = false;
    }

    public void doSomeThingWithWindow(boolean window,boolean open,boolean close){
        if(window == close ){


          this.Window = true;
        }
        else{


           this.Window = false;
        }

    }

    public void returnStatus(boolean door,boolean carWindow){
        System.out.println(MessageForProgram.DOOR_CONDITION + door);
        System.out.println(MessageForProgram.WINDOW_CONDITION + carWindow);
    }


}

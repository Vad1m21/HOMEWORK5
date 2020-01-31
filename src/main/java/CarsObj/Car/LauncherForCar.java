package CarsObj.Car;

public class LauncherForCar {

    public void launchCar(){
        BodyForLaunchCar bodyForLaunchCar = new BodyForLaunchCar();
       bodyForLaunchCar.startProgram(bodyForLaunchCar.createObject());

    }
}

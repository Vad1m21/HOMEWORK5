package CarsObj.CarWheel;

public class CarWheel {
    private double ConditionOfTire;

    public CarWheel(){
    ConditionOfTire = 1.0;

    }

    public CarWheel(double conditionOfTire){
        this.ConditionOfTire = conditionOfTire;
    }

    public double getConditionOfWheel() {
        return ConditionOfTire;
    }

    public void   setConditionOfWheel(double conditionOfWheel){
        this.ConditionOfTire = conditionOfWheel;
    }

    public double changeTireForNew(){
      return this.ConditionOfTire = 1.0;
    }

    public void getStatusOfTire(){
        System.out.println(ConditionOfTire);
    }


    public double eraseTire(double conditionOfTire,double erase){
        return this.ConditionOfTire  -= erase;
    }
}

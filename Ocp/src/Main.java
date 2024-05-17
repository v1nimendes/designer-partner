import vehicles.Car;
import vehicles.Motorcycle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args) {

        typeVehicle = TypeVehicle.CAR;

        if(typeVehicle == TypeVehicle.CAR){
            //Vehicle vehicle = new Vehicle("Amarelo", "2021", 2.0, 4);
            //vehicle.car();
            Car car = new Car("Azul", "2022", 2.6, 4);
        }
        else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            //Vehicle vehicle = new Vehicle("", "2022", 250, 1);
            //vehicle.motorcycle();
            Motorcycle motorcycle = new Motorcycle("branca", "2022", 250);
        }
    }
}
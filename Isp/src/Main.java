import vehicles.Car;
import vehicles.Motorcycle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static String type;

    public static void main(String[] args) {

        type = "Car";
        if(type == "Car"){
            Car car = new Car("Azul","2022",2.6, 4);
        }else {
            Motorcycle motorcycle = new Motorcycle("branca","2022",250);
        }

    }
}
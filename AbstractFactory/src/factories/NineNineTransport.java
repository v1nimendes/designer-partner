package factories;


import aircrafts.Helicopter;
import aircrafts.IAircraft;
import boats.Boat;
import boats.IBoat;
import landvehicles.ILandVehicle;
import landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}


package srpapp;


public class BombaGasolina {
    void recargar(final  Vehicle vehicle ){
        int remainingFuel = vehicle.getRemainingFuel();
        int additionalFuel = vehicle.getMaxFuel();
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);   
    }
}

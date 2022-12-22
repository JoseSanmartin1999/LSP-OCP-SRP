
package ocpapp;


public class Economy implements DrivingMode {
    
    private static int POWER = 300;
    private static int SUSPENSION_HEIGHT = 20;
    
    public int getPower(){
        return POWER;
    }
    
    public int getSuspensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}

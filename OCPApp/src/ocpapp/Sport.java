
package ocpapp;


public class Sport implements DrivingMode{
    private static int POWER = 500;
    private static int SUSPENSION_HEIGHT = 10;
    
    public int getPower(){
        return POWER;
    }
    
    public int getSuspensionHeight(){
        return SUSPENSION_HEIGHT;
    }
}

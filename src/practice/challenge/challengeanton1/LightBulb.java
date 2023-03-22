package practice.challenge.challengeanton1;

public class LightBulb extends Device implements SmartDevice{
    public String color;
    private int lumenNumber;
    private String socket;
    private String energy;

    public LightBulb(String color, int lumenNumber, String socket, String energy) {
        this.color = color;
        this.lumenNumber = lumenNumber;
        this.socket = socket;
        this.energy = energy;
    }

    public String getColor(){
        return color;

    }
    public void setColor(String color){
        this.color = color;
    }

    public int getLumenNumber() {
        return lumenNumber;
    }

    public void setLumenNumber(int lumenNumber) {
        this.lumenNumber = lumenNumber;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getEnergy() {
        return energy;
    }

    public void setEnergy(String energy) {
        this.energy = energy;
    }

    @Override
    public boolean isConnection() {
        return false;
    }

    @Override
    public void registerDevice() {

    }

    @Override
    public void status() {

    }
}

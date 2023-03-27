package practice.challenge.challengeanton1;

import java.time.LocalDate;

public class LightBulb extends Device implements SmartDevice {

    private String color;
    private int lumenNumber;
    private String socket;
    private String energy;

    public LightBulb(){}
    public LightBulb(String color, int lumenNumber, String socket, String energy,
                     long id, String name, String model, String brand, int serialNumber,
                     LocalDate manufactureDate) {
        super(id, name, model, brand, serialNumber, manufactureDate);
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
        // TODO
        return false;
    }

    @Override
    public void registerDevice() {
        // TODO
    }

    @Override
    public void status() {
        // TODO
    }
}
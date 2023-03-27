package practice.challenge.challengeanton1;

import java.time.LocalDate;

public class TV extends Device implements SmartDevice {

    private int screenSize;
    private String resolution;
    private int refreshHZ;

    public TV(){}
    public TV(int screenSize, String resolution, int refreshHZ){
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.refreshHZ = refreshHZ;
    }
    public TV(int screenSize, String resolution, int refreshHZ,
              long id, String name, String model,
              String brand, int serialNumber, LocalDate manufactureDate){
        super(id, name, model, brand, serialNumber, manufactureDate);
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.refreshHZ = refreshHZ;
    }

    public int getScreenSize(){
        return screenSize;
    }

    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getRefreshHZ() {
        return refreshHZ;
    }

    public void setRefreshHZ(int refreshHZ) {
        this.refreshHZ = refreshHZ;
    }

    @Override
    public String toString() {
        return "models.TV{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", model='" + getModel() + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", serialNumber=" + getSerialNumber() +
                ", manufactureDate=" + getManufactureDate() +
                ", screenSize=" + screenSize +
                ", resolution='" + resolution + '\'' +
                ", refreshHZ=" + refreshHZ +
                '}';
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
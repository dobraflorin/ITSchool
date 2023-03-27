package practice.challenge.challengeanton1;

import java.time.LocalDate;

public class Device {

    private long id;
    private String name;
    private String model;
    private String brand;
    private int serialNumber;
    private LocalDate manufactureDate;

    public Device(){}

    public Device(long id, String name, String model,
                  String brand, int serialNumber,
                  LocalDate manufactureDate){
        this.id = id;
        this.name = name;
        this.model = model;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.manufactureDate = manufactureDate;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "utils.Device{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", serialNumber=" + serialNumber +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}
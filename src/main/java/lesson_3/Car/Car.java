package lesson_3.Car;

import java.awt.*;

enum TypeCar {
    SEDAN,
    PICKUP
}

enum TypeFuel {
    GASOLIN,
    DISEL
}

enum TypeGearBox {
    MT,
    AT
}

public abstract class Car {

    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearboxType;
    private double engineCapacity;

    public void movement() {
    }

    public void maintenance() {
    }

    public boolean gearShifting() {
        return true;
    }

    public boolean switchHeadlights() {
        return true;
    }

    public boolean switchWipers() {
        return true;
    }

    //метод якорь
    //public void sweeping(){}

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }


    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setGearboxType(TypeGearBox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public TypeGearBox getGearboxType() {
        return gearboxType;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}

class PickUp extends Car implements Refueling, Wiping {
    private int loadCapacity;


    public void fuel() {
    }

    public void wipWindshield() {
    }

    public void wipHeadlights() {
    }

    public void wipMirrors() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

class FutureCar extends Car {

    FutureCar() {
        this.setNumberWheels(3);
    }

    @Override
    public void movement() {
        fly();
    }

    private void fly() {
    }
}

interface Refueling {
    void fuel();
}

interface Wiping {

    void wipWindshield();

    void wipHeadlights();

    void wipMirrors();
}


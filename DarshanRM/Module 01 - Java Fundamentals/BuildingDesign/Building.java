package org.darshan.Day1.BuildingDesign;

public abstract class Building implements Buildable {
    private final String address;
    private final int floors;

    public Building(String address, int floors) {
        this.address = address;
        this.floors = floors;
    }

    @Override
    public void construct() {
        System.out.println("Building is built at " + address);
    }

    abstract public String getInfo();

    public int getFloors() {
        return floors;
    }


    public String getAddress() {
        return address;
    }

}

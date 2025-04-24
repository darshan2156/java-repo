package org.darshan.Day1.BuildingDesign;

public class ResidentialBuilding extends Building {
    private final int numOfUnits;

    public ResidentialBuilding(int numOfUnits, String address, int floors) {
        super(address, floors);
        this.numOfUnits = numOfUnits;
    }

    @Override
    public String getInfo() {
        return "Residential building has " + numOfUnits + " units with " + this.getFloors() + " floors at " + this.getAddress();
    }
}

package org.darshan.Day1.BuildingDesign;

public class OfficeBuilding extends Building{
    private final int numOfOffices;

    public OfficeBuilding(int numOfOffices, String address, int floors) {
        super(address, floors);
        this.numOfOffices = numOfOffices;
    }

    @Override
    public String getInfo() {
        return "Office building have " + numOfOffices + " offices with " + this.getFloors() + " floors at " + this.getAddress();
    }
}

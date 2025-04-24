package org.darshan.Day1.BuildingDesign;

public class Main {
    public static void main(String[] args) {
        Building building = new OfficeBuilding(10, "Sattva Knowdledge park", 6);
        System.out.println(building.getInfo());

        building = new ResidentialBuilding(40, "Kundalhalli", 7);
        System.out.println(building.getInfo());
    }
}

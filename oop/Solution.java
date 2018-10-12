package oop;

import java.util.*;


public class Solution {
    static HashMap<RepairVehicle, Technician> resourceList = new HashMap<>();
    public static void main(String[] args) {

        Vehicle v1 = new MotorCycle();
        Technician T001 = new Technician(Skills.repairBrake, v1);
        RepairVehicle obj1 = new RepairVehicle(Skills.repairBrake, v1);
        resourceList.put(obj1, T001);

        Vehicle v2 = new MotorCycle();
        Technician T002 = new Technician(Skills.repairEngine, v2);
        RepairVehicle obj2 = new RepairVehicle(Skills.repairEngine, v2);
        resourceList.put(obj2, T002);

        Vehicle v3 = new MotorCycle();
        Technician T003 = new Technician(Skills.repairTyre, v3);
        RepairVehicle obj3 = new RepairVehicle(Skills.repairTyre, v3);
        resourceList.put(obj3, T003);

        Vehicle v4 = new Car();
        Technician T004 = new Technician(Skills.repairBrake, v4);
        RepairVehicle obj4 = new RepairVehicle(Skills.repairBrake, v4);
        resourceList.put(obj4, T004);

        Vehicle v5 = new Car();
        Technician T005 = new Technician(Skills.repairEngine, v5);
        RepairVehicle obj5 = new RepairVehicle(Skills.repairEngine, v5);
        resourceList.put(obj5, T005);

        Vehicle v6 = new Car();
        Technician T006 = new Technician(Skills.repairTyre, v6);
        RepairVehicle obj6 = new RepairVehicle(Skills.repairTyre, v6);
        resourceList.put(obj6, T006);

        Vehicle v7 = new Bus();
        Technician T007 = new Technician(Skills.repairBrake, v7);
        RepairVehicle obj7 = new RepairVehicle(Skills.repairBrake, v7);
        resourceList.put(obj7, T007);

        Vehicle v8 = new Bus();
        Technician T008 = new Technician(Skills.repairEngine, v8);
        RepairVehicle obj8 = new RepairVehicle(Skills.repairEngine, v8);
        resourceList.put(obj8, T008);

        Vehicle v9 = new MotorCycle();
        Technician T009 = new Technician(Skills.repairTyre, v9);
        RepairVehicle obj9 = new RepairVehicle(Skills.repairEngine, v9);
        resourceList.put(obj9, T009);

        Skills[] repair={Skills.repairEngine, Skills.repairEngine};
        System.out.println(allotTech(v1,repair));

    }
    public static List<Technician> allotTech(Vehicle vehicle, Skills[] repair){
        List<Technician> techs = new ArrayList<>();
        for(int i = 0; i < repair.length; i++) {
            RepairVehicle repVeh = new RepairVehicle(repair[i], vehicle);
            if(resourceList.containsKey(repVeh)) {
                System.out.println("hey");
                if(resourceList.get(repVeh).getNoOfTasks() < 10) {
                    techs.add(resourceList.get(repVeh));
                    resourceList.get(repVeh).setNoOfTasks(resourceList.get(repVeh).getNoOfTasks()+1);
                }

            }
        }
        return techs;
    }


}

class RepairVehicle{
    Skills repair;
    Vehicle vehicle;

    public RepairVehicle(Skills skill, Vehicle vehicle){
        this.repair = skill;
        this.vehicle = vehicle;
    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof RepairVehicle)) {
            return false;
        }

        RepairVehicle repairVehicle = (RepairVehicle) o;

        return repairVehicle.repair.equals(repair) &&
                repairVehicle.vehicle == vehicle;

    }


    @Override
    public int hashCode() {
        int len=0;
        len = len + repair.toString().length();
        len = len + vehicle.size.toString().length();
        return len;
    }


}

enum VehicleSize { MotorCycle, Compact, Large}

abstract class Vehicle {
    protected String licensePlate;
    protected VehicleSize size;

    public VehicleSize getSize(){
        return size;
    }

}

class Bus extends Vehicle {
        public Bus(){
            size = VehicleSize.Large;
        }
}


class Car extends Vehicle {
    public Car(){
        size = VehicleSize.Compact;
    }
}

class MotorCycle extends Vehicle {
    public MotorCycle(){
        size = VehicleSize.MotorCycle;
    }
}


enum Skills{
    repairBrake, repairTyre, repairEngine;
}

class Technician{
    private Skills skill; //assumption one technician has one skill
    private Vehicle vehicle;
    private int noOfTasks;
    private final int MAXTASK = 10;

    public int getMAXTASK() {
        return MAXTASK;
    }
    public Technician(Skills skill, Vehicle vehicle) {
        this.skill = skill;
        this.vehicle = vehicle;
    }
    public Skills getSkill() {
        return skill;
    }
    public void setSkill(Skills skill) {
        this.skill = skill;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicles(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public int getNoOfTasks() {
        return noOfTasks;
    }
    public void setNoOfTasks(int noOfTasks) {
        this.noOfTasks = noOfTasks;
    }


}



package com.Three;

public class Vehicle
{
    private String vehicleName;
    private String engineCC;
    private String model;

    public Vehicle(String vehicleName, String engineCC, String model) {
        this.vehicleName = vehicleName;
        this.engineCC = engineCC;
        this.model = model;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(String engineCC) {
        this.engineCC = engineCC;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public class Owner
    {
        private String ownerName;
        private int CNICNumber;
        private int phoneNumber;

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public int getCNICNumber() {
            return CNICNumber;
        }

        public void setCNICNumber(int CNICNumber) {
            this.CNICNumber = CNICNumber;
        }

        public int getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Owner(String ownerName, int CNICNumber, int phoneNumber) {
            this.ownerName = ownerName;
            this.CNICNumber = CNICNumber;
            this.phoneNumber = phoneNumber;


        }
    }
}

package Pratice;

public class SourabhVehicles {
    public String vehicleName;
    public String vehicleType;
    public String fuel;
    public String manufacturedPlace;

    public void setVehicleInfo(String vName,String vType,String fType,String manufacturedPlaces)
    {
        vehicleName=vName;
        vehicleType=vType;
        fuel=fType;
        manufacturedPlace=manufacturedPlaces;
    }
    public void getVehicleInfo()
    {
        System.out.println("Name of vehicle > "+vehicleName);
        System.out.println("Type of vehicle > "+vehicleType);
        System.out.println("Fuel used in vehicle > "+fuel);
        System.out.println("Place of vehicle manufacture > "+manufacturedPlace);
    }

}
class Bike extends SourabhVehicles
{

    public  String vehicleName="Ducati"; String vehicleType="Bike"; String fuel="Petrol"; String manufacturedPlace="Imported";

    public void setBikeInfo()
    {
        setVehicleInfo(vehicleName,vehicleType,fuel,manufacturedPlace);
    }
    public void getBikeInfo()
    {
        getVehicleInfo();
    }
}
class Car extends SourabhVehicles
{
    String vehicleName="Honda Accord"; String vehicleType="Car"; String fuel="Disel"; String manufacturedPlace="Made In India";

    public void setCarInfo() {
        setVehicleInfo(vehicleName,vehicleType,fuel,manufacturedPlace);
    }
    public void getCarInfo()
    {
        getVehicleInfo();
    }
}

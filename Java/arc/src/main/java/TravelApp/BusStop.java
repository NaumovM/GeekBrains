package TravelApp;

public class BusStop {
    private int id;
    private String name;
    private double altitude;
    private double latitude;

    public BusStop(int id, String name, int altitude, int latitude) {
        this.id = id;
        this.name = name;
        this.altitude = altitude;
        this.latitude = latitude;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}

package TravelApp;
import java.util.Date;

public class Ticket {
    private float price;
    private Date validOnDate;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    public Ticket(int price, Date validOnDate, int startZone, int finishZone, boolean isLuggage, int place, int roadNumber) {
        this.price = price;
        this.validOnDate = validOnDate;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.isLuggage = isLuggage;
        this.place = place;
        this.roadNumber = roadNumber;
    }

    public float getPrice() {
        return this.price;
    }

    public Date getValidOnDate() {
        return this.validOnDate;
    }

    public int getStartZone() {
        return this.startZone;
    }

    public int getFinishZone() {
        return this.finishZone;
    }

    public boolean isLuggage() {
        return this.isLuggage;
    }

    public int getPlace() {
        return this.place;
    }

    public int getRoadNumber() {
        return this.roadNumber;
    }
}

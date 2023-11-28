package TravelApp;
import java.util.ArrayList;
import java.util.List;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> busStops;

    public BusRoute(int id, String remark, int capacity, List<BusStop> busStops) {
        this.id = id;
        this.remark = remark;
        this.capacity = capacity;
        this.busStops = new ArrayList<>(busStops);
    }

    public int getId() {
        return this.id;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<BusStop> getBusStops() {
        return this.busStops;
    }

    public void appendBusStop(BusStop busStop) {
        this.busStops.add(busStop);
    }
}

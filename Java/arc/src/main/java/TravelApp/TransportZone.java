package TravelApp;

public class TransportZone {
    private int id;
    private String remark;

    public TransportZone(int id, String remark) {
        this.id = id;
        this.remark = remark;
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
}

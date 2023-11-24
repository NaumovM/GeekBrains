package RewardApp;

public class DustGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Dust();
    }
}

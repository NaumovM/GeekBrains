package RewardApp;

public class SilverGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Silver();
    }
}

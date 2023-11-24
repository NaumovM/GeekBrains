package RewardApp;

public class WoodGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Wood();
    }
}

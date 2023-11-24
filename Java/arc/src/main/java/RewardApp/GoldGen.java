package RewardApp;

public class GoldGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Gold();
    }
}

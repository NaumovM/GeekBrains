package RewardApp;

public class BronzeGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Bronze();
    }
}

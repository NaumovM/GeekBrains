package RewardApp;

public class GemGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Gem();
    }
}

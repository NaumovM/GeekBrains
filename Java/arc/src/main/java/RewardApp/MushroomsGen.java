package RewardApp;

public class MushroomsGen extends ItemGenerator{
    @Override
    public  iGameItem createItem() {
        return new Mushrooms();
    }
}

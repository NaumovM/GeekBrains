package RewardApp;

public abstract class ItemGenerator {
    public abstract  iGameItem createItem();
    public void openReward(){
        createItem().open();
    }
}

package hw1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Hero {

    public Hero(String emmett, int i, String sword, List<String> heroBag, boolean b) {
    }

    public void checkingHero() {
        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);


        assert emmett.getName().equals("Emmett");

        assert emmett.getArmorStrength() == 50;

        assert emmett.getWeaponType().equals("sword");

        List<String> expectedBagContents = Arrays.asList("Bow", "Axe", "Gold");
        assert emmett.getInventory().containsAll(expectedBagContents) && expectedBagContents.containsAll(emmett.getInventory());

        assert emmett.isHuman();
    }
    //region Gets
    private boolean isHuman() {
        return false;
    }

    private Collection<Object> getInventory() {
        return null;
    }

    private Object getWeaponType() {
        return null;
    }

    private int getArmorStrength() {
        return 0;
    }

    private Object getName() {
        return null;
    }
    //endregion
}

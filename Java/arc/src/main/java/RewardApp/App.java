package RewardApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<ItemGenerator> gens = new ArrayList<>();
        ItemGenerator mushroomsGen = new MushroomsGen();
        ItemGenerator woodGen = new WoodGen();
        ItemGenerator bronzeGen = new BronzeGen();
        ItemGenerator silverGen = new SilverGen();
        ItemGenerator dustGen = new DustGen();
        ItemGenerator goldGen = new GoldGen();
        ItemGenerator gemGen = new GemGen();

        for(int i = 0; i < 10; i++) {                   //Здесь я добавил по 10 штук в массив
            gens.add(mushroomsGen);
            gens.add(woodGen);
            gens.add(bronzeGen);
            gens.add(silverGen);
            gens.add(dustGen);
        }

        for(int i = 0; i < 3; i++) {                    //Этого 3
            gens.add(goldGen);
        }

        gens.add(gemGen);                               //Один, для сохранения пропорции 10:3:1

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(gens.size());    //Размер массива изменен
            gens.get(index).openReward();
        }
    }
}

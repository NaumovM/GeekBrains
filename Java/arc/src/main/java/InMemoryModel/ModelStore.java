package InMemoryModel;

import ModelElements.*;

import java.security.PublicKey;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangeObserver[] changeObserver;

    public ModelStore(IModelChangeObserver[] changeObserver) throws Exception {
        this.changeObserver = changeObserver;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        List<Texture> textures = new ArrayList<>();
        this.models.add(new PoligonModel(textures));

        this.flashes.add(new Flash());
        this.cameras.add(new Camera());
        this.scenes.add(new Scene(0, models, flashes, cameras));
    }
    public  Scene GetScene(int id){
        return this.scenes.get(id);
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }


}

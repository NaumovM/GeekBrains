package ModelElements;
import Stuff.Type;
import java.util.List;

public class Scene {
    public int id;
    public List<PoligonModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<PoligonModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0) {
            this.models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна камера");
        }
    }

    public Type method1(Type t) {
        return null;
    }

    public Type method2(Type t1, Type t2) {
        return null;
    }

}

package ModelElements;

import java.lang.reflect.Type;

public class Scene {
    public int id;
    public PoligonModel models;
    public Flash flashes;

    public Scene(PoligonModel models, Flash flashes) { //отношения плохо понятно,квардратики, цифры.
        this.models = models;
        this.flashes = flashes;
    }

    public Type method1(Type){
        return Type; //красное, не нравится
    }
    public Type method2(Type, Type){
        return Type;
    }

}

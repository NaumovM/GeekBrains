package sem3hw;
import java.util.HashMap;
import java.util.Map;

public class DatabaseImplementation implements DatabaseInterface {
    private Map<String, Object> database;

    public DatabaseImplementation() {
        this.database = new HashMap<>();
    }

    @Override
    public void save(Object data) {
        System.out.println("Сохранение " + data + " в базе данных.");
        String id = data.toString();
        database.put(id, data);
    }

    @Override
    public void delete(String objectId) {
        System.out.println("Удаление объекта с идентификатором " + objectId + " из базы данных.");
        database.remove(objectId);
    }

    @Override
    public Object get(String objectId) {
        System.out.println("Получение объекта с идентификатором " + objectId + " из базы данных.");
        return database.get(objectId);
    }
}

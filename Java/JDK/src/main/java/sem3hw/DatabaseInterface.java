package sem3hw;

public interface DatabaseInterface {
    void save(Object data);

    void delete(String objectId);

    Object get(String objectId);
}
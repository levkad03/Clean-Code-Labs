import java.util.HashMap;
import java.util.Map;

public class StorageManager {
    private static StorageManager instance;
    private Map<String, Storage> storageMap;

    private StorageManager() {
        storageMap = new HashMap<>();
    }

    public static StorageManager getInstance() {
        if (instance == null) {
            instance = new StorageManager();
        }

        return instance;
    }

    public void setUserStorage(String userId, String storageType) {
        Storage storage = StorageFactory.getStorage(storageType);
        storageMap.put(userId, storage);
    }

    public Storage getUserStorage(String userId) {
        return storageMap.get(userId);
    }
}

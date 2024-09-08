public class Main {
    public static void main(String[] args) {
        StorageManager storageManager = StorageManager.getInstance();
        
        storageManager.setUserStorage("user1", "local");
        Storage user1Storage = storageManager.getUserStorage("user1");
        user1Storage.uploadFile("file1.txt");

        storageManager.setUserStorage("user2", "s3");
        Storage user2Storage = storageManager.getUserStorage("user2");
        user2Storage.uploadFile("file2.txt");

        user1Storage.downLoadFile("file1.txt");
    }
}

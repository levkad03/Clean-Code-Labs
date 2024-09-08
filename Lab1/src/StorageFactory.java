public class StorageFactory {
    public static Storage getStorage(String storageType) {
        if (storageType.equalsIgnoreCase("local")) {
            return new LocalDiskStorage();
        } else if (storageType.equalsIgnoreCase("s3")) {
            return new AmazonS3Storage();
        }
        throw new IllegalArgumentException("Invalid storage type");
    }
}

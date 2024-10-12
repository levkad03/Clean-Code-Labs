import java.util.HashMap;

public class CachedDownloader implements Downloader {

    private SimpleDownloader simpleDownloader;
    private HashMap<String, byte[]> cache;

    public CachedDownloader(SimpleDownloader simpleDownloader) {
        this.simpleDownloader = simpleDownloader;
        this.cache = new HashMap<>();
    }

    @Override
    public byte[] download(String url) {
        if (cache.containsKey(url)) {
            System.out.println("Fetching from cache: " + url);
            return cache.get(url);
        } else {
            System.out.println("Downloading: " + url);
            byte[] data = simpleDownloader.download(url);
            cache.put(url, data);
            return data;
        }
    }
}

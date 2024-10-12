public class Main {
    public static void main(String[] args) {
        Downloader downloader = new CachedDownloader(new SimpleDownloader());

        byte[] data1 = downloader.download("https://example.com/file1");
        byte[] data2 = downloader.download("https://example.com/file2");
        byte[] data3 = downloader.download("https://example.com/file1");
    }
}
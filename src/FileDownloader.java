public class FileDownloader implements Downloader{
    private String UserAgent;

    public FileDownloader(String userAgent) {
        UserAgent = userAgent;
    }

    public String getUserAgent() {
        return UserAgent;
    }

    public void setUserAgent(String userAgent) {
        UserAgent = userAgent;
    }

    @Override
    public void download(String url) {
        System.out.println("Download......");
    }
}

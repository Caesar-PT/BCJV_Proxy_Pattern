public class FileDownloaderProxy implements Downloader{
    FileDownloader fileDownloader;
    private String url;

    public FileDownloaderProxy(String url) {
        this.url = url;
    }

    @Override
    public void download(String url) {
        if (fileDownloader == null){
            fileDownloader = new FileDownloader(url);
        } else
            System.out.println("Downloaded......");
        fileDownloader.download(url);
    }
}

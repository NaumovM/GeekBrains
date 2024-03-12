package sem4hw;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader {
    public static void main(String[] args) {
        String fileUrl = "https://mykaleidoscope.ru/x/uploads/posts/2022-10/1666137209_33-mykaleidoscope-ru-p-veselii-kotik-oboi-36.jpg";
        String saveDir = "C:\\Users\\naumo\\Downloads";

        int numOfThreads = 3;

        try {
            URL url = new URL(fileUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int fileSize = connection.getContentLength();
            connection.disconnect();

            int chunkSize = fileSize / numOfThreads;
            int remainingBytes = fileSize % numOfThreads;

            for (int i = 0; i < numOfThreads; i++) {
                int startByte = i * chunkSize;
                int endByte = (i + 1) * chunkSize - 1;
                if (i == numOfThreads - 1) {
                    endByte += remainingBytes;
                }

                RunnableThread thread = new RunnableThread(fileUrl, saveDir, startByte, endByte, i);
                new Thread(thread).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class RunnableThread implements Runnable {
        private String fileUrl;
        private String saveDir;
        private int startByte;
        private int endByte;
        private int threadId;

        public RunnableThread(String fileUrl, String saveDir, int startByte, int endByte, int threadId) {
            this.fileUrl = fileUrl;
            this.saveDir = saveDir;
            this.startByte = startByte;
            this.endByte = endByte;
            this.threadId = threadId;
        }

        @Override
        public void run() {
            try (BufferedInputStream in = new BufferedInputStream(new URL(fileUrl).openStream())) {
                in.skip(startByte);
                FileOutputStream fileOutputStream = new FileOutputStream(saveDir + "/part_" + threadId + ".tmp");
                byte[] data = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(data, 0, 1024)) != -1 && startByte <= endByte) {
                    fileOutputStream.write(data, 0, bytesRead);
                    startByte += bytesRead;
                }
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

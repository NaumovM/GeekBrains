package sem5;
import java.io.*;

public class BackupFiles {
    public static void main(String[] args) {
        String sourceDir = "src/main/java/sem5";
        String backupDir = "./backup";

        File sourceDirectory = new File(sourceDir);
        File backupDirectory = new File(backupDir);

        if (!backupDirectory.exists()) {
            backupDirectory.mkdirs();
        }

        File[] files = sourceDirectory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try (InputStream inputStream = new FileInputStream(file)) {
                        File backupFile = new File(backupDirectory, file.getName());
                        try (OutputStream outputStream = new FileOutputStream(backupFile)) {
                            byte[] buffer = new byte[1024];
                            int length;
                            while ((length = inputStream.read(buffer)) > 0) {
                                outputStream.write(buffer, 0, length);
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println("Резервная копия всех файлов в директории была успешно создана в " + backupDirectory.getAbsolutePath());
    }
}


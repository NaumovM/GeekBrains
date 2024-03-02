package sem5;
import java.io.File;

public class Tree {

    public static void main(String[] args) {
        print(new File("."), "", true);
    }

    static void print(File file, String indent, boolean isLast){
        System.out.print(indent);
        if (isLast){
            System.out.print("└─");
            indent += "  ";
        }
        else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                int subItemCount = 0;
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory() || files[i].isFile()) {
                        subItemCount++;
                    }
                }

                int subItemCounter = 0;
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory() || files[i].isFile()) {
                        print(files[i], indent, ++subItemCounter == subItemCount);
                    }
                }
            }
        }
    }
}

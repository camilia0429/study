package exam02;

import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        File file0 = new File("D:"+File.separator+"FileEx"+File.separator+"file1.txt");
        file0.createNewFile();

        Thread.sleep(3000);
        file0.delete();

        File dir = new File("D:"+File.separator+"FileEx");
        File file = File.createTempFile("tmp_",".log",dir);

        Thread.sleep(5000);

        file.deleteOnExit();
    }
}

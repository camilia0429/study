package exam02;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        File file0 = new File("D:"+File.separator+"FileEx"+File.separator+"file1.txt");
        if(file0.exists()) {
            file0.delete();
        }
        File dir = file0.getParentFile();
        File subDir = new File(dir, "sub");
        File subFile = new File(subDir,"file2.txt");
        if(!subDir.exists()) {
            subDir.mkdir();
        }
        subFile.createNewFile();
    }
}

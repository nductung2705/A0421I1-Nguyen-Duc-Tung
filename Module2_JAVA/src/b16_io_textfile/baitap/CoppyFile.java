package b16_io_textfile.baitap;

import java.io.*;

public class CoppyFile {
    public void copyFile(String source,String target) throws IOException {
        FileWriter fileWriter=null;
        BufferedReader bufferedReader=null;
        try{
            File file=new File(source);
            bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            fileWriter=new FileWriter(target);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            while ((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.err.println("File nguon ko chinh xac");
        }
        finally {
            bufferedReader.close();
            fileWriter.close();
        }
    }

    public static void main(String[] args) {
        try {
            CoppyFile coppyFile=new CoppyFile();
            coppyFile.copyFile("D:\\A0421I1_NguyenDucTung\\Module2_JAVA\\src\\text1.txt","D:\\A0421I1_NguyenDucTung\\Module2_JAVA\\src\\text2.txt");
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

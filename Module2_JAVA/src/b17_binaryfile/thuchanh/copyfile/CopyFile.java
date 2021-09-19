package b17_binaryfile.thuchanh.copyfile;

import b16_io_textfile.baitap.CoppyFile;

import java.io.*;

public class CopyFile {
    public static void readFile(String path){
        int a=-1;
        String b="";
        try {
            FileInputStream is = new FileInputStream(new File(path));
            DataInputStream dataInputStream = new DataInputStream(is);

            a=dataInputStream.readInt();
            b=dataInputStream.readUTF();
            dataInputStream.close();
        } catch (IOException e){
            e.getMessage();
        }
        System.out.println(a);
        System.out.println(b);
    }
    public static void writeFile(String path) {
        int a = 5;
        String b = "Hello world"; // => 73 => 101010101
        try {
            FileOutputStream outputStream = new FileOutputStream(path);
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeInt(a);
            dataOutputStream.writeChars(b);

            dataOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void copyFileBinary(String source, String target) throws IOException{
        InputStream is =null;
        OutputStream os =null;
        try {
            int a = 0;
            String b = "";
            is = new FileInputStream(source);
            os = new FileOutputStream(target);

            DataInputStream dataInputStream = new DataInputStream(is);
            DataOutputStream dataOutputStream = new DataOutputStream(os);

            a = dataInputStream.readInt();
            b = dataInputStream.readUTF();

            dataInputStream.close();

            dataOutputStream.writeInt(a);
            dataOutputStream.writeChars(b);
            dataOutputStream.close();
        } catch (Exception e){
            System.err.println("Xay ra ngoai le");
        }
        finally {
            is.close();
            os.close();
        }
        }

    public static void main(String[] args) {
        //writeFile("test4.dat");
        readFile("test4.dat");

    }


}

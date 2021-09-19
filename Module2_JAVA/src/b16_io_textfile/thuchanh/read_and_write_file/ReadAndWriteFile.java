package b16_io_textfile.thuchanh.read_and_write_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> numbers=new ArrayList<>();
        try {
            File file=new File(filePath);

            BufferedReader br=new BufferedReader(new FileReader(file));
            String line="";
            while ((line=br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File ko ton tai");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.err.println("Xay ra ngoai le khac");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        FileWriter fileWriter=null;
        try {
            fileWriter =new FileWriter("D:\\A0421I1_NguyenDucTung\\Module2_JAVA\\src\\text1.txt",true);
            BufferedWriter bw=new BufferedWriter(fileWriter);
            bw.write("\nGia tri lon nhat la "+max);
            bw.flush();
            bw.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile=new ReadAndWriteFile();
        List<Integer> numbers=readAndWriteFile.readFile("D:\\A0421I1_NguyenDucTung\\Module2_JAVA\\src\\text1.txt");
        System.out.println(numbers.toString());

        readAndWriteFile.writeFile("D:\\A0421I1_NguyenDucTung\\Module2_JAVA\\src\\text1.txt",4);

    }
}

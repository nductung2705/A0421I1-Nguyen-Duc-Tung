package b16_io_textfile.thuchanh.readfile_example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String pathFile) {
        try {
            File file = new File(pathFile);

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            float sum=0;

            while ((line=br.readLine())!=null){
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tonng la:"+sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap duong dan file: ");
        String path=scanner.nextLine();

        ReadFileExample readFileExample=new ReadFileExample();

        readFileExample.readFileText(path);
    }
}

package b17_binaryfile.thuchanh;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadObjectFile {
    public void readObject(String pathFile){
        try{
            ObjectInputStream objectIntputStream=new ObjectInputStream(new FileInputStream(pathFile));
            List<Student> list=(List<Student>) objectIntputStream.readObject();
            for(Student st: list){
                System.out.println(st.toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void writeObject(String path, List<Student> list){
        try{
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(path));
            objectOutputStream.writeObject(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"Tung","GL"));
        list.add(new Student(2,"Tun","HN"));
        list.add(new Student(3,"Tu","DN"));
        ReadObjectFile readObjectFile=new ReadObjectFile();
        readObjectFile.writeObject("sample3.dat",list);

        readObjectFile.readObject("sample3.dat");
    }
}

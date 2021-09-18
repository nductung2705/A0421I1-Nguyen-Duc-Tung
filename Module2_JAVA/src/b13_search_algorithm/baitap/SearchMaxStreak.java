package b13_search_algorithm.baitap;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SearchMaxStreak {
    static void searchMaxStreak(String string){
        List<Character> max=new LinkedList<>();

        for(int i=0;i<string.length();i++){
            LinkedList<Character> list=new LinkedList<>();
            list.add(string.charAt(i));
            for(int j=i+1;j<string.length();j++){
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
                else {
                    break;
                }
            }
            if(list.size()>=max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for(Character character: max){
            System.out.print(character);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Nhap chuoi: ");
        String string= scanner.nextLine();

        searchMaxStreak(string);
    }
}

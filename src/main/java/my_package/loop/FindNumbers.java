package my_package.loop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FindNumbers {
    public static void main(String[] args) {
        //List<Integer>
        //1000 elements - 1:100
        // 51 - print index of 51
        Random random = new Random();
        List<Integer> intList = new ArrayList<>();

        for(int i =0; i < 1000; i++){
            intList.add(random.nextInt(101));
        }

        for(Integer i : intList){
            if(intList.get(i) == 51){
                System.out.println("found");
                System.out.println("index: " +i);
                break;
            }

        }
        for(Integer i =0; i < intList.size(); i++){
            if(intList.get(i) == 51){
                System.out.println("found");
                System.out.println("index: " +i);
                break;
            }



        }
    }
}

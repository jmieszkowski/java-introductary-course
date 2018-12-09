package my_package.loop;


public class WhileTest {
    int a =5;
    public static void main(String[] args) {



    printNumber();
    }
    public static void printNumber(){
        for(int i =0; i < 100; i++){
            System.out.println("i:"+i);

            if (i ==51){
                break;
            }
        }
    }
}

package ex_09_ForLoop;

public class Lab035_ForLoopBreakContinue {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if(i ==2){
//                System.out.println("2");
//                break;
//            }
//        }

        for (int j = 0; j < 5; j++) {
            if (j==2){
                continue;
            }
            System.out.println(j);
        }
    }
}

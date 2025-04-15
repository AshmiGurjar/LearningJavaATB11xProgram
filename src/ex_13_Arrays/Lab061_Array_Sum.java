package ex_13_Arrays;

public class Lab061_Array_Sum {
    public static void main(String[] args) {
        int[] number = {25,27,50};

        int sum =0;

        //Way 1
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        System.out.println(sum);

        //Way 2
        for(int n : number){
            sum = sum + n;
        }
        System.out.println("Sum from for each"+ sum);

    }

}

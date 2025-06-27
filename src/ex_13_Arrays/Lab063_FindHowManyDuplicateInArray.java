package ex_13_Arrays;

public class Lab063_FindHowManyDuplicateInArray {
    public static void main(String[] args) {
        int a[]= {100,200,100,300,100,400,100};
        int num =100;
        int count =0;

        for(int x :a){
                if(x ==num){
                count++;
                }
        }
        System.out.println(count);
    }
}

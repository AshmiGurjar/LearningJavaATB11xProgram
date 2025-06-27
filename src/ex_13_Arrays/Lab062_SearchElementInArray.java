package ex_13_Arrays;

public class Lab062_SearchElementInArray {

    public static void main(String[] args) {

        int a[]= {10,20,30,40,50,60,70};
        int searchElement = 30;
        boolean status= false;

        //Way 1
//
//
//        for (int i = 0; i < a.length ; i++) {
//            if(a[i] == searchElement){
//                System.out.println("Yes element found");
//                status = true;
//                break;
//            }
//        }
//
//        if(status =false){
//            System.out.println("Element not found");
//        }

        for (int x :a){
            if (x == searchElement){
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if(status==false){
            System.out.println("Element not found");
        }
    }


}
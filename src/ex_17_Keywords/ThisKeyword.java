package ex_17_Keywords;
public class ThisKeyword {

    int x,y;
//    ThisKeyword(int a ,int b){
//        x=a;
//        y=b;
//    }

    ThisKeyword(int x ,int y){
        this.x=x;
        this.y=y;
    }


    void Display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
    ThisKeyword thisKeyword = new ThisKeyword(100,200);
    thisKeyword.Display();

    }
}

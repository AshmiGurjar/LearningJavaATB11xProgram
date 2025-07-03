package ex_16_OOPsConcept.Polymorphism;

//Constructor Overloading
public class Box {

    double width,height,depth;
    Box(){
        width = depth = height =0;
    }

    Box(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
    Box(Double len){
        width= height = depth =len;
    }

    double volume(){
        return (width*height*depth);
    }

    public static void main(String[] args) {
        Box box = new Box(5.2,10.4,2.5);
        System.out.println(box.volume());
    }
}

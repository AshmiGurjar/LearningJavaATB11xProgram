package ex_15_Collections.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//1. Heterogenius data   - allowed
//2. Insertion order     -  Preserved (Allowed)
//3. Duplicate element   -   Allowed
//4. Multiple nulls      -   Allowed


public class Lab073_ArrayListDemo {
    public static void main(String[] args) {

        //Arraylist can store object type of data
        //Declaration
        ArrayList mylist = new ArrayList();  // Way 1
//        List myList = new ArrayList();       // Way 2

//        ArrayList<Integer> arrayList = new ArrayList<Integer>(); //Allow to only access int value
//        ArrayList<String> arrayListS = new ArrayList<String>(); //Allow to only access string value
//        ArrayList <Employee>al = new ArrayList<Employee>(); //Allow to only access Employee class

        //Adding Data into arrayList
        mylist.add(10);
        mylist.add(2.54);
        mylist.add("Test");
        mylist.add('A');
        mylist.add(10);
        mylist.add(true);
        mylist.add(10);
        mylist.add(null);
        mylist.add(null);
        mylist.add(null);

        //check the arraylist is empty or not
        System.out.println("Is arraylist is empty? "+mylist.isEmpty());

        //size of arraylist
        System.out.println("Size of arrayList: "+mylist.size());

        //Printing arraylist
        System.out.println("Printing data from arrayList: "+mylist);

        //remove element from arraylist
        mylist.remove(3);
        System.out.println("After remove arraylist: " +mylist);

        //remove all the elements from the array list
        ArrayList mylist2 = new ArrayList();
        mylist2.add(101);
        mylist2.add(102);
        mylist2.add(103);
        mylist2.add('C');
        mylist2.add("Hello world");

        mylist.removeAll(mylist2);

        //mylist.clear(); //remove all the value

        //Insert element in arraylist
        mylist.add(3,"Hi");
        System.out.println("After insert element: "+mylist);

        //Modify or replace element
        mylist.set(3,"Hello");
        System.out.println("After modify element: "+mylist);


        //Access specific element from arraylist
        System.out.println(mylist.get(2));

        //get the data from arraylist
        //1. Using for loop
        for (int i = 0; i <= mylist.size()-1; i++) {
            System.out.println(mylist.get(i));
        }

        //2. Using for each loop
        for(Object j:mylist){
            System.out.println(j);
        }

       //3. Using iterator
        Iterator iterator = mylist.iterator();
        // Iterator<String> iteratorString = mylist.iterator(); //this will be use when there have specific DT

        while (iterator.hasNext()) { //hasnext check array element available or not
            System.out.println(iterator.next());
        }

    }
}

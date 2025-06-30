package ex_15_Collections.Hash;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//1. Heterogenius data   -  Allowed
//2. Insertion order     -  Not Preserved (Index not supported)
//3. Duplicate element   -  Not Allowed
//4. Multiple nulls      -   Not Allowed (Only single NULL Allowed)

public class Lab074_HashSetDemo {
    public static void main(String[] args) {

        //Declaration
        HashSet myset = new HashSet();  //Way 1
        //Set myset1 = new HashSet();      //Way 2

        //HashSet<String> myset2 = new HashSet<String>();

        //Adding element to Hashset
        myset.add(100);
        myset.add(10.5);
        myset.add('A');
        myset.add("Test");
        myset.add(100);
        myset.add(true);
        myset.add(null);
        myset.add(null);

        //Print value
        System.out.println("Printing value: "+myset);  //[null, A, 100, 10.5, Test, true]

        //get the size
        System.out.println("Get the size:" +myset.size());

        //remove value from hashset
        System.out.println(myset.remove(100)); //100-value index not supported
        System.out.println("Print data after remove value from Hashset"+myset);

        //Insert element-Not possible
        //Insert elements is not possible as data are not in fix order

        //Access specific element -Not possible

        //Convert Hashset to array list
        ArrayList arrayList = new ArrayList(myset);
        System.out.println(arrayList);

        System.out.println(arrayList.get(3));

        //Read all the elements from for each
        for (Object a : myset){
            System.out.println(a);
        }

        //Read all the elements from Iterator
        Iterator<Object> iterator =myset.iterator();

        while (iterator.hasNext()) { //hasnext check array element available or not
            System.out.println(iterator.next());
        }

        //Clearing all the element from list
        myset.clear();

    }
}

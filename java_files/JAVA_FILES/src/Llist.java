import java.util.*;

public class Llist {
    public static void main(String args[]) {
        LinkedList<String> L1 = new LinkedList<String>();
        L1.add("akshay");
        L1.add("radha");
        L1.add("naresh");
        System.out.println(L1);
        L1.add(1, "sai charan");
        L1.add(2, "joseph");
        System.out.println(L1);
        LinkedList<String> L2 = new LinkedList<String>();
        L2.add("neekenduku");
        L2.add("nuvvu evadra");
        L2.add("eleehe");
        L2.addAll(L1);
        System.out.println(L2);
        // changing the elements
        L1.set(1, "hi");
        System.out.println(L1);

    }
}

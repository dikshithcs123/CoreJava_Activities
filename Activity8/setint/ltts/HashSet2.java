package act8.setint.ltts;
import act8.setint.ltts.*;

import java.util.*;

public class HashSet2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<String> set = new HashSet<String>();
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < limit; i++) {
            String s = sc.nextLine();
            set.add(s);
        }

        TreeSet<String> treeSet = new TreeSet<String>(set);

        Iterator<String> i = treeSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

    }

}
/*
 * 5 Virat Kohli MS Dhoni Rohit Sharma Virat Kohli Gautam Gambir
 */

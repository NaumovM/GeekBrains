import java.util.*;

public class sem6 {
    public static void main(String[] args) {
        MySet sett = new MySet();
        System.out.println(sett.add(1));
        System.out.println(sett.contains(1));
        System.out.println(sett.add(2));
        System.out.println(sett.add(1));
        System.out.println(sett.getIndex(1));
        System.out.println(sett.isEmpty());
//        System.out.println(sett.myDel(1));
//        System.out.println(sett.myDel(2));
//        System.out.println(sett.myDel(1));
        System.out.println(sett.isEmpty());

        Iterator<Integer> integerIterator = sett.integerIterator();
        while (integerIterator.hasNext()) {
            int i = integerIterator.next();
            System.out.println(i);
        }
    }
}

class MySet {
    private HashMap<Integer, Object> myDb = new HashMap<>();
    private static final Object MYOBJ = new Object();

    public boolean add(int elem) {
        return myDb.put(elem, MYOBJ) == null;
    }

    public boolean myDel(int elem) {
        return myDb.remove(elem) == MYOBJ;
    }

    public boolean isEmpty() {
        return myDb.isEmpty();
    }

    public boolean contains(int elem) {
        return myDb.containsKey(elem);
    }

    public int getIndex(int id) {
        Object[] a = myDb.keySet().toArray();
        return (int) a[id];
    }

    public Iterator<Integer> integerIterator() {
        return myDb.keySet().iterator();
    }
}
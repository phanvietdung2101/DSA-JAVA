import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add("dung");
        list.add("trong");
        list.add("kieu");
        list.add("DUC");

        System.out.println(list.get(1));
        list.add(1,"addIn1");
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
        System.out.println(list.get(1));


        ArrayList<Object> a = new ArrayList<>();
        a.add(1);
        a.add("abc");
        System.out.println(a.get(0));
        System.out.println(a.get(1));
    }
}

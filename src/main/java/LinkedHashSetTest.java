import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashSet linkHashSet =  new LinkedHashSet();
        Student linkedstu1 = new Student(18,"zxx");
        Student linkedstu2 = new Student(23,"zyj");
        Student linkedstu3 = new Student(25,"xmh");
        Student linkedstu4 = new Student(25,"zah");
        Student linkedstu5 = new Student(25,"zah");
        linkHashSet.add(linkedstu3);
        linkHashSet.add(linkedstu4);
        linkHashSet.add(linkedstu1);
        linkHashSet.add(linkedstu2);
        linkHashSet.add(linkedstu5);
        linkHashSet.add(null);
        Iterator it =  linkHashSet.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        //经过测试是有序的而且不能重复
    }

}

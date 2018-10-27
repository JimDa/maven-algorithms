import java.util.ArrayList;
import java.util.List;

public class Practice118 {
    public static void main(String[] args) {
        Practice118 practice118 = new Practice118();
        List<List<Integer>> lists = practice118.generate(5);
        System.out.println(lists);
    }
    public List<List<Integer>> generate(int numRows) {
        int i = 2;
        List<List<Integer>> arrayLists = new ArrayList(){{
            add(new ArrayList(){{
                add(1);
            }});
            add(new ArrayList(){{
                add(1);
                add(1);
            }});
        }};
        if (numRows == 0) {
            arrayLists.clear();
            return arrayLists;
        } else if (numRows == 1) {
            arrayLists.remove(1);
            return arrayLists;
        } else if (numRows == 2) {
            return arrayLists;
        } else {
            return countAndAdd(i,numRows,arrayLists);
        }
    }

    private List<List<Integer>> countAndAdd(int i, int numRows, List<List<Integer>> arrayLists) {
        List<Integer> list = arrayLists.get(arrayLists.size() - 1);
        ArrayList<Integer> subList = new ArrayList<>();
        subList.add(1);
        for (int j = 0; j < list.size() - 1; j++) {
            subList.add(list.get(j) + list.get(j + 1));
        }
        subList.add(1);
        arrayLists.add(subList);
        i++;
        if (i == numRows) {
            return arrayLists;
        } else {
            return countAndAdd(i,numRows,arrayLists);
        }
    }
}

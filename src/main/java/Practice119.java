import java.util.ArrayList;
import java.util.List;

public class Practice119 {
    public List<Integer> getRow(int rowIndex) {
        int i = 1;
        List<List<Integer>> arrayLists = new ArrayList(){{
            add(new ArrayList(){{
                add(1);
            }});
            add(new ArrayList(){{
                add(1);
                add(1);
            }});
        }};
        if (rowIndex <= 1) {
            return arrayLists.get(rowIndex);
        } else {
            List<List<Integer>> lists = countAndAdd(i, rowIndex, arrayLists);
            return lists.get(rowIndex);
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

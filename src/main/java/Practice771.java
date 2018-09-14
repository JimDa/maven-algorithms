public class Practice771 {
    public int numJewelsInStones(String J, String S) {
        char[] array1 = J.toCharArray();
        char[] array2 = S.toCharArray();
        Integer count = 0;
        for(Character char1 : array1) {
            for(Character char2 : array2) {
                if(char1.equals(char2)) {
                    count++;
                }
            }
        }
        return count;
    }
}

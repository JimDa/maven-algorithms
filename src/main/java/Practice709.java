public class Practice709 {
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : chars) {
            stringBuilder.append(String.valueOf(character).toLowerCase());
        }
        return stringBuilder.toString();
    }
}

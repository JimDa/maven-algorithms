public class Practice67 {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        Practice67 practice67 = new Practice67();
        String s = practice67.addBinary(a, b);
        System.out.println(s);
    }

    public String addBinary(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int[] ints = new int[charsA.length > charsB.length ? charsA.length : charsB.length];
        char[] shortArray;
        char[] longArray;
        if (charsA.length <= charsB.length) {
            shortArray = charsA;
            longArray = charsB;
        } else {
            longArray = charsA;
            shortArray = charsB;
        }
        int n = longArray.length - shortArray.length;
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (int i = longArray.length - 1; i >= 0; i--) {
            if (i - n < 0) {
                for (int j = ints.length - n; j < ints.length; j++) {
                    sb.append(ints[j]);
                }
                String prefix;
                if (a.length() > b.length()) {
                    prefix = a.substring(1, a.length() - n);
                } else {
                    prefix = b.substring(0, b.length() - n);
                }
                if (flag == true) {
                    return String.valueOf("10" + prefix + sb);
                } else {
                    return String.valueOf(prefix + sb);
                }

            }
            if (flag) {
                if (Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) + 1 == 3 && i != 0) {
                    ints[i] = 1;
                    flag = true;
                } else if (Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) + 1 == 3 && i == 0) {
                    int[] expandedInts = new int[ints.length + 1];
                    ints[0] = 1;
                    for (int j = 0; j < expandedInts.length; j++) {
                        if (j == 0) {
                            expandedInts[j] = 1;
                        } else {
                            expandedInts[j] = ints[j - 1];
                        }
                        sb.append(expandedInts[j]);
                    }
                    return String.valueOf(sb);
                } else if (Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) + 1 == 2 && i != 0) {
                    ints[i] = 0;
                    flag = true;
                } else if (Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) + 1 == 2 && i == 0) {
                    int[] expandedInts = new int[ints.length + 1];
                    for (int j = 0; j < expandedInts.length; j++) {
                        if (j == 0) {
                            expandedInts[j] = 1;
                        } else {
                            expandedInts[j] = ints[j - 1];
                        }
                        sb.append(expandedInts[j]);
                    }
                    return String.valueOf(sb);
                } else {
                    ints[i] = Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) + 1;
                    flag = false;
                }
            } else {
                if (Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) == 2 && i != 0) {
                    ints[i] = 0;
                    flag = true;
                } else if (Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]) == 2 && i == 0) {
                    int[] expandedInts = new int[ints.length + 1];
                    for (int j = 0; j < expandedInts.length; j++) {
                        if (j == 0) {
                            expandedInts[j] = 1;
                        } else {
                            expandedInts[j] = ints[j - 1];
                        }
                        sb.append(expandedInts[j]);
                    }
                    return String.valueOf(sb);
                } else {
                    ints[i] = Character.getNumericValue(shortArray[i - n]) + Character.getNumericValue(longArray[i]);
                    flag = false;
                }
            }
        }
        for (Integer i : ints) {
            sb.append(i);
        }
        return String.valueOf(sb);
    }
}

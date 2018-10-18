//public class Practice67 {
//    public String addBinary(String a, String b) {
//        char[] chars = a.toCharArray();
//        char[] chars1 = b.toCharArray();
//        int[] ints = new int[chars.length > chars1.length ? chars.length : chars1.length];
//        if (chars.length <= chars1.length) {
//            boolean flag = false;
//            for (int i = chars.length - 1; i >= 0; i++) {
//
//                if (flag) {
//                    if (Character.getNumericValue(chars[i]) + Character.getNumericValue(chars1[i]) + 1 == 2 && i != 0) {
//                        ints[i] = 0;
//                        flag = true;
//                    } else if (Character.getNumericValue(chars[i]) + Character.getNumericValue(chars1[i]) + 1 == 2 && i == 0) {
//                        int[] expandedInts = new int[ints.length + 1];
//                        StringBuilder sb = new StringBuilder();
//                        for (int j = 0; j < expandedInts.length; j++) {
//                            if (j == 0) {
//                                expandedInts[j] = 1;
//                            } else {
//                                expandedInts[j] = ints[j - 1];
//                            }
//                        }
//                    } else {
//                        ints[i] = Character.getNumericValue(chars[i]) + Character.getNumericValue(chars1[i]);
//                        flag = false;
//                    }
//                } else {
//                    if (Character.getNumericValue(chars[i]) + Character.getNumericValue(chars1[i]) == 2) {
//                        ints[i] = 0;
//                        flag = true;
//                    } else {
//                        ints[i] = Character.getNumericValue(chars[i]) + Character.getNumericValue(chars1[i]);
//                        flag = false;
//                    }
//                }
//            }
//        }
//    }
//}

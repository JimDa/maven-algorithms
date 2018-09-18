

public class Practice564 {
    public static void main(String[] args) {
        String n = "1";
        Practice564 ins = new Practice564();
        String s = ins.nearestPalindromic(n);
        System.out.println(s);
    }

    public String nearestPalindromic(String n) {
        Long num = Long.valueOf(n);
        Asc asc = new Asc(num);
        Desc desc = new Desc(num);
        Thread thread1 = new Thread(asc);
        Thread thread2 = new Thread(desc);
        thread1.start();
        thread2.start();
        while (true) {
            if (thread1.isAlive() == false || thread2.isAlive() == false) {
                return thread1.isAlive() == false ? asc.num.toString() : desc.num.toString();
            }
        }
    }

    public static class Asc implements Runnable {
        Long num;

        Asc(Long n) {
            this.num = n;
        }

        @Override
        public void run() {
            while (true) {
                num++;
                char[] chars = String.valueOf(num).toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != chars[chars.length - i - 1]) {
                        break;
                    }
                    if (chars.length % 2 != 0) {
                        if (i == (chars.length - 1) / 2) {
                            return;
                        }
                    } else {
                        if (i == chars.length / 2 - 1) {
                            return;
                        }
                    }
                }
            }
        }
    }


    public class Desc implements Runnable {
        Long num;

        Desc(Long n) {
            this.num = n;
        }

        @Override
        public void run() {
            while (true) {
                num--;
                char[] chars = String.valueOf(num).toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] != chars[chars.length - i - 1]) {
                        break;
                    }
                    if (chars.length % 2 != 0) {
                        if (i == (chars.length - 1) / 2) {
                            return;
                        }
                    } else {
                        if (i == chars.length / 2 - 1) {
                            return;
                        }
                    }
                }
            }
        }
    }
}

import java.util.Arrays;

public class Practice189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        //把除了后k位的前面的元素拷出来。
        int[] temp = Arrays.copyOfRange(nums, 0, n-k);
        //把长度为k的后几位移到前面。
        System.arraycopy(nums, n-k, nums, 0, k);
        //再把前面的元素移到后面去
        System.arraycopy(temp, 0, nums, k, n-k);
    }
}


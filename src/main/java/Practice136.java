public class Practice136 {
    public static void main(String[] args) {
        Practice136 practice136 = new Practice136();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(practice136.singleNumber(nums));
    }

    //任何一个数字异或0，得到自身。
    //任何数字异或自身，得到0。
    //抑或运算：两个数字都转换为二进制，从高位开始比较，相同则当前位置变为0，不同则当前位置变为1。

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}

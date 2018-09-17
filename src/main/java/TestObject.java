public class TestObject extends Object {
    public static void main(String[] args) {
        TestObject to1;
        TestObject to2;
        final TestObject testObject = new TestObject();
        to1 = testObject;
        to2 = testObject;
        System.out.println(to1 == to2);
    }
}

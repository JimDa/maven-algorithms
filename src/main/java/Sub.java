public class Sub extends Super {
    public int field = 1;
    public int xxx = 2;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

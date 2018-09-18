public class Student {

    private int age;
    private String name;

    public Student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    //要显示Student类的信息，必须重写toString 方法
    @Override
    public String toString(){
        return   "age :"+age+"  name:"+name;
    }

    @Override
    public int hashCode()
    {
        return age*name.hashCode();
    }
    public boolean equals(Object o){
        Student s = (Student) o;
        return age == s.age && name.equalsIgnoreCase(s.name);
    }
}

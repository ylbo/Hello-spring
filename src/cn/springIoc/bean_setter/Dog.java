package cn.springIoc.bean_setter;

public class Dog {
    private String ss;

    public Dog(String ss) {
        this.ss = ss;
    }

    @Override
    public String toString() {
        return "Lazy{" +
                "ss='" + ss + '\'' +
                '}';
    }
}

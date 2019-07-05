package ZhouCe2;

public class DiSiTi {
    public static void main(String[] args) {
        DiSiTi hello = new DiSiTi();
        print1();
        print2("name");
        print3(15);
    }

    public static void print1() {
        System.out.println("无参的print方法");
    }

    public static void print2(String name) {
        System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
    }

    public static void print3(int age) {
        System.out.println("带有一个整型参数的print方法，参数值为：" + age);
    }


}

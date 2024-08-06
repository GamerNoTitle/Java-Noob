public class Homework02 {
    public static void main(String[] args) {
        // Question 1
        System.out.println("姓名\t年龄\t性别\t电话");
        ZhangSan(args);
        Lisi(args);

        // Question 2
        int a = 100, b = 200;
        int c = a;
        a = b;
        b = c;
        System.out.println(sum(a, b));
    }

    public static void ZhangSan(String[] args) {
        String name = "张三";
        int age = 20;
        char gender = '男';
        String tel = "12345457585";
        System.out.println(name + "\t" + age + "\t" + gender + "\t" + tel);
    }

    public static void Lisi(String[] args) {
        String name = "李四";
        int age = 30;
        char gender = '女';
        String tel = "15622525855";
        System.out.println(name + "\t" + age + "\t" + gender + "\t" + tel);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}



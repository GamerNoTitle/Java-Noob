public class IntTypeConvert {
    public static void main(String[] args) {
        // 整数型字面量（如下面的100）默认当做int类型处理
        // int类型赋值，Java先自动赋予一块空间放入我们的目标数字
        // 然后再把目标数字放入我们的变量中
        int a = 100;

        // 但如果左边的变量类型不是int，而是其他的（例如double）
        // 此时就存在一个变量类型转换（自动的）
        // Java中允许小容量的数据赋值给大容量的变量
        // byte(1B) < short(2B) < int(4B) < long(8B) < float(4B) < double(8B)
        double b = 200;

        System.out.println(a);
        System.out.println(b);

        // 若在整数型字面量后面加上l或者L，就会被当做long类型处理
        long c = 300L;
        System.out.println(c);

        // 当右边的数字超过了int类型的范围，但是又没有L的时候会报错
        long d = 2147483648L;    // int最大为2147483647
    }
}

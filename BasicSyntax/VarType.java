public class VarType {
    int instanceVar = 100;  // 实例变量
    static int staticVar = 200;     // 静态变量

    public void printInstanceVar() {
        System.out.println("instanceVar: " + instanceVar);
    }

    public static void main(String[] args) {
        int localVar = 300;     // 局部变量
        System.out.println("localVar: " + localVar);
        System.out.println("staticVar: " + staticVar);
        new VarType().printInstanceVar();   // 创建VarType实例来调用非静态方法
    }

}

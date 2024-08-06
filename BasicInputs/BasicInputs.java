public class BasicInputs {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        // 接收第一个空格之前的内容
        String string = scanner.next();
        System.out.println("你输入的内容是：" + string);
        // 接受第一个回车之前的内容
        scanner.nextLine(); // 读取掉上一个next给缓存里留下的\r，使得写一个nextLine可以正确读取
        String line = scanner.nextLine();
        System.out.println("你输入的内容是：" + line);
        // 接受int类型数字（回车结束）
        int number = scanner.nextInt();
        System.out.println("你输入的数字是：" + number);
        // 接受double类型数字（回车结束）
        double doubleNumber = scanner.nextDouble();
        System.out.println("你输入的数字是：" + doubleNumber);
    }
}

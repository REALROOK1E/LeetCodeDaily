package 左神.ContributionBooster;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * FileProcessor - Java小功能程序
 * 生成时间: 2025-07-03
 * 功能描述: 实现一个Java的小功能的程序
 */
public class FileProcessor {

    private static final Random random = new Random();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("=== FileProcessor 功能演示 ===");

        // 演示各种小功能
        demonstrateStringOperations();
        demonstrateArrayOperations();
        demonstrateMathOperations();
        demonstrateDateOperations();
        demonstrateFileOperations();

        System.out.println("=== 功能演示完成 ===");
    }

    /**
     * 字符串操作演示
     */
    private static void demonstrateStringOperations() {
        System.out.println("\n1. 字符串操作演示:");

        String text = "Hello World Java Programming";
        System.out.println("原始字符串: " + text);
        System.out.println("转大写: " + text.toUpperCase());
        System.out.println("转小写: " + text.toLowerCase());
        System.out.println("单词数量: " + text.split(" ").length);
        System.out.println("反转字符串: " + new StringBuilder(text).reverse());
    }

    /**
     * 数组操作演示
     */
    private static void demonstrateArrayOperations() {
        System.out.println("\n2. 数组操作演示:");

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("原始数组: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("排序后: " + Arrays.toString(numbers));
        System.out.println("最大值: " + numbers[numbers.length - 1]);
        System.out.println("最小值: " + numbers[0]);
        System.out.println("平均值: " + Arrays.stream(numbers).average().orElse(0));
    }

    /**
     * 数学运算演示
     */
    private static void demonstrateMathOperations() {
        System.out.println("\n3. 数学运算演示:");

        double a = random.nextDouble() * 100;
        double b = random.nextDouble() * 100;

        System.out.println("a = " + String.format("%.2f", a));
        System.out.println("b = " + String.format("%.2f", b));
        System.out.println("a + b = " + String.format("%.2f", a + b));
        System.out.println("a - b = " + String.format("%.2f", a - b));
        System.out.println("a * b = " + String.format("%.2f", a * b));
        System.out.println("a / b = " + String.format("%.2f", a / b));
        System.out.println("a的平方根 = " + String.format("%.2f", Math.sqrt(a)));
        System.out.println("a的幂次 = " + String.format("%.2f", Math.pow(a, 2)));
    }

    /**
     * 日期时间操作演示
     */
    private static void demonstrateDateOperations() {
        System.out.println("\n4. 日期时间操作演示:");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("当前时间: " + now.format(formatter));
        System.out.println("年份: " + now.getYear());
        System.out.println("月份: " + now.getMonth());
        System.out.println("日期: " + now.getDayOfMonth());
        System.out.println("小时: " + now.getHour());
        System.out.println("分钟: " + now.getMinute());

        LocalDateTime future = now.plusDays(7);
        System.out.println("一周后: " + future.format(formatter));
    }

    /**
     * 文件操作演示
     */
    private static void demonstrateFileOperations() {
        System.out.println("\n5. 文件操作演示:");

        String fileName = "demo_" + System.currentTimeMillis() + ".txt";
        try {
            // 创建文件
            FileWriter writer = new FileWriter(fileName);
            writer.write("这是一个演示文件\n");
            writer.write("生成时间: " + LocalDateTime.now().format(formatter) + "\n");
            writer.write("随机数据: " + random.nextInt(1000) + "\n");
            writer.close();

            System.out.println("创建文件: " + fileName);

            // 读取文件
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("文件内容:");
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
            reader.close();

            // 删除文件
            new File(fileName).delete();
            System.out.println("删除文件: " + fileName);

        } catch (IOException e) {
            System.err.println("文件操作失败: " + e.getMessage());
        }
    }

    /**
     * 工具方法：生成随机字符串
     */
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    /**
     * 工具方法：检查是否为质数
     */
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number <= 3) return true;
        if (number % 2 == 0 || number % 3 == 0) return false;

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) return false;
        }
        return true;
    }
}

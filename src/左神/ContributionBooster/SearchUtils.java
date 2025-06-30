package 左神.ContributionBooster;

import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Calculator - JavaС���ܳ���
 * ����ʱ��: 2025-06-29
 * ��������: ʵ��һ��Java��С���ܵĳ���
 */
public class Calculator {

    private static final Random random = new Random();
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        System.out.println("=== Calculator ������ʾ ===");

        // ��ʾ����С����
        demonstrateStringOperations();
        demonstrateArrayOperations();
        demonstrateMathOperations();
        demonstrateDateOperations();
        demonstrateFileOperations();

        System.out.println("=== ������ʾ��� ===");
    }

    /**
     * �ַ���������ʾ
     */
    private static void demonstrateStringOperations() {
        System.out.println("\n1. �ַ���������ʾ:");

        String text = "Hello World Java Programming";
        System.out.println("ԭʼ�ַ���: " + text);
        System.out.println("ת��д: " + text.toUpperCase());
        System.out.println("תСд: " + text.toLowerCase());
        System.out.println("��������: " + text.split(" ").length);
        System.out.println("��ת�ַ���: " + new StringBuilder(text).reverse());
    }

    /**
     * ���������ʾ
     */
    private static void demonstrateArrayOperations() {
        System.out.println("\n2. ���������ʾ:");

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println("ԭʼ����: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("�����: " + Arrays.toString(numbers));
        System.out.println("���ֵ: " + numbers[numbers.length - 1]);
        System.out.println("��Сֵ: " + numbers[0]);
        System.out.println("ƽ��ֵ: " + Arrays.stream(numbers).average().orElse(0));
    }

    /**
     * ��ѧ������ʾ
     */
    private static void demonstrateMathOperations() {
        System.out.println("\n3. ��ѧ������ʾ:");

        double a = random.nextDouble() * 100;
        double b = random.nextDouble() * 100;

        System.out.println("a = " + String.format("%.2f", a));
        System.out.println("b = " + String.format("%.2f", b));
        System.out.println("a + b = " + String.format("%.2f", a + b));
        System.out.println("a - b = " + String.format("%.2f", a - b));
        System.out.println("a * b = " + String.format("%.2f", a * b));
        System.out.println("a / b = " + String.format("%.2f", a / b));
        System.out.println("a��ƽ���� = " + String.format("%.2f", Math.sqrt(a)));
        System.out.println("a���ݴ� = " + String.format("%.2f", Math.pow(a, 2)));
    }

    /**
     * ����ʱ�������ʾ
     */
    private static void demonstrateDateOperations() {
        System.out.println("\n4. ����ʱ�������ʾ:");

        LocalDateTime now = LocalDateTime.now();
        System.out.println("��ǰʱ��: " + now.format(formatter));
        System.out.println("���: " + now.getYear());
        System.out.println("�·�: " + now.getMonth());
        System.out.println("����: " + now.getDayOfMonth());
        System.out.println("Сʱ: " + now.getHour());
        System.out.println("����: " + now.getMinute());

        LocalDateTime future = now.plusDays(7);
        System.out.println("һ�ܺ�: " + future.format(formatter));
    }

    /**
     * �ļ�������ʾ
     */
    private static void demonstrateFileOperations() {
        System.out.println("\n5. �ļ�������ʾ:");

        String fileName = "demo_" + System.currentTimeMillis() + ".txt";
        try {
            // �����ļ�
            FileWriter writer = new FileWriter(fileName);
            writer.write("����һ����ʾ�ļ�\n");
            writer.write("����ʱ��: " + LocalDateTime.now().format(formatter) + "\n");
            writer.write("�������: " + random.nextInt(1000) + "\n");
            writer.close();

            System.out.println("�����ļ�: " + fileName);

            // ��ȡ�ļ�
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("�ļ�����:");
            while ((line = reader.readLine()) != null) {
                System.out.println("  " + line);
            }
            reader.close();

            // ɾ���ļ�
            new File(fileName).delete();
            System.out.println("ɾ���ļ�: " + fileName);

        } catch (IOException e) {
            System.err.println("�ļ�����ʧ��: " + e.getMessage());
        }
    }

    /**
     * ���߷�������������ַ���
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
     * ���߷���������Ƿ�Ϊ����
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

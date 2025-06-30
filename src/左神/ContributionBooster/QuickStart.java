package 左神.ContributionBooster;

import java.util.Scanner;

/**
 * 快速启动器
 * 提供菜单选择不同的功能
 */
public class QuickStart {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== 快速启动器 ===");
            System.out.println("1. 一键生成代码并提交 (单次)");
            System.out.println("2. 批量生成代码并提交 (多次)");
            System.out.println("3. 运行AI代码分析器");
            System.out.println("4. 运行自动提交程序");
            System.out.println("5. 运行批量执行程序");
            System.out.println("0. 退出");
            System.out.print("请选择功能 (0-5): ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    System.out.println("\n执行一键生成代码并提交...");
                    OneClickCommit.main(new String[]{});
                    break;
                    
                case "2":
                    System.out.print("请输入批量执行次数: ");
                    try {
                        int count = Integer.parseInt(scanner.nextLine().trim());
                        if (count > 0 && count <= 100) {
                            System.out.println("\n执行批量生成代码并提交...");
                            OneClickCommit.batchOneClickCommit(count);
                        } else {
                            System.out.println("次数必须在1-100之间");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("请输入有效的数字");
                    }
                    break;
                    
                case "3":
                    System.out.println("\n运行AI代码分析器...");
                    AICodeAnalyzer.main(new String[]{});
                    break;
                    
                case "4":
                    System.out.println("\n运行自动提交程序...");
                    AutoCommit.main(new String[]{});
                    break;
                    
                case "5":
                    System.out.println("\n运行批量执行程序...");
                    BatchExecutor.main(new String[]{});
                    break;
                    
                case "0":
                    System.out.println("退出程序");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("无效选择，请重新输入");
                    break;
            }
            
            System.out.println("\n按回车键继续...");
            scanner.nextLine();
        }
    }
} 
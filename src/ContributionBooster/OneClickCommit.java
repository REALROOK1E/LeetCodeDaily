package ContributionBooster;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 真正的一键提交程序
 * 自动执行Git命令完成提交
 */
public class OneClickCommit {
    
    private static final Random random = new Random();
    
    public static void main(String[] args) {
        System.out.println("=== 一键自动提交程序 ===");
        
        // 自动执行10次
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("\n--- 第 " + (i + 1) + " 次执行 ---");
                
                // 1. 运行AutoCommit生成内容
                System.out.println("1. 生成代码和文件...");
                AutoCommit.main(args);
                
                // 2. 执行Git命令
                System.out.println("\n2. 执行Git提交...");
                executeGitCommands();
                
                System.out.println("第 " + (i + 1) + " 次执行完成！");
                
                // 等待2秒再执行下一次
                if (i < 9) { // 最后一次不需要等待
                    System.out.println("等待2秒后执行下一次...");
                    Thread.sleep(2000);
                }
                
            } catch (Exception e) {
                System.err.println("第 " + (i + 1) + " 次执行失败: " + e.getMessage());
                e.printStackTrace();
            }
        }
        
        System.out.println("\n=== 10次自动执行完成！===");
    }
    
    private static void executeGitCommands() throws Exception {
        // 检查Git是否安装
        if (!isGitInstalled()) {
            System.err.println("错误: Git未安装或不在PATH中");
            return;
        }
        
        // 检查是否在Git仓库中
        if (!isGitRepository()) {
            System.err.println("错误: 当前目录不是Git仓库");
            return;
        }
        
        // 执行Git命令
        String commitMessage = generateCommitMessage();
        
        System.out.println("   执行: git add .");
        executeCommand("git add .");
        
        System.out.println("   执行: git commit -m \"" + commitMessage + "\"");
        executeCommand("git commit -m \"" + commitMessage + "\"");
        
        System.out.println("   执行: git push");
        executeCommand("git push");
        
        System.out.println("   Git操作完成！");
    }
    
    private static boolean isGitInstalled() {
        try {
            Process process = Runtime.getRuntime().exec("git --version");
            return process.waitFor() == 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    private static boolean isGitRepository() {
        try {
            Process process = Runtime.getRuntime().exec("git status");
            return process.waitFor() == 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    private static void executeCommand(String command) throws Exception {
        Process process = Runtime.getRuntime().exec(command);
        
        // 读取输出
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("   " + line);
        }
        
        // 读取错误输出
        BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        while ((line = errorReader.readLine()) != null) {
            System.err.println("   错误: " + line);
        }
        
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new Exception("命令执行失败，退出码: " + exitCode);
        }
    }
    
    private static String generateCommitMessage() {
        String[] messages = {
            "feat: 自动更新 - 添加新功能",
            "fix: 自动更新 - 修复问题", 
            "docs: 自动更新 - 更新文档",
            "style: 自动更新 - 代码格式调整",
            "refactor: 自动更新 - 重构代码",
            "test: 自动更新 - 添加测试",
            "chore: 自动更新 - 日常维护",
            "perf: 自动更新 - 性能优化"
        };
        
        String baseMessage = messages[random.nextInt(messages.length)];
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        return baseMessage + " - " + timestamp + " #" + random.nextInt(1000);
    }
    
    /**
     * 批量一键提交
     */
    public static void batchOneClickCommit(int count) {
        System.out.println("=== 批量一键提交 " + count + " 次 ===");
        
        for (int i = 0; i < count; i++) {
            try {
                System.out.println("\n--- 第 " + (i + 1) + " 次一键提交 ---");
                main(new String[]{});
                
                // 等待2秒
                Thread.sleep(2000);
                
            } catch (Exception e) {
                System.err.println("第 " + (i + 1) + " 次提交失败: " + e.getMessage());
            }
        }
        
        System.out.println("\n=== 批量一键提交完成 ===");
    }
    
    /**
     * 检查Git状态
     */
    public static void checkGitStatus() {
        System.out.println("=== 检查Git状态 ===");
        
        try {
            if (!isGitInstalled()) {
                System.out.println("❌ Git未安装");
                return;
            }
            System.out.println("✅ Git已安装");
            
            if (!isGitRepository()) {
                System.out.println("❌ 当前目录不是Git仓库");
                return;
            }
            System.out.println("✅ 当前目录是Git仓库");
            
            // 检查远程仓库
            Process process = Runtime.getRuntime().exec("git remote -v");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("📡 远程仓库: " + line);
            }
            
        } catch (Exception e) {
            System.err.println("检查Git状态失败: " + e.getMessage());
        }
    }
} 
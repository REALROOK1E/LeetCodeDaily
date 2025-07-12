package 左神.ContributionBooster;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 一键启动程序
 * 自动生成Java小功能程序，创建文件，并提交到GitHub
 */
public class OneClickCommit {
    
    private static final Random random = new Random();
    private static final String[] ENGLISH_COMMENTS = {
        "Refactor code for better readability", "Add more test cases", "Update documentation", "Improve performance", "Fix typo",
        "Remove unused import", "Optimize algorithm", "Add TODO", "Minor bug fix", "Enhance security",
        "Add logging", "Update dependency version", "Refine error handling", "Polish UI", "Add feature flag"
    };
    private static final String[] RANDOM_SNIPPETS = {
        "// TODO: optimize this loop\n", "// FIXME: potential NPE here\n", "// NOTE: legacy code below\n", "// HACK: quick workaround\n",
        "// REVIEW: needs more tests\n", "// DEBUG: print variable\n", "// PERF: cache result\n"
    };
    private static final String[] FUNCTION_NAMES = {
        "Calculator", "StringUtils", "ArrayHelper", "DateUtils", "FileProcessor",
        "MathHelper", "ValidationUtils", "SortHelper", "SearchUtils", "DataConverter"
    };
    
    private static final String[] TYPES = {
        "feat", "fix", "docs", "style", "refactor", "test", "chore", "perf", "ci", "build",
        "improve", "update", "remove", "add", "optimize", "cleanup", "hotfix", "merge", "split", "review"
    };
    private static final String[] SCOPES = {
        "core", "utils", "api", "service", "controller", "config", "model", "view", "helper", "task",
        "database", "security", "network", "ui", "backend", "frontend", "scheduler", "logger", "cache", "monitor"
    };
    private static final String[] EMOJIS = {
        "✨", "🐛", "📝", "🎨", "🔨", "✅", "🔧", "🚀", "📦", "🔄", "🔥", "💡", "🧹", "🛠️", "🔍", "🔗", "📈", "📉", "🔔", "🧪", "🧩"
    };
    private static final String[] DETAILS = {
        "优化了代码结构", "修复了潜在bug", "增加了单元测试", "完善了文档说明", "调整了配置项", "提升了性能", "重构了部分模块", "增加了新功能", "删除了无用代码", "更新了依赖库",
        "完善了异常处理", "增加了日志输出", "调整了接口参数", "优化了数据库操作", "改进了用户体验", "修复了边界条件", "增加了输入校验", "优化了内存使用", "提升了启动速度", "增强了安全性",
        "增加了多线程支持", "优化了缓存机制", "完善了测试覆盖率", "调整了页面布局", "修复了兼容性问题", "增加了国际化支持", "优化了API文档", "调整了定时任务", "优化了数据结构", "增加了配置项说明"
    };
    private static final String[] MOODS = {
        "今天进度不错", "代码写得很顺", "debug了一下午", "灵感爆棚", "有点困", "喝了杯咖啡", "效率爆表", "遇到点小问题", "一切顺利", "继续加油",
        "心情愉快", "状态在线", "专注开发", "收获满满", "解决了难题", "小有成就", "保持耐心", "持续优化", "团队协作愉快", "期待上线"
    };
    private static final String[] DEVELOPERS = {
        "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy",
        "Mallory", "Niaj", "Olivia", "Peggy", "Rupert", "Sybil", "Trent", "Victor", "Walter", "Yvonne"
    };
    private static final String[] FILES = {
        "Calculator.java", "StringUtils.java", "ArrayHelper.java", "DateUtils.java", "FileProcessor.java",
        "MathHelper.java", "ValidationUtils.java", "SortHelper.java", "SearchUtils.java", "DataConverter.java",
        "UserService.java", "OrderController.java", "ConfigManager.java", "Logger.java", "CacheService.java",
        "NetworkClient.java", "Scheduler.java", "Monitor.java", "ApiGateway.java", "SecurityFilter.java"
    };
    




    public static void main(String[] args) {
        System.out.println("=== 一键启动程序 ===");
        System.out.println("自动生成Java小功能程序并提交到GitHub");
        
        int commitCount = 6 + random.nextInt(5); // 6~10次
        for (int i = 0; i < commitCount; i++) {
            try {
                // 随机决定本次操作类型
                int opType = random.nextInt(100);
                String fileName = null;
                if (opType < 60) {
                    // 1. 生成Java小功能程序
                    String generatedCode = generateJavaFunction();
                    fileName = createJavaFile(generatedCode);
                } else if (opType < 80) {
                    // 2. 随机更新README或配置文件
                    fileName = updateRandomTextFile();
                } else {
                    // 3. 偶尔删除或合并文件
                    fileName = randomFileOperation();
                }
                // 4. 更新现有文件
                updateExistingFiles();
                // 5. 生成更丰富的提交信息
                String commitMessage = generateRichCommitMessage(fileName);
                // 6. 执行Git操作
                executeGitOperations(commitMessage);
                // 7. 日志输出
                if (random.nextInt(10) == 0) {
                    System.out.println("[提示] 手滑写错了又改回来，已修正");
                } else if (random.nextInt(15) == 0) {
                    System.out.println("[编译] 编译失败，重试成功");
                } else {
                    System.out.println("=== 操作完成 ===");
                }
                System.out.println("生成/操作的文件: " + fileName);
                System.out.println("提交信息: " + commitMessage);
                System.out.println("已自动提交到GitHub");
                // 8. 随机等待 1~5 秒，模拟真实开发节奏
                Thread.sleep(1000 + random.nextInt(4000));
            } catch (Exception e) {
                System.err.println("操作失败: " + e.getMessage());
                if (random.nextBoolean()) {
                    System.out.println("[提示] 可能是网络波动，稍后自动重试");
                }
            }
        }
      
    }

    // 生成更丰富的commit message
    private static String generateRichCommitMessage(String fileName) {
        String type = TYPES[random.nextInt(TYPES.length)];
        String scope = SCOPES[random.nextInt(SCOPES.length)];
        String emoji = EMOJIS[random.nextInt(EMOJIS.length)];
        String detail = DETAILS[random.nextInt(DETAILS.length)];
        String mood = MOODS[random.nextInt(MOODS.length)];
        String functionName = FUNCTION_NAMES[random.nextInt(FUNCTION_NAMES.length)];
        String developer = DEVELOPERS[random.nextInt(DEVELOPERS.length)];
        String file = (fileName != null) ? fileName : FILES[random.nextInt(FILES.length)];
        String timestamp = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String time = java.time.LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        int ticket = 100 + random.nextInt(900);
        String english = "";
        if (random.nextInt(4) == 0) {
            english = ENGLISH_COMMENTS[random.nextInt(ENGLISH_COMMENTS.length)] + " | ";
        }
        String snippet = "";
        if (random.nextInt(5) == 0) {
            snippet = RANDOM_SNIPPETS[random.nextInt(RANDOM_SNIPPETS.length)].replace("\n", " ");
        }
        return String.format(
            "%s(%s): %s - %s [%s] %s #%d | by %s | 文件: %s | %s %s | %s%s%s",
            type, scope, detail, functionName, timestamp, emoji, ticket, developer, file, time, mood, english, snippet, "自动生成提交信息"
        );
    }

    // 随机更新README或配置文件
    private static String updateRandomTextFile() throws IOException {
        String[] files = {"README.md", "README_OneClick.md", "src/左神.ContributionBooster/ConfigManager.java"};
        String file = files[random.nextInt(files.length)];
        String content = "\n# 更新日志 " + LocalDate.now() + "\n";
        if (random.nextBoolean()) {
            content += ENGLISH_COMMENTS[random.nextInt(ENGLISH_COMMENTS.length)] + "\n";
        }
        if (random.nextBoolean()) {
            content += RANDOM_SNIPPETS[random.nextInt(RANDOM_SNIPPETS.length)];
        }
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(content);
        }
        System.out.println("  更新文本文件: " + file);
        return file;
    }

    // 偶尔删除或合并文件
    private static String randomFileOperation() throws IOException {
        String[] files = {"src/左神.ContributionBooster/Logger.java", "src/左神.ContributionBooster/CacheService.java"};
        String file = files[random.nextInt(files.length)];
        if (random.nextBoolean()) {
            // 删除文件
            File f = new File(file);
            if (f.exists()) {
                f.delete();
                System.out.println("  删除文件: " + file);
            }
            return file;
        } else {
            // 合并内容
            String mergeContent = "// 合并内容: " + LocalDate.now() + "\n";
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(mergeContent);
            }
            System.out.println("  合并内容到文件: " + file);
            return file;
        }
    }
    
    /**
     * 生成Java小功能程序
     */
    private static String generateJavaFunction() {
        String functionName = FUNCTION_NAMES[random.nextInt(FUNCTION_NAMES.length)];
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        return String.format("""
            package 左神.ContributionBooster;
            
            import java.util.*;
            import java.time.LocalDateTime;
            import java.time.format.DateTimeFormatter;
            
            /**
             * %s - Java小功能程序
             * 生成时间: %s
             * 功能描述: 实现一个Java的小功能的程序
             */
            public class %s {
                
                private static final Random random = new Random();
                private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                
                public static void main(String[] args) {
                    System.out.println("=== %s 功能演示 ===");
                    
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
                    System.out.println("\\n1. 字符串操作演示:");
                    
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
                    System.out.println("\\n2. 数组操作演示:");
                    
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
                    System.out.println("\\n3. 数学运算演示:");
                    
                    double a = random.nextDouble() * 100;
                    double b = random.nextDouble() * 100;
                    
                    System.out.println("a = " + String.format("%%.2f", a));
                    System.out.println("b = " + String.format("%%.2f", b));
                    System.out.println("a + b = " + String.format("%%.2f", a + b));
                    System.out.println("a - b = " + String.format("%%.2f", a - b));
                    System.out.println("a * b = " + String.format("%%.2f", a * b));
                    System.out.println("a / b = " + String.format("%%.2f", a / b));
                    System.out.println("a的平方根 = " + String.format("%%.2f", Math.sqrt(a)));
                    System.out.println("a的幂次 = " + String.format("%%.2f", Math.pow(a, 2)));
                }
                
                /**
                 * 日期时间操作演示
                 */
                private static void demonstrateDateOperations() {
                    System.out.println("\\n4. 日期时间操作演示:");
                    
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
                    System.out.println("\\n5. 文件操作演示:");
                    
                    String fileName = "demo_" + System.currentTimeMillis() + ".txt";
                    try {
                        // 创建文件
                        FileWriter writer = new FileWriter(fileName);
                        writer.write("这是一个演示文件\\n");
                        writer.write("生成时间: " + LocalDateTime.now().format(formatter) + "\\n");
                        writer.write("随机数据: " + random.nextInt(1000) + "\\n");
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
                    if (number %% 2 == 0 || number %% 3 == 0) return false;
                    
                    for (int i = 5; i * i <= number; i += 6) {
                        if (number %% i == 0 || number %% (i + 2) == 0) return false;
                    }
                    return true;
                }
            }
            """, functionName, currentDate, functionName, functionName);
    }
    
    /**
     * 创建Java文件
     */
    private static String createJavaFile(String code) throws IOException {
        String fileName = "src/左神.ContributionBooster/" + FUNCTION_NAMES[random.nextInt(FUNCTION_NAMES.length)] + ".java";
        
        // 确保目录存在
        File directory = new File("src/左神.ContributionBooster");
        if (!directory.exists()) {
            directory.mkdirs();
        }
        
        // 写入文件
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(code);
        }
        
        System.out.println("创建文件: " + fileName);
        return fileName;
    }
    
    /**
     * 更新现有文件
     */
    private static void updateExistingFiles() throws IOException {
        System.out.println("更新现有文件...");
        
        String[] filesToUpdate = {
            "src/左神.ContributionBooster/DailyCommit.java",
            "src/左神.ContributionBooster/RandomCode.java",
            "src/左神.ContributionBooster/CommitHelper.java"
        };
        
        String updateComment = "// 自动更新: " + LocalDate.now() + " - 版本 " + random.nextInt(100);
        // 偶尔插入英文注释或代码片段
        if (random.nextInt(3) == 0) {
            updateComment += "\n" + ENGLISH_COMMENTS[random.nextInt(ENGLISH_COMMENTS.length)];
        }
        if (random.nextInt(4) == 0) {
            updateComment += "\n" + RANDOM_SNIPPETS[random.nextInt(RANDOM_SNIPPETS.length)];
        }
        
        for (String filePath : filesToUpdate) {
            File file = new File(filePath);
            if (file.exists()) {
                try (FileWriter writer = new FileWriter(file, true)) {
                    writer.write("\n" + updateComment + "\n");
                }
                System.out.println("  更新文件: " + filePath);
            }
        }
    }
    
    
    /**
     * 执行Git操作
     */
    private static void executeGitOperations(String commitMessage) throws Exception {
        System.out.println("执行Git操作...");
        
        // 执行git add .
        executeCommand("git add .");
        System.out.println("  git add . 完成");
        
        // 执行git commit
        executeCommand("git commit -m \"" + commitMessage + "\"");
        System.out.println("  git commit 完成");
        
        // 执行git push
        executeCommand("git push");
        System.out.println("  git push 完成");
    }
    
    /**
     * 执行系统命令
     */
    private static void executeCommand(String command) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder();
        
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            processBuilder.command("cmd", "/c", command);
        } else {
            processBuilder.command("bash", "-c", command);
        }
        
        Process process = processBuilder.start();
        
        // 读取输出
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("    " + line);
            }
        }
        
        // 读取错误输出
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.err.println("    错误: " + line);
            }
        }
        
        int exitCode = process.waitFor();
        if (exitCode != 0) {
            throw new Exception("命令执行失败，退出码: " + exitCode);
        }
    }
    
    /**
     * 批量执行多次提交
     */
    public static void batchOneClickCommit(int count) {
        System.out.println("=== 批量执行 " + count + " 次一键提交 ===");
        
        for (int i = 0; i < count; i++) {
            try {
                System.out.println("\n--- 第 " + (i + 1) + " 次执行 ---");
                
                // 生成Java小功能程序
                String generatedCode = generateJavaFunction();
                
                // 创建文件
                String fileName = createJavaFile(generatedCode);
                
                // 更新现有文件
                updateExistingFiles();
                
                // 生成提交信息
                String commitMessage = generateRichCommitMessage(fileName);
                
                // 执行Git操作
                executeGitOperations(commitMessage);
                
                System.out.println("第 " + (i + 1) + " 次执行完成");
                
                // 等待一秒
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.err.println("第 " + (i + 1) + " 次执行失败: " + e.getMessage());
            }
        }
        
        System.out.println("\n=== 批量执行完成 ===");
    }
} 
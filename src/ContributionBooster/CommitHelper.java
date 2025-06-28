package ContributionBooster;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * 提交辅助工具
 * 帮助生成提交信息和批量提交
 */
public class CommitHelper {
    
    private static final String[] COMMIT_TYPES = {
        "feat", "fix", "docs", "style", "refactor", "test", "chore", "perf", "ci", "build"
    };
    
    private static final String[] COMMIT_SCOPES = {
        "core", "api", "ui", "db", "auth", "utils", "config", "test", "docs", "deploy"
    };
    
    private static final String[] COMMIT_DESCRIPTIONS = {
        "添加新功能", "修复bug", "更新文档", "代码重构", "性能优化", 
        "添加测试", "配置更新", "代码清理", "功能增强", "问题修复"
    };
    
    public static void main(String[] args) {
        System.out.println("=== 提交辅助工具 ===");
        
        // 生成多个提交信息
        for (int i = 0; i < 5; i++) {
            String commitMessage = generateCommitMessage();
            System.out.println("提交 " + (i + 1) + ": " + commitMessage);
        }
        
        // 生成今日更新
        generateTodayUpdate();
        
        System.out.println("=== 工具使用完成 ===");
    }
    
    public static String generateCommitMessage() {
        Random random = new Random();
        String type = COMMIT_TYPES[random.nextInt(COMMIT_TYPES.length)];
        String scope = COMMIT_SCOPES[random.nextInt(COMMIT_SCOPES.length)];
        String description = COMMIT_DESCRIPTIONS[random.nextInt(COMMIT_DESCRIPTIONS.length)];
        
        return type + "(" + scope + "): " + description;
    }
    
    private static void generateTodayUpdate() {
        LocalDate today = LocalDate.now();
        String dateStr = today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        System.out.println("\n=== 今日更新 (" + dateStr + ") ===");
        System.out.println("1. 代码优化和重构");
        System.out.println("2. 添加新的工具类");
        System.out.println("3. 更新项目文档");
        System.out.println("4. 修复已知问题");
        System.out.println("5. 性能提升");
    }
    
    public static void generateMultipleCommits(int count) {
        System.out.println("生成 " + count + " 个提交信息:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + generateCommitMessage());
        }
    }
    
    public static String getRandomCodeSnippet() {
        String[] snippets = {
            "// 今日更新",
            "// 代码优化",
            "// 功能增强",
            "// 问题修复",
            "// 性能提升",
            "// 代码重构",
            "// 添加注释",
            "// 更新配置",
            "// 测试用例",
            "// 文档更新"
        };
        
        Random random = new Random();
        return snippets[random.nextInt(snippets.length)];
    }
} 
// �Զ�����: 2025-06-28 - ��ǿ 15

// �Զ�����: 2025-06-28 - ��ǿ 12

// �Զ�����: 2025-06-28 - ��ǿ 28

// �Զ�����: 2025-06-28 - ��ǿ 25

// �Զ�����: 2025-06-28 - ��ǿ 28

// �Զ�����: 2025-06-28 - ��ǿ 24

// �Զ�����: 2025-06-28 - ��ǿ 5

// �Զ�����: 2025-06-28 - ��ǿ 23

// �Զ�����: 2025-06-28 - ��ǿ 23

// �Զ�����: 2025-06-28 - ��ǿ 27

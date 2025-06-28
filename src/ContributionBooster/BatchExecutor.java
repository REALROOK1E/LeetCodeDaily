package ContributionBooster;

/**
 * 批量执行程序
 * 自动执行多次提交
 */
public class BatchExecutor {
    
    public static void main(String[] args) {
        System.out.println("=== 批量执行程序 ===");
        
        // 执行10次
        OneClickCommit.batchOneClickCommit(10);
        
        // 或者你也可以手动指定次数
        // OneClickCommit.batchOneClickCommit(5); // 执行5次
        // OneClickCommit.batchOneClickCommit(20); // 执行20次
    }
} 
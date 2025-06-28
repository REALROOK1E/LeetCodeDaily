package ContributionBooster;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * æäº¤è¾…åŠ©å·¥å…·
 * å¸®åŠ©ç”Ÿæˆæäº¤ä¿¡æ¯å’Œæ‰¹é‡æäº¤
 */
public class CommitHelper {
    
    private static final String[] COMMIT_TYPES = {
        "feat", "fix", "docs", "style", "refactor", "test", "chore", "perf", "ci", "build"
    };
    
    private static final String[] COMMIT_SCOPES = {
        "core", "api", "ui", "db", "auth", "utils", "config", "test", "docs", "deploy"
    };
    
    private static final String[] COMMIT_DESCRIPTIONS = {
        "æ·»åŠ æ–°åŠŸèƒ½", "ä¿®å¤bug", "æ›´æ–°æ–‡æ¡£", "ä»£ç é‡æ„", "æ€§èƒ½ä¼˜åŒ–", 
        "æ·»åŠ æµ‹è¯•", "é…ç½®æ›´æ–°", "ä»£ç æ¸…ç†", "åŠŸèƒ½å¢å¼º", "é—®é¢˜ä¿®å¤"
    };
    
    public static void main(String[] args) {
        System.out.println("=== æäº¤è¾…åŠ©å·¥å…· ===");
        
        // ç”Ÿæˆå¤šä¸ªæäº¤ä¿¡æ¯
        for (int i = 0; i < 5; i++) {
            String commitMessage = generateCommitMessage();
            System.out.println("æäº¤ " + (i + 1) + ": " + commitMessage);
        }
        
        // ç”Ÿæˆä»Šæ—¥æ›´æ–°
        generateTodayUpdate();
        
        System.out.println("=== å·¥å…·ä½¿ç”¨å®Œæˆ ===");
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
        
        System.out.println("\n=== ä»Šæ—¥æ›´æ–° (" + dateStr + ") ===");
        System.out.println("1. ä»£ç ä¼˜åŒ–å’Œé‡æ„");
        System.out.println("2. æ·»åŠ æ–°çš„å·¥å…·ç±»");
        System.out.println("3. æ›´æ–°é¡¹ç›®æ–‡æ¡£");
        System.out.println("4. ä¿®å¤å·²çŸ¥é—®é¢˜");
        System.out.println("5. æ€§èƒ½æå‡");
    }
    
    public static void generateMultipleCommits(int count) {
        System.out.println("ç”Ÿæˆ " + count + " ä¸ªæäº¤ä¿¡æ¯:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + generateCommitMessage());
        }
    }
    
    public static String getRandomCodeSnippet() {
        String[] snippets = {
            "// ä»Šæ—¥æ›´æ–°",
            "// ä»£ç ä¼˜åŒ–",
            "// åŠŸèƒ½å¢å¼º",
            "// é—®é¢˜ä¿®å¤",
            "// æ€§èƒ½æå‡",
            "// ä»£ç é‡æ„",
            "// æ·»åŠ æ³¨é‡Š",
            "// æ›´æ–°é…ç½®",
            "// æµ‹è¯•ç”¨ä¾‹",
            "// æ–‡æ¡£æ›´æ–°"
        };
        
        Random random = new Random();
        return snippets[random.nextInt(snippets.length)];
    }
} 
// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 15

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 12

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 28

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 25

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 28

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 24

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 5

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 23

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 23

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 27

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 16

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 15

// ×Ô¶¯¸üĞÂ: 2025-06-28 - ÔöÇ¿ 22

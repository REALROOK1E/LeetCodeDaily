package 左神.ContributionBooster;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * AI代码分析器
 * 调用本地大模型进行代码分析和改进
 */
public class AICodeAnalyzer {
    
    // 本地模型API配置
    private static final String LOCAL_MODEL_URL = "http://localhost:11434/api/generate"; // Ollama默认端口
    private static final String MODEL_NAME = "codellama"; // 或其他代码模型
    
    public static void main(String[] args) {
        System.out.println("=== AI代码分析器 ===");
        
        try {
            // 1. 分析现有代码
            analyzeExistingCode();
            
            // 2. 生成改进建议
            generateImprovements();
            
            // 3. 创建优化后的代码
            createOptimizedCode();
            
        } catch (Exception e) {
            System.err.println("AI分析失败: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * 分析现有代码
     */
    private static void analyzeExistingCode() throws Exception {
        System.out.println("1. 分析现有代码...");
        
        // 读取现有代码文件
        String[] filesToAnalyze = {
            "src/左神.ContributionBooster/DailyCommit.java",
            "src/左神.ContributionBooster/RandomCode.java",
            "src/左神.ContributionBooster/CommitHelper.java"
        };
        
        for (String filePath : filesToAnalyze) {
            File file = new File(filePath);
            if (file.exists()) {
                String code = readFile(filePath);
                String analysis = analyzeCodeWithAI(code, filePath);
                
                System.out.println("   分析文件: " + filePath);
                System.out.println("   AI分析结果: " + analysis);
                
                // 保存分析结果
                saveAnalysisResult(filePath, analysis);
            }
        }
    }
    
    /**
     * 生成改进建议
     */
    private static void generateImprovements() throws Exception {
        System.out.println("2. 生成改进建议...");
        
        String prompt = "请分析以下Java代码，并提供具体的改进建议，包括性能优化、代码结构、最佳实践等：\n\n";
        
        // 读取所有代码文件
        File folder = new File("src/左神.ContributionBooster");
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".java"));
        
        if (files != null) {
            for (File file : files) {
                String code = readFile(file.getPath());
                prompt += "文件: " + file.getName() + "\n";
                prompt += "代码:\n" + code + "\n\n";
            }
        }
        
        String improvements = callLocalModel(prompt + "请提供详细的改进建议：");
        System.out.println("   AI改进建议: " + improvements);
        
        // 保存改进建议
        saveFile("src/左神.ContributionBooster/ai_improvements.txt", improvements);
    }
    
    /**
     * 创建优化后的代码
     */
    private static void createOptimizedCode() throws Exception {
        System.out.println("3. 创建优化后的代码...");
        
        // 为每个文件生成优化版本
        String[] filesToOptimize = {
            "src/左神.ContributionBooster/DailyCommit.java",
            "src/左神.ContributionBooster/RandomCode.java",
            "src/左神.ContributionBooster/CommitHelper.java"
        };
        
        for (String filePath : filesToOptimize) {
            File file = new File(filePath);
            if (file.exists()) {
                String originalCode = readFile(filePath);
                String optimizedCode = optimizeCodeWithAI(originalCode, file.getName());
                
                // 创建优化后的文件
                String optimizedPath = filePath.replace(".java", "_Optimized.java");
                saveFile(optimizedPath, optimizedCode);
                
                System.out.println("   创建优化文件: " + optimizedPath);
            }
        }
    }
    
    /**
     * 调用本地大模型
     */
    public static String callLocalModel(String prompt) throws Exception {
        // 构建请求JSON
        String jsonRequest = buildJsonRequest(prompt);
        
        // 发送HTTP请求
        URL url = new URL(LOCAL_MODEL_URL);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);
        
        // 发送请求
        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonRequest.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }
        
        // 读取响应
        StringBuilder response = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                response.append(line);
            }
        }
        
        return parseModelResponse(response.toString());
    }
    
    /**
     * 构建JSON请求
     */
    private static String buildJsonRequest(String prompt) {
        return String.format("""
            {
                "model": "%s",
                "prompt": "%s",
                "stream": false,
                "options": {
                    "temperature": 0.7,
                    "top_p": 0.9,
                    "max_tokens": 2000
                }
            }
            """, MODEL_NAME, escapeJson(prompt));
    }
    
    /**
     * 解析模型响应
     */
    private static String parseModelResponse(String response) {
        // 简单的JSON解析，提取response字段
        if (response.contains("\"response\":")) {
            int start = response.indexOf("\"response\":") + 12;
            int end = response.indexOf("\"", start);
            if (end > start) {
                return response.substring(start, end);
            }
        }
        return response;
    }
    
    /**
     * 分析代码
     */
    private static String analyzeCodeWithAI(String code, String fileName) throws Exception {
        String prompt = String.format("""
            请分析以下Java代码，提供代码质量评估：
            
            文件名: %s
            代码:
            %s
            
            请从以下方面进行分析：
            1. 代码结构和可读性
            2. 性能优化建议
            3. 最佳实践遵循情况
            4. 潜在问题和改进点
            5. 总体评分（1-10分）
            
            请用中文回答，格式清晰。
            """, fileName, code);
        
        return callLocalModel(prompt);
    }
    
    /**
     * 优化代码
     */
    private static String optimizeCodeWithAI(String originalCode, String fileName) throws Exception {
        String prompt = String.format("""
            请优化以下Java代码，保持原有功能的同时提升代码质量：
            
            文件名: %s
            原始代码:
            %s
            
            请提供优化后的完整代码，要求：
            1. 保持原有功能不变
            2. 提升代码可读性和维护性
            3. 优化性能
            4. 遵循Java最佳实践
            5. 添加必要的注释
            
            请只返回优化后的代码，不要其他解释。
            """, fileName, originalCode);
        
        return callLocalModel(prompt);
    }
    
    /**
     * 读取文件内容
     */
    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
    
    /**
     * 保存文件
     */
    private static void saveFile(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }
    
    /**
     * 保存分析结果
     */
    private static void saveAnalysisResult(String filePath, String analysis) throws IOException {
        String resultPath = filePath.replace(".java", "_analysis.txt");
        saveFile(resultPath, analysis);
    }
    
    /**
     * 转义JSON字符串
     */
    private static String escapeJson(String text) {
        return text.replace("\\", "\\\\")
                  .replace("\"", "\\\"")
                  .replace("\n", "\\n")
                  .replace("\r", "\\r")
                  .replace("\t", "\\t");
    }
    
    /**
     * 检查本地模型是否可用
     */
    public static boolean checkLocalModel() {
        try {
            String response = callLocalModel("Hello");
            return response != null && !response.isEmpty();
        } catch (Exception e) {
            System.err.println("本地模型不可用: " + e.getMessage());
            return false;
        }
    }
} 
package ContributionBooster;

import java.io.*;
import java.util.Properties;

/**
 * 模型配置文件
 * 支持配置不同的本地大模型
 */
public class ModelConfig {
    
    private static final String CONFIG_FILE = "src/ContributionBooster/model_config.properties";
    private static Properties properties;
    
    // 默认配置
    private static final String DEFAULT_MODEL_URL = "http://localhost:11434/api/generate";
    private static final String DEFAULT_MODEL_NAME = "codellama";
    private static final String DEFAULT_TEMPERATURE = "0.7";
    private static final String DEFAULT_MAX_TOKENS = "2000";
    
    static {
        loadConfig();
    }
    
    /**
     * 加载配置文件
     */
    private static void loadConfig() {
        properties = new Properties();
        
        // 设置默认值
        properties.setProperty("model.url", DEFAULT_MODEL_URL);
        properties.setProperty("model.name", DEFAULT_MODEL_NAME);
        properties.setProperty("model.temperature", DEFAULT_TEMPERATURE);
        properties.setProperty("model.max_tokens", DEFAULT_MAX_TOKENS);
        
        // 尝试从文件加载
        File configFile = new File(CONFIG_FILE);
        if (configFile.exists()) {
            try (FileInputStream fis = new FileInputStream(configFile)) {
                properties.load(fis);
                System.out.println("已加载模型配置文件: " + CONFIG_FILE);
            } catch (IOException e) {
                System.err.println("加载配置文件失败: " + e.getMessage());
            }
        } else {
            // 创建默认配置文件
            createDefaultConfig();
        }
    }
    
    /**
     * 创建默认配置文件
     */
    private static void createDefaultConfig() {
        try (FileOutputStream fos = new FileOutputStream(CONFIG_FILE)) {
            properties.store(fos, "AI模型配置文件");
            System.out.println("已创建默认配置文件: " + CONFIG_FILE);
        } catch (IOException e) {
            System.err.println("创建配置文件失败: " + e.getMessage());
        }
    }
    
    /**
     * 获取模型URL
     */
    public static String getModelUrl() {
        return properties.getProperty("model.url", DEFAULT_MODEL_URL);
    }
    
    /**
     * 获取模型名称
     */
    public static String getModelName() {
        return properties.getProperty("model.name", DEFAULT_MODEL_NAME);
    }
    
    /**
     * 获取温度参数
     */
    public static double getTemperature() {
        return Double.parseDouble(properties.getProperty("model.temperature", DEFAULT_TEMPERATURE));
    }
    
    /**
     * 获取最大token数
     */
    public static int getMaxTokens() {
        return Integer.parseInt(properties.getProperty("model.max_tokens", DEFAULT_MAX_TOKENS));
    }
    
    /**
     * 设置模型配置
     */
    public static void setModelConfig(String url, String name, double temperature, int maxTokens) {
        properties.setProperty("model.url", url);
        properties.setProperty("model.name", name);
        properties.setProperty("model.temperature", String.valueOf(temperature));
        properties.setProperty("model.max_tokens", String.valueOf(maxTokens));
        
        // 保存到文件
        try (FileOutputStream fos = new FileOutputStream(CONFIG_FILE)) {
            properties.store(fos, "AI模型配置文件");
            System.out.println("配置已更新并保存");
        } catch (IOException e) {
            System.err.println("保存配置失败: " + e.getMessage());
        }
    }
    
    /**
     * 显示当前配置
     */
    public static void showConfig() {
        System.out.println("=== 当前模型配置 ===");
        System.out.println("模型URL: " + getModelUrl());
        System.out.println("模型名称: " + getModelName());
        System.out.println("温度参数: " + getTemperature());
        System.out.println("最大Token数: " + getMaxTokens());
    }
    
    /**
     * 支持的模型列表
     */
    public static void showSupportedModels() {
        System.out.println("=== 支持的本地模型 ===");
        System.out.println("1. codellama - 代码生成和分析");
        System.out.println("2. llama2 - 通用大语言模型");
        System.out.println("3. mistral - 高性能模型");
        System.out.println("4. gemma - Google开源模型");
        System.out.println("5. qwen - 通义千问模型");
        System.out.println("6. chatglm - 中文对话模型");
        System.out.println("7. baichuan - 百川模型");
        System.out.println("8. yi - 01.AI模型");
        
        System.out.println("\n=== 安装方法 ===");
        System.out.println("1. 安装Ollama: https://ollama.ai/");
        System.out.println("2. 下载模型: ollama pull codellama");
        System.out.println("3. 启动服务: ollama serve");
        System.out.println("4. 测试连接: ollama run codellama 'Hello'");
    }
    
    /**
     * 测试模型连接
     */
    public static boolean testConnection() {
        try {
            String testPrompt = "请回复'连接成功'";
            String response = AICodeAnalyzer.callLocalModel(testPrompt);
            boolean success = response != null && response.contains("连接成功");
            
            if (success) {
                System.out.println("✅ 模型连接成功");
            } else {
                System.out.println("❌ 模型连接失败");
            }
            
            return success;
        } catch (Exception e) {
            System.err.println("❌ 模型连接失败: " + e.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== 模型配置工具 ===");
        
        showConfig();
        System.out.println();
        showSupportedModels();
        System.out.println();
        testConnection();
    }
} 
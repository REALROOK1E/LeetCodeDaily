# 一键启动程序使用说明

## 功能概述

这个程序可以自动生成Java小功能程序，创建文件，并自动提交到GitHub，实现完整的自动化工作流。

## 主要功能

### 1. 一键生成代码并提交 (`OneClickCommit.java`)
- 自动生成Java小功能程序（如计算器、字符串工具、数组助手等）
- 创建新的Java文件
- 更新现有文件
- 自动执行 `git add .`、`git commit`、`git push`

### 2. 快速启动器 (`QuickStart.java`)
- 提供菜单界面，选择不同功能
- 支持单次执行和批量执行
- 集成所有现有功能

### 3. 批量执行功能
- 可以一次性执行多次提交
- 每次生成不同的代码文件
- 自动间隔执行，避免冲突

## 使用方法

### 方法一：使用批处理文件（推荐）
1. 双击运行 `start.bat`
2. 选择运行模式：
   - 1: 快速启动器（推荐）
   - 2: 一键生成代码并提交
   - 3: 批量执行（10次）

### 方法二：直接运行Java程序
```bash
# 编译
javac -cp . src/ContributionBooster/*.java

# 运行快速启动器
java -cp . ContributionBooster.QuickStart

# 或直接运行一键提交
java -cp . ContributionBooster.OneClickCommit

# 或批量执行
java -cp . ContributionBooster.OneClickCommit batchOneClickCommit 10
```

## 生成的功能程序类型

程序会自动生成以下类型的Java小功能程序：

1. **Calculator** - 计算器功能
2. **StringUtils** - 字符串工具
3. **ArrayHelper** - 数组助手
4. **DateUtils** - 日期工具
5. **FileProcessor** - 文件处理器
6. **MathHelper** - 数学助手
7. **ValidationUtils** - 验证工具
8. **SortHelper** - 排序助手
9. **SearchUtils** - 搜索工具
10. **DataConverter** - 数据转换器

每个生成的文件都包含：
- 字符串操作演示
- 数组操作演示
- 数学运算演示
- 日期时间操作演示
- 文件操作演示
- 实用工具方法

## 提交信息格式

程序会自动生成规范的提交信息，格式如下：
```
feat: 添加新功能 - 添加Calculator功能 - 2024-01-15 #123
fix: 修复bug - 添加StringUtils功能 - 2024-01-15 #456
docs: 更新文档 - 添加ArrayHelper功能 - 2024-01-15 #789
```

## 注意事项

1. **Git配置**：确保已配置Git用户信息和远程仓库
2. **网络连接**：需要网络连接来推送到GitHub
3. **权限**：确保有推送到目标仓库的权限
4. **Java环境**：需要安装Java JDK 8或更高版本

## 错误处理

- 如果Git操作失败，程序会显示具体错误信息
- 如果文件创建失败，会显示文件路径和错误原因
- 如果网络连接问题，会提示检查网络设置

## 自定义配置

你可以修改以下配置：
- `FUNCTION_NAMES`：修改生成的功能程序名称
- `COMMIT_MESSAGES`：修改提交信息模板
- 文件路径：修改生成文件的保存位置

## 示例输出

```
=== 一键启动程序 ===
自动生成Java小功能程序并提交到GitHub
创建文件: src/ContributionBooster/Calculator.java
更新现有文件...
  更新文件: src/ContributionBooster/DailyCommit.java
  更新文件: src/ContributionBooster/RandomCode.java
  更新文件: src/ContributionBooster/CommitHelper.java
执行Git操作...
  git add . 完成
  git commit 完成
  git push 完成
=== 操作完成 ===
生成的文件: src/ContributionBooster/Calculator.java
提交信息: feat: 添加新功能 - 添加Calculator功能 - 2024-01-15 #123
已自动提交到GitHub
```

## 技术支持

如果遇到问题，请检查：
1. Java环境是否正确安装
2. Git是否正确配置
3. 网络连接是否正常
4. 目标仓库权限是否正确 
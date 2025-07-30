#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import os

# 定义题目数据
problems = [
    # 更多数组题目
    {"num": 48, "name": "旋转图像", "category": "数组", "difficulty": "中等", "method": "原地旋转"},
    {"num": 49, "name": "字母异位词分组", "category": "哈希表", "difficulty": "中等", "method": "哈希表"},
    {"num": 51, "name": "N皇后", "category": "回溯", "difficulty": "困难", "method": "回溯算法"},
    {"num": 79, "name": "单词搜索", "category": "回溯", "difficulty": "中等", "method": "DFS回溯"},
    {"num": 85, "name": "最大矩形", "category": "单调栈", "difficulty": "困难", "method": "单调栈"},
    {"num": 96, "name": "不同的二叉搜索树", "category": "动态规划", "difficulty": "中等", "method": "动态规划"},
    {"num": 98, "name": "验证二叉搜索树", "category": "树", "difficulty": "中等", "method": "中序遍历"},
    {"num": 105, "name": "从前序与中序遍历序列构造二叉树", "category": "树", "difficulty": "中等", "method": "递归"},
    {"num": 115, "name": "不同的子序列", "category": "动态规划", "difficulty": "困难", "method": "动态规划"},
    {"num": 139, "name": "单词拆分", "category": "动态规划", "difficulty": "中等", "method": "动态规划"},
    {"num": 142, "name": "环形链表II", "category": "链表", "difficulty": "中等", "method": "快慢指针"},
    {"num": 148, "name": "排序链表", "category": "链表", "difficulty": "中等", "method": "归并排序"},
    {"num": 152, "name": "乘积最大子数组", "category": "动态规划", "difficulty": "中等", "method": "动态规划"},
    {"num": 160, "name": "相交链表", "category": "链表", "difficulty": "简单", "method": "双指针"},
    {"num": 208, "name": "实现Trie", "category": "树", "difficulty": "中等", "method": "前缀树"},
    {"num": 221, "name": "最大正方形", "category": "动态规划", "difficulty": "中等", "method": "动态规划"},
    {"num": 236, "name": "二叉树的最近公共祖先", "category": "树", "difficulty": "中等", "method": "递归"},
    {"num": 240, "name": "搜索二维矩阵II", "category": "二分查找", "difficulty": "中等", "method": "二分查找"},
    {"num": 279, "name": "完全平方数", "category": "动态规划", "difficulty": "中等", "method": "动态规划"},
    {"num": 287, "name": "寻找重复数", "category": "数组", "difficulty": "中等", "method": "快慢指针"},
    {"num": 297, "name": "二叉树的序列化与反序列化", "category": "树", "difficulty": "困难", "method": "DFS"},
    {"num": 301, "name": "删除无效的括号", "category": "回溯", "difficulty": "困难", "method": "BFS"},
    {"num": 309, "name": "最佳买卖股票时机含冷冻期", "category": "动态规划", "difficulty": "中等", "method": "状态机"},
    {"num": 312, "name": "戳气球", "category": "动态规划", "difficulty": "困难", "method": "区间DP"},
    {"num": 322, "name": "零钱兑换", "category": "动态规划", "difficulty": "中等", "method": "动态规划"},
    {"num": 337, "name": "打家劫舍III", "category": "动态规划", "difficulty": "中等", "method": "树形DP"},
    {"num": 338, "name": "比特位计数", "category": "动态规划", "difficulty": "简单", "method": "位运算DP"},
    {"num": 394, "name": "字符串解码", "category": "字符串与栈", "difficulty": "中等", "method": "栈"},
    {"num": 399, "name": "除法求值", "category": "图", "difficulty": "中等", "method": "并查集"},
    {"num": 406, "name": "根据身高重建队列", "category": "贪心算法", "difficulty": "中等", "method": "贪心算法"},
    {"num": 416, "name": "分割等和子集", "category": "动态规划", "difficulty": "中等", "method": "01背包"},
    {"num": 437, "name": "路径总和III", "category": "树", "difficulty": "中等", "method": "前缀和"},
    {"num": 438, "name": "找到字符串中所有字母异位词", "category": "滑动窗口", "difficulty": "中等", "method": "滑动窗口"},
    {"num": 448, "name": "找到所有数组中消失的数字", "category": "数组", "difficulty": "简单", "method": "原地修改"},
    {"num": 461, "name": "汉明距离", "category": "数组", "difficulty": "简单", "method": "位运算"},
    {"num": 494, "name": "目标和", "category": "动态规划", "difficulty": "中等", "method": "01背包"},
    {"num": 538, "name": "把二叉搜索树转换为累加树", "category": "树", "difficulty": "中等", "method": "反向中序遍历"},
    {"num": 543, "name": "二叉树的直径", "category": "树", "difficulty": "简单", "method": "DFS"},
    {"num": 560, "name": "和为K的子数组", "category": "哈希表", "difficulty": "中等", "method": "前缀和"},
    {"num": 617, "name": "合并二叉树", "category": "树", "difficulty": "简单", "method": "递归"},
    {"num": 621, "name": "任务调度器", "category": "贪心算法", "difficulty": "中等", "method": "贪心算法"},
    {"num": 647, "name": "回文子串", "category": "字符串与栈", "difficulty": "中等", "method": "中心扩展"},
    {"num": 680, "name": "验证回文字符串II", "category": "双指针", "difficulty": "简单", "method": "双指针"},
    {"num": 687, "name": "最长同值路径", "category": "树", "difficulty": "中等", "method": "DFS"},
]

# 基础路径
base_path = r"c:\Users\Administrator\Desktop\CodeBase\LeetCodeDaily\HOT100Final"

# 生成题目模板
for problem in problems:
    category_path = os.path.join(base_path, problem["category"])
    if not os.path.exists(category_path):
        os.makedirs(category_path)
    
    file_name = f"LC{problem['num']}_{problem['name']}.java"
    file_path = os.path.join(category_path, file_name)
    
    # 生成Java代码内容
    content = f'''/**
 * LC{problem["num"]} - {problem["name"]}
 * 难度：{problem["difficulty"]}
 * 描述：
 * {problem["name"]}的相关题目描述
 */
import java.util.*;

public class LC{problem["num"]}_{problem["name"]} {{

    /**
     * 方法：{problem["method"]}
     * @param input 输入参数
     * @return 返回结果
     */
    public int solution(int[] input) {{
        // 实现逻辑
        return 0;
    }}

    public static void main(String[] args) {{
        LC{problem["num"]}_{problem["name"]} solution = new LC{problem["num"]}_{problem["name"]}();
        int[] input = {{1, 2, 3}};
        int result = solution.solution(input);
        System.out.println("结果: " + result);
    }}
}}'''
    
    # 写入文件
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(content)
    
    print(f"已生成: {file_name}")

print("批量生成完成！")

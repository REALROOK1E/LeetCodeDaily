#!/usr/bin/env python3
# -*- coding: utf-8 -*-

import os

# 一周的题目配置
weekly_problems = {
    "Wednesday_2025-07-16": [
        ("LC128_最长连续序列.java", "最长连续序列"),
        ("LC136_只出现一次的数字.java", "只出现一次的数字"),
        ("LC283_移动零.java", "移动零"),
        ("LC238_除自身以外数组的乘积.java", "除自身以外数组的乘积"),
        ("LC189_轮转数组.java", "轮转数组")
    ],
    "Thursday_2025-07-17": [
        ("LC155_最小栈.java", "最小栈"),
        ("LC232_用栈实现队列.java", "用栈实现队列"),
        ("LC225_用队列实现栈.java", "用队列实现栈"),
        ("LC150_逆波兰表达式求值.java", "逆波兰表达式求值"),
        ("LC739_每日温度.java", "每日温度")
    ],
    "Friday_2025-07-18": [
        ("LC56_合并区间.java", "合并区间"),
        ("LC75_颜色分类.java", "颜色分类"),
        ("LC88_合并两个有序数组.java", "合并两个有序数组"),
        ("LC26_删除有序数组中的重复项.java", "删除有序数组中的重复项"),
        ("LC80_删除有序数组中的重复项II.java", "删除有序数组中的重复项II")
    ],
    "Saturday_2025-07-19": [
        ("LC42_接雨水.java", "接雨水"),
        ("LC581_最短无序连续子数组.java", "最短无序连续子数组"),
        ("LC287_寻找重复数.java", "寻找重复数"),
        ("LC448_找到所有数组中消失的数字.java", "找到所有数组中消失的数字"),
        ("LC442_数组中重复的数据.java", "数组中重复的数据")
    ],
    "Sunday_2025-07-20": [
        ("LC406_根据身高重建队列.java", "根据身高重建队列"),
        ("LC452_用最少数量的箭引爆气球.java", "用最少数量的箭引爆气球"),
        ("LC435_无重叠区间.java", "无重叠区间"),
        ("LC763_划分字母区间.java", "划分字母区间"),
        ("LC56_合并区间_复习.java", "合并区间（复习）")
    ]
}

def create_problem_template(filename, problem_name):
    """创建题目模板"""
    template = f'''/**
 * LeetCode {filename.split('_')[0][2:]} - {problem_name}
 * 
 * 题目描述：
 * TODO: 在这里添加题目描述
 * 
 * 示例：
 * 输入: 
 * 输出: 
 * 
 * 提示：
 * 
 */
public class {filename.replace('.java', '')} {{
    
    /**
     * 方法1：
     * 时间复杂度：
     * 空间复杂度：
     */
    public void solution1() {{
        // TODO: 实现你的解法
    }}
    
    /**
     * 方法2：
     * 时间复杂度：
     * 空间复杂度：
     */
    public void solution2() {{
        // TODO: 实现你的解法
    }}
    
    public static void main(String[] args) {{
        {filename.replace('.java', '')} solution = new {filename.replace('.java', '')}();
        
        // 测试用例
        System.out.println("=== 测试用例 ===");
        // TODO: 添加测试用例
    }}
}}
'''
    return template

def main():
    base_dir = "C:\\Users\\26485\\Desktop\\cpplAB\\LeetCodeDaily\\2025-07-14_to_2025-07-20"
    
    for day_folder, problems in weekly_problems.items():
        day_path = os.path.join(base_dir, day_folder)
        
        # 确保文件夹存在
        if not os.path.exists(day_path):
            os.makedirs(day_path)
            print(f"创建文件夹: {day_path}")
        
        # 为每个题目创建模板文件
        for filename, problem_name in problems:
            file_path = os.path.join(day_path, filename)
            
            if not os.path.exists(file_path):
                template = create_problem_template(filename, problem_name)
                
                with open(file_path, 'w', encoding='utf-8') as f:
                    f.write(template)
                
                print(f"创建文件: {file_path}")
            else:
                print(f"文件已存在: {file_path}")

if __name__ == "__main__":
    main()
    print("\\n=== 一周题目模板生成完成 ===")
    print("\\n题目清单:")
    for day, problems in weekly_problems.items():
        print(f"\\n{day}:")
        for filename, problem_name in problems:
            print(f"  {filename} - {problem_name}") 
# -*- coding: utf-8 -*-
"""
批量生成 LeetCode 前 100 道题目的 Java 模板文件。
按类别（数组、双指针、动态规划、树结构、哈希表等）创建文件夹，
跳过已有的模板文件，自动生成空方法和测试主函数。
"""
import os

# 请在此处填入完整的 100 道题目配置，包括题号、名称、类别、难度、方法
problems = [
    # 示例：
    {"id":1, "name":"两数之和", "category":"数组", "difficulty":"简单", "method":"哈希表"},
    {"id":2, "name":"两数相加", "category":"链表", "difficulty":"中等", "method":"链表遍历"},
    # ... 共计 100 条 ...
]

root_dir = os.path.join(os.getcwd(), 'HOT100Final')

for p in problems:
    cat_dir = os.path.join(root_dir, p['category'])
    os.makedirs(cat_dir, exist_ok=True)
    fname = f"LC{p['id']:03d}_{p['name']}.java"
    fpath = os.path.join(cat_dir, fname)
    if os.path.exists(fpath):
        continue
    with open(fpath, 'w', encoding='utf-8') as f:
        f.write(f"""/**
 * LC{p['id']} - {p['name']}
 * 难度：{p['difficulty']}
 * 方法：{p['method']}
 * 描述：
 * TODO: 写题目描述
 */
public class LC{p['id']:03d}_{p['name']} {{

    public void solution() {{
        // 实现逻辑
    }}

    public static void main(String[] args) {{
        LC{p['id']:03d}_{p['name']} sol = new LC{p['id']:03d}_{p['name']}();
        sol.solution();
        System.out.println("结果: TODO");
    }}
}}""")
print('模板生成完成（请补充题目描述和方法签名）。')

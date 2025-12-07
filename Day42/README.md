# 🧠 Day 42 – Dynamic Construction of Pascal’s Triangle (Easy)

**📅 Date:** December 07, 2025  
**💻 Language:** Java  
**📚 Topic:** Recursion, Dynamic Row Generation  

---

## ✅ Problems Solved
| Problem | LeetCode # | Description |
|:--|:--:|:--|
| [Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/) | #118 | Generate the first `numRows` of Pascal’s Triangle. |

---

## 💡 Concepts Practiced
- Used **recursion** to build triangle row-by-row  
- Each row always starts and ends with **1**
- Middle values follow the rule:  
  `row[i] = prevRow[i - 1] + prevRow[i]`
- Appended newly generated row to previous rows
- Recursive approach helps understand:
  - bottom-up building  
  - dependencies between rows  
- Time complexity: **O(n²)**  
- Space complexity: **O(n²)** (stores entire triangle)

---

## 🏁 Summary

Day 42 of the **100 Days of DSA** 🔺
Generated Pascal’s Triangle using a clean **recursive approach**, reinforcing concepts of:
- row dependencies
- symmetric patterns
- dynamic construction
A classic problem that solidifies understanding of list manipulation and recursion ✨📐
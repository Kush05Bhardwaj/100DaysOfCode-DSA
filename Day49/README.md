# 🧠 Day 49 – Two-Pointer Intersection on Sorted Arrays (Easy)

**📅 Date:** December 14, 2025  
**💻 Language:** Java  
**📚 Topic:** Sorting + Two Pointers, Array Intersection  

---

## ✅ Problems Solved
| Problem | LeetCode # | Description |
|:--|:--:|:--|
| [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | #350 | Return the intersection of two arrays, including duplicate counts. |

---

## 💡 Concepts Practiced
- Used **sorting + two pointers** to efficiently compute intersection  
- After sorting both arrays:
  - If `nums1[i] < nums2[j]` → move `i`  
  - If `nums1[i] > nums2[j]` → move `j`  
  - If equal → match found → store in `nums1[k]`  
- Used original array as a storage buffer to avoid extra memory  
- Returned only the valid portion using `Arrays.copyOfRange(nums1, 0, k)`
- Time complexity: **O(n log n + m log m)** (due to sorting)  
- Space complexity: **O(1)** (ignoring sorting)  
- Strengthened understanding of:
  - Multi-pointer traversal  
  - Handling duplicates  
  - Sorting to simplify problem structure  

---

## 🧩 Output Screenshots
| Problem | Result |
|:--|:--|
| Intersection of TwoArrays II | ![IntersectionofTwoArraysII_result](./IntersectionofTwoArraysII.png) |

---

## 🏁 Summary

Day 49 of the **100 Days of DSA** 🔗
Solved **Intersection of Two Arrays II** using a clean two-pointer approach after sorting both arrays.
Great practice for** duplicate handling, sorted traversals, and minimal-space array manipulation** ⚡📊
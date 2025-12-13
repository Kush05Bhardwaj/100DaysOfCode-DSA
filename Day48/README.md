# 🧠 Day 48 – Monotonic Stack for Next Greater Element (Easy/Medium)

**📅 Date:** December 13, 2025  
**💻 Language:** Java  
**📚 Topic:** Monotonic Stack, Preprocessing, Mapping Next Greater Values  

---

## ✅ Problems Solved
| Problem | LeetCode # | Description |
|:--|:--:|:--|
| [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | #496 | For each element in `nums1`, find the next greater element in `nums2`. |

---

## 💡 Concepts Practiced
- Used a **monotonic decreasing stack** to efficiently precompute next greater elements in `nums2`
- Traversed `nums2` **from right to left** to maintain next-greater availability
- Logic breakdown:
  - Pop all elements ≤ current → they cannot be next greater  
  - Top of stack (if exists) is the next greater number  
  - Otherwise → `-1`  
- Stored results in a lookup array `nextGreater[val]` for O(1) access  
- Final answer built by mapping values of `nums1` → `nextGreater[]`
- Complexity:
  - Time: **O(n + m)**  
  - Space: **O(n)** (stack + mapping)
- Reinforced intuition for:
  - Monotonic stacks  
  - Efficient next-greater preprocessing  
  - Avoiding nested loops  

---

## 🧩 Output Screenshots
| Problem | Result |
|:--|:--|
| Next Greater Element I | ![NextGreaterElementI_result](./NextGreaterElementI.png) |

---

## 🏁 Summary
Day 48 of the **100 Days of DSA** 🔥
Mastered **Next Greater Element** using a **monotonic stack**, allowing fast preprocessing and constant-time lookups.
A very powerful technique that reappears in many stack-based interview problems 💡📈
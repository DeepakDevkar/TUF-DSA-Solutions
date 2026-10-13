# [Recursive Insertion Sort](https://takeuforward.org/practice/dsa/recursive-insertion-sort?category=algorithms&source=strivers-a2z-dsa-sheet)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers nums, sort the array in non-decreasing order using the recursive Insertion Sort algorithm, and return the sorted array.

- You must implement **Insertion Sort using recursion only.**
- Do not use loops (like for or while) or built-in sorting functions (sort, Arrays.sort, etc.).
- A sorted array in **non-decreasing order** is an array where each element is **greater** than or **equal** to all elements that come before it.

### Example 1:

**Input:** nums = [7, 4, 1, 5, 3]

**Output:** [1, 3, 4, 5, 7]

**Explanation:** 1 <= 3 <= 4 <= 5 <= 7.

Thus the array is sorted in non-decreasing order.

### Example 2:

**Input:** nums = [5, 4, 4, 1, 1]

**Output:** [1, 1, 4, 4, 5]

**Explanation:** 1 <= 1 <= 4 <= 4 <= 5.

Thus the array is sorted in non-decreasing order.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 1000
- -10^4 <= nums[i] <= 10^4
- nums[i] may contain duplicate values.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

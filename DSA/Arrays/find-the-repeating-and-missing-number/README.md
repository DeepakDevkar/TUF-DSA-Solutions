# [Find the repeating and missing number](https://takeuforward.org/practice/dsa/find-the-repeating-and-missing-number?category=faqs-hard&source=strivers-a2z-dsa-sheet&sidebar=0)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an integer array **nums** of size **n** containing values from **[1, n]** and **each** value appears **exactly** once in the array, except for **A** , which appears **twice** and **B** which is **missing** .

Return the values **A** and **B** , as an array of size 2, where **A** appears in the **0-th** index and **B** in the **1st** index.

**Note:** You are not allowed to modify the original array.

### Example 1:

**Input:** nums = [3, 5, 4, 1, 1]

**Output:** [1, 2]

**Explanation:**

1 appears two times in the array and 2 is missing from nums

### Example 2:

**Input:** nums = [1, 2, 3, 6, 7, 5, 7]

**Output:** [7, 4]

**Explanation:**

7 appears two times in the array and 4 is missing from nums.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- n == nums.length
- 1 <= n <= 10^5
- n - 2 elements in nums appear exactly once and are valued between [1, n].
- 1 element in nums appears twice, and is valued between [1, n].

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

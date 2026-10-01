# [960. Build heap from a given ArrayPOTD](https://takeuforward.org/practice/dsa/build-heap-from-a-given-array)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of integers **nums** , convert it in-place into a **min-heap** .

A binary min-heap is a complete binary tree where the key at the root is the **minimum** among all keys present in a binary min-heap and the same property is **recursively** true for all nodes in a Binary Tree.

**Note**

Since multiple valid min-heaps can be formed from the same input array, the output may not be unique.

Therefore, the platform will validate the returned array and print:

- **True** if the returned array is a valid min-heap.
- **False** if the returned array is not a valid min-heap.

### Example 1:

**Input:** nums = [6, 5, 2, 7, 1, 7]

**Output:** [1, 5, 2, 7, 6, 7]

**Explanation:** nums[0] <= nums[1], nums[2]

nums[1] <= nums[3], nums[4]

nums[2] <= nums[5]

### Example 2:

**Input:** nums = [2, 3, 4, 1, 7, 3, 9, 4, 6]

**Output:** [1, 2, 3, 3, 7, 4, 9, 4, 6]

**Explanation:** nums[0] <= nums[1], nums[2]

nums[1] <= nums[3], nums[4]

nums[2] <= nums[5], nums[6]

nums[3] <= nums[7], nums[8]

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= nums.length <= 10^5
- -10^4 <= nums[i] <= 10^4

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

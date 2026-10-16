# [Remove Nth node from the back of the LL](https://takeuforward.org/practice/dsa/remove-nth-node-from-the-back-of-the-ll?category=logic-building&source=strivers-a2z-dsa-sheet)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the head of a singly linked list and an integer n. Remove the n^th node from the back of the linked List and return the head of the modified list. The value of n will always be less than or equal to the number of nodes in the linked list.

### Example 1:

**Input:** linkedList = 1 -> 2 -> 3 -> 4 -> 5, n = 2

**Output:** 1 -> 2 -> 3 -> 5

**Explanation:** The 2nd node from the back was the node with value 4.

### Example 2:

**Input:** linkedList = 5 -> 4 -> 3 -> 2 -> 1, n = 5

**Output:** 4 -> 3 -> 2 -> 1

**Explanation:** The 5th node from the back is the first node.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= number of nodes in the Linked List <= 10^5
- 0 <= ListNode.val <= 10^4
- 1 <= n <= number of nodes in the Linked List.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

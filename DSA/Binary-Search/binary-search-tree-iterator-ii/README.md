# [747. Binary Search Tree Iterator II
POTD](https://takeuforward.org/practice/dsa/binary-search-tree-iterator-ii)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Implement the BSTIterator class:

- BSTIterator(TreeNode root): Initializes an object of the BSTIterator class. The root of the BST is given as part of the constructor. The pointer should be initialized to a non-existent number smaller than any element in the BST.

- boolean hasNext(): Returns true if there exists a number in the traversal to the right of the pointer; otherwise, returns false.

- int next(): Moves the pointer to the right and returns the number at the pointer.

- boolean hasPrev(): Returns true if there exists a number in the traversal to the left of the pointer; otherwise, returns false.

- int prev(): Moves the pointer to the left and returns the number at the pointer.

You might think that calls to next() and prior() are always valid. In other words, when next()/prev() is invoked, the in-order traversal will have at least one next/previous number.

### Example 1:

**Input:** operations: ["BSTIterator", "next", "next", "prev", "next", "hasNext", "next", "next", "next", "hasNext", "hasPrev", "prev", "prev"]

root : 7 3 15 null null 9 20

**Output:** [null, 3, 7, 3, 7, true, 9, 15, 20, false, true, 15, 9]

**Explanation:**

The underlined element is where the pointer currently is.

BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]); // state is [3, 7, 9, 15, 20]

bSTIterator.next(); // state becomes [3, 7, 9, 15, 20], return 3

bSTIterator.next(); // state becomes [3, 7, 9, 15, 20], return 7

bSTIterator.prev(); // state becomes [3, 7, 9, 15, 20], return 3

bSTIterator.next(); // state becomes [3, 7, 9, 15, 20], return 7

bSTIterator.hasNext(); // return true

bSTIterator.next(); // state becomes [3, 7, 9, 15, 20], return 9

bSTIterator.next(); // state becomes [3, 7, 9, 15, 20], return 15

bSTIterator.next(); // state becomes [3, 7, 9, 15, 20], return 20

bSTIterator.hasNext(); // return false

bSTIterator.hasPrev(); // return true

bSTIterator.prev(); // state becomes [3, 7, 9, 15, 20], return 15

bSTIterator.prev(); // state becomes [3, 7, 9, 15, 20], return 9

### Example 2:

**Input:** operations : ["BSTIterator", "next", "hasNext", "next", "next", "prev", "hasPrev", "prev", "hasPrev", "next", "next", "hasNext"]

root : 10 5 15 2 7 12 18

**Output:** [null, 2, true, 5, 7, 5, true, 2, false, 5, 7, true]

**Explanation:**

BSTIterator bSTIterator = new BSTIterator([10, 5, 15, 2, 7, 12, 18]); // state is [2, 5, 7, 10, 12, 15, 18]

bSTIterator.next(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 2

bSTIterator.hasNext(); // return true

bSTIterator.next(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 5

bSTIterator.next(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 7

bSTIterator.prev(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 5

bSTIterator.hasPrev(); // return true

bSTIterator.prev(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 2

bSTIterator.hasPrev(); // return false

bSTIterator.next(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 5

bSTIterator.next(); // state becomes [2, 5, 7, 10, 12, 15, 18], return 7

bSTIterator.hasNext(); // return true

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- The number of nodes in the tree is in the range [1, 10^5].
- 0 <= Node.val <= 10^6
- At most 10^5 calls will be made to hasNext, next, hasPrev, and prev.

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

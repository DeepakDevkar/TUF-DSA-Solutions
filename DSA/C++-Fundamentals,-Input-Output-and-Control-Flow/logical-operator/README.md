# [Logical Operators](https://takeuforward.org/practice/dsa/logical-operator?category=practice-cpp-fundamentals-input-output-and-control-flow&source=cpp&solution=cpp)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are given two integers a and b, and a string op representing a logical operator.

Perform the logical operation specified by op on a and b, and print the result as an integer.

The supported operators are:

- && — Logical AND
- || — Logical OR

For logical operations, 0 is treated as false and any non-zero value is treated as true.

**Input**

The input contains three values in the following order:

- a — an integer.
- b — an integer.
- op — a string representing the logical operator.

**Output**

- Print the result of the specified logical operation as an integer.
- For a true result, print 1.
- For a false result, print 0.

### Example 1:

**Input:**

```
1
0
&&
```

**Output:**

```
0
```

**Explanation:**

The operator is &&, so 1 && 0 evaluates to false. Therefore, the output is 0.

### Example 2:

**Input:**

```
5
3
&&
```

**Output:**

```
1
```

**Explanation:**

Both 5 and 3 are non-zero, so they are treated as true. Therefore, 5 && 3 evaluates to true, and the output is 1.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- -100 ≤ a, b ≤ 100
- op ∈ {&&, ||}

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

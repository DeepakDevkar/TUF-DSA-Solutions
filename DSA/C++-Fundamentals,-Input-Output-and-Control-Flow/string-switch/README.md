# [Switch Case II](https://takeuforward.org/practice/dsa/string-switch?category=practice-cpp-fundamentals-input-output-and-control-flow&source=cpp&solution=cpp)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are given a string status representing the current state of a system response.

Use a switch-case statement to determine the corresponding message based on the value of status.

The possible values are:

- OK → Success
- ERROR → Failure
- PENDING → Waiting

If status does not match any of the above values, print Unknown.

**Input**

The input contains a single string:

- status — an uppercase string representing the system response.

**Output**

- Print the message corresponding to the given status.
- If the status is not OK, ERROR, or PENDING, print Unknown.

### Example 1:

**Input:**

```
OK
```

**Output:**

```
Success
```

**Explanation:**

The status is OK, which corresponds to the message Success.

### Example 2:

**Input:**

```
ERROR
```

**Output:**

```
Failure
```

**Explanation:**

The status is ERROR, which corresponds to the message Failure.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 ≤ length(status) ≤ 20
- status contains uppercase letters only

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

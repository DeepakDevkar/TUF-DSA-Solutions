# [Switch Case I](https://takeuforward.org/practice/dsa/switch-case-beginner?category=practice-cpp-fundamentals-input-output-and-control-flow&source=cpp&solution=cpp)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

You are given an integer day representing a day number.

The week starts with Monday as day 1, followed by Tuesday, Wednesday, and so on up to Sunday as day 7.

Use a switch-case statement to determine and print the corresponding day of the week.

If day is less than 1 or greater than 7, print Invalid.

The first letter of the output should be capitalized, and the remaining letters should be lowercase.

**Input**

The input contains a single integer:

- day — the number representing the day of the week.

**Output**

Print the corresponding day of the week:

- 1 → Monday
- 2 → Tuesday
- 3 → Wednesday
- 4 → Thursday
- 5 → Friday
- 6 → Saturday
- 7 → Sunday

For any value outside the range 1 to 7, print Invalid.

### Example 1:

**Input:**

```
3
```

**Output:**

```
Wednesday
```

**Explanation:**

Day 3 corresponds to Wednesday.

### Example 2:

**Input:**

```
8
```

**Output:**

```
Invalid
```

**Explanation:**

There are only 7 days in a week, so day 8 is invalid.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 0 <= day <= 50

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

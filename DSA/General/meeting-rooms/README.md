# [72. Meeting RoomsPOTD](https://takeuforward.org/practice/dsa/meeting-rooms)

![Difficulty: Basic](https://img.shields.io/badge/Difficulty-Basic-22c55e?style=for-the-badge)

---

## 📝 Problem Statement

Given an array of meeting time intervals where intervals[i] = [starti, endi].

Determine if a person could attend all meetings.

### Example 1:

**Input:** intervals = [[1, 5], [3, 8], [6, 10], [12, 15]]

**Output:** false

**Explanation:** Overlapping meetings exist at [1,5] and [3,8], making it impossible to attend all.

### Example 2:

**Input:** intervals = [[2, 6], [7, 9], [10, 14], [15, 18]]

**Output:** true

**Explanation:** No overlapping meetings, so all can be attended.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 0 <= intervals.length <= 10^4
- intervals[i].length == 2
- 0 <= start_i < end_i <= 10^6

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

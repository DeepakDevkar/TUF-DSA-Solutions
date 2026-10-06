# [728. All Paths from Source Lead to Destination
POTD](https://takeuforward.org/practice/dsa/all-paths-from-source-lead-to-destination)

![Difficulty: Core](https://img.shields.io/badge/Difficulty-Core-eab308?style=for-the-badge)

---

## 📝 Problem Statement

Given the edges of a directed graph where **edges** [i] = [a_i, b_i] indicates there is an edge between nodes a_i and b_i, and two nodes source and destination of this graph, determine whether or not all paths starting from source eventually, end at destination, that is:

- At least one path exists from the source node to the destination node

- If a path exists from the source node to a node with no outgoing edges, then that node is equal to destination.

- The number of possible paths from source to destination is a finite number.

Return true if and only if all roads from source lead to destination.

### Example 1:

**Input:** n = 3, edges = [[0,1],[0,2]], source = 0, destination = 2

**Output:** false

**Explanation:**

It is possible to reach and get stuck on both node 1 and node 2.

### Example 2:

**Input:** n = 4, edges = [[0,1],[0,3],[1,2],[2,1]], source = 0, destination = 3

**Output:** false

**Explanation:**

We have two possibilities: to end at node 3, or to loop over node 1 and node 2 indefinitely.

Still unsure what the problem is asking ?

Let’s go through a few more examples, step by step, to make it clearer.

### Constraints

- 1 <= n <= 10^4
- 0 <= edges.length <= 10^4
- edges.length == 2
- 0 <= ai, bi <= n - 1
- 0 <= source <= n - 1
- 0 <= destination <= n - 1

---

## 💡 Complexity Analysis

- **Time Complexity:** $\mathcal{O}(N)$
- **Space Complexity:** $\mathcal{O}(1)$

---

<p align="center">
  Generated with ❤️ by <a href="https://github.com/Arora-Sir">Mohit Arora</a> &nbsp;|&nbsp; Practice on <a href="https://takeuforward.org/pricing?affiliate=arorasir">TakeUForward (TUF+)</a> &nbsp;|&nbsp; ⭐ <a href="https://github.com/Arora-Sir/TUFHub">Star TUFHub on GitHub</a>
</p>

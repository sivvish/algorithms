# TimeComplexity

## Time Complexity can be represented by the notation `T(n)`, where n is the size of the input or the problem. It is the time (or the number of steps) it takes to complete a problem of size n

## Big O notation or `O(f(n))` is a mathematical notation that describes the limiting behaviour of a function when the argument tends towards a specific value or infinity
```
If T(n) = 6n^4 - 2n^3 + 5 and n approaches infinty
we say that T(n) is a Big O of n^4 or
T(n) = O(n^4), where = stands for is and not literal equality
```

### Different time complexities

* O(1): Time complexity of a function (or set of statements) is considered as O(1) if it doesn’t contain loop, recursion and call to any other non-constant time function. For example swap() function has O(1) time complexity. A loop or recursion that runs a constant number of times is also considered as O(1).

* O(n): Time Complexity of a loop is considered as O(n) if the loop variable (i) is incremented/decremented by a constant amount (e.g. i++, i=i-2) after every loop execution.

* O(n^c): Time complexity of nested loops is equal to the number of times the innermost statement is executed. For example, if there is a for loop inside another for loop, then the innermost statement will be executed n^2 times, i.e. the time complexity is O(n^2).

* O(log n): Time Complexity of a loop is considered as O(log n) if the loop variable (i) is divided/multiplied by a constant amount (e.g. i=i/c, i=ixc) after every loop execution.

* O(log log n): Time Complexity of a loop is considered as O(log log n) if the loop variable (i) is reduced/increased exponentially by a constant amount (e.g. i=i^c) after every loop execution.

### When there are consecutive loops, we calculate time complexity as sum of the time complexities of individual loops as shown below.
```
for(int i = 1; i <=m; i += c) {  
	// some O(1) expressions
}
for(int i = 1; i <=n; i += c) {
    // some O(1) expressions
}
Time complexity of above code is O(m) + O(n) which is O(m+n)
If m == n, the time complexity becomes O(2n) which is O(n).
```

### Let's understand the meaning of some common time complexities with an example
Imagine a classroom of 100 students in which you gave your pen to one person. Now, you want that pen. Here are some ways to find the pen and what the O (Big O) order of these methods is.

* O(n^2): You go and ask the first person of the class, if he has the pen. Also, you ask this person about other 99 people in the classroom if they have that pen and so on. This is what we call O(n^2)

* O(n): Going and asking each student individually is O(n)

* O(log n): Now I divide the class into two groups, then ask: “Is it on the left side, or the right side of the classroom?” Then I take that group and divide it into two and ask again, and so on. Repeat the process till you are left with one student who has your pen. This is what you mean by O(log n)


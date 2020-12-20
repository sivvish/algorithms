# TimeComplexity

## Time Complexity can be represented by the notation `T(n)`, where n is the size of the input or the problem. It is the time (or the number of steps) it takes to complete a problem of size n

## Big O notation or `O(f(n))` is a mathematical notation that describes the limiting behaviour of a function when the argument tends towards a specific value or infinity. For e.g.
```
If T(n) = 6n^4 - 2n^3 + 5 and n approaches infinty
we say that T(n) is a Big O of n^4 or
T(n) = O(n^4), where ***=*** stands for ***is*** and ***not literal equality***
```

### Let's understand the meaning of some common time complexities
Imagine a classroom of 100 students in which you gave your pen to one person. Now, you want that pen. Here are some ways to find the pen and what the O (Big O) order of these methods is.

* O(n^2): You go and ask the first person of the class, if he has the pen. Also, you ask this person about other 99 people in the classroom if they have that pen and so on. This is what we call O(n^2)

* O(n): Going and asking each student individually is O(n)

* O(log n): Now I divide the class into two groups, then ask: “Is it on the left side, or the right side of the classroom?” Then I take that group and divide it into two and ask again, and so on. Repeat the process till you are left with one student who has your pen. This is what you mean by O(log n)

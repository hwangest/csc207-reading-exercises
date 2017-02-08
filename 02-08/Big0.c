/*

pg.54 Reading exercise

PM, to be honest, I have no clue how to do Big-O notation for this problem, but I'll just write something to show that I put in some effort.



Worst case:
Worst case, the array of numbers is increasing, so the program has to both compare each value to ret and rewrite a new value to ret.

n is the size of the array
i goes up to n
number of operations is 2 (?) (< and rewriting ret)

T(n) = 2n???


Best case:
Best case, the array of numbers is decreasing, so the program has to compare each value to ret, but does not have to rewrite a new value to ret.

n is the size of the array
i goes up to n
number of operations is 2, but program never goes to the rewriting part

T(n) = n????



Average case:
Average case, the array of numbers is increasing and decreasing, so the program compares each value to ret and rewrites a new value to ret half the number of times as the worst case.

n is the size of the array
i goes up to n
number of operations is 2

T(n) = n

*/

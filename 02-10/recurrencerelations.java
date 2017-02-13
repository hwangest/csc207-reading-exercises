/*

Exercise (recurrence relations)

T'(0) = 0 is the base case
T'(n) = 1 + T(n - 2)

Explicit formula is T'(n) = n / 2

Work for that: 
unfolding:
    1 + (1 + T(n-4)
rewriting with k:
    k + (T(n - 2k))
solving for k with base case: 
    n - 2k = 0
    k = n / 2
substituting k back in:
    T'(n) = n / 2 + T(0)
    T'(n) = n / 2

c = 1 / 2
x0 = 0

Thanks Maddie for helping me

 */

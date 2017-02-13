/*

02-13 Reading Exercise

1. Stack-and-heap diagram describing state of memory at Point A

Stack         Heap
-----         ----
c [] -------> Counter
-- Counter    value [0]
this []
c.increment-> value [1]
c [] -------> Counter
--Counter     value [0]


2. The value of c's value field at Point B is 2 because the new Counter starts at zero, increments to 1, goes back to 0 when the statement "c = new Counter();" is called, increments to 1, then increments to 2.

 */

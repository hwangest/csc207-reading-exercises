/*
02-27 Reading Exercise
Polymorphism

1. Line A will type check. Line B will not type check. This is because when programs compile, type check only considers the static type, not the dynamic type. That means only the methods in the interface, I, will be considered as possible methods. Thus, foo can be called, but bar cannot.

2. i.foo() yields a print statement of "C.foo". i.bar() will not compile.

This exercise teaches us that subtyping isn't completely accurate because code that uses interfaces will not check dynamic functions when compiling. This means that methods within classes that are not included in the overarching interface can be called during method lookup but will produce compiling errors when directly accessed. Thus, code like i.bar() will be safe but will not compile.

 */

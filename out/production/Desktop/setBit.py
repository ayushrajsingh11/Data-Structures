def f(n):
    c=0
    while n:
         c+=n&1
         n>>=1
       
    return c

print(f(26))
//count of sey bits

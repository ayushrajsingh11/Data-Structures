def g(n):
    
    if n==0:
        return
    else:
        int r=0
        c=n%10
        r=r+c
        return g(n/10)
        
        


print(g(5))            
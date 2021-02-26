
n="abc"
m=len(n)
count=3
for i in count:
    for j in m:
        if (i&(i<<j)):
            print(n[j])
    print("/n")


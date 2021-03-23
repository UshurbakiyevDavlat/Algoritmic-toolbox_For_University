    # Python3
m, n = [int(i) for i in input().split()]

if n<=1:
    print(n)  
    quit()


l_n = (n+2)%60
l_m = (m+1)%60


def fibSP(n):
    a,b = 0, 1
    for i in range(2,n+1):
        c = a+b
        c = c%10
        b, a = c, b
        print(c)
    return (c-1)
if l_n<=1:
    x = l_n-1
else:
    x = fibSP(l_n)
if l_m<=1:
    y = l_m-1
else:
    y = fibSP(l_m)
# print(a)
# print(b)
if x>=y:
    print(x-y)
else:
    print(10+x-y)

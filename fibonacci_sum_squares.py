n = int(input())
l_n = n%60
l_nplus = (n+1)%60

def fibSq(n):
    a, b = 0, 1
    for _ in range(2, n+1):
        c = a+b
        c = c% 10
        b, a = c, b
    return c

if l_n<=1:
    a = l_n
else:
    a = fibSq(l_n)
if l_nplus<=1:
    b = l_nplus
else:
    b = fibSq(l_nplus)

 
print((a*b)%10)

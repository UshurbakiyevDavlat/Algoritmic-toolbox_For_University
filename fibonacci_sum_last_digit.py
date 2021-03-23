n = int(input())

if n<=1:
    print(n)  
    quit()


l = (n+2)%60
if l==1:
    print(0)
    quit()
elif l==0:
    print(9)
    quit()
def fibS(n):
    a,b = 0, 1
    for _ in range(2,l+1):
        c = a+b
        c = c%10
        b, a = c, b
    if c!=0:
        print(c-1)
    else:
        print(9)
fibS(l)

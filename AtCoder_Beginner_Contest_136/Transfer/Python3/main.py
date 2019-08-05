N = list(map(int, input().split()))

A = N[0]
B = N[1]
C = N[2]

if (A - B) <= C:
    print(C - (A - B))
else:
    print(0)

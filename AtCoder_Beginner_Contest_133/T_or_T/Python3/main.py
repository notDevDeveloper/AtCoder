str = input().split()
N = int(str[0])
A = int(str[1])
B = int(str[2])

if N * A < B:
    print(N * A)
else:
    print(B)

N = int(input())
A = [int(x) for x in input().split()]
B = [int(x) for x in input().split()]
Total = 0

for i in range(N):
    if A[i] < B[i]:
        Total += A[i]
        B[i] -= A[i]
        if A[i + 1] < B[i]:
            Total += A[i + 1]
            A[i + 1] = 0
        else:
            Total += B[i]
            A[i + 1] -= B[i]
    else:
        Total += B[i]
        A[i] -= B[i]

print(Total)

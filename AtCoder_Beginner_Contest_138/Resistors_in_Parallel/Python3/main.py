N = int(input())
A = list(map(int, input().split()))
output = 0

for i in range(N):
    A[i] = 1 / A[i]
    output += A[i]

print(1 / output)

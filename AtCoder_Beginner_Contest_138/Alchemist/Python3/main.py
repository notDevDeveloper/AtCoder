N = int(input())
v = list(map(int, input().split()))
v.sort()
value = v[0]

for i in range(N - 1):
    value = (value + v[i + 1]) / 2

print(value)

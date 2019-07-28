N = int(input())
p = [int(x) for x in input().split()]
diff = 0

for i in range(N):
    if (i + 1) != p[i]:
        diff += 1
    if diff >= 3:
        break

if diff == 0 or diff == 2:
    print('YES')
else:
    print('NO')

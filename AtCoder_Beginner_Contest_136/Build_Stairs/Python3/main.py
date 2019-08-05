N = int(input())
H = list(map(int, input().split()))
isCheck = True
maxValue = 0

for i in range(N - 1):
    if H[i] >= H[i + 1]:
        H[i] -= 1

    if maxValue < H[i]:
        maxValue = H[i]

    if maxValue > H[i + 1]:
        isCheck = False
        break

if isCheck == True:
    print("Yes")
else:
    print("No")

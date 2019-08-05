N = int(input())
answer = 0

for i in range(N):
    if (i + 1 >= 10 and i + 1 <= 99) or (i + 1 >= 1000 and i + 1 <= 9999) or i + 1 == 100000:
        pass
    else:
        answer += 1

print(answer)

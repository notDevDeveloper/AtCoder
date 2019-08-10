K, X = (int(i) for i in input().split())

print(' '.join(map(str, list(range((X - K + 1), (X + K))))))

nums = [int(e) for e in input().split()]

if (nums[0] + nums[1]) % 2 == 0:
    print((nums[0] + nums[1]) // 2)
else:
    print('IMPOSSIBLE')

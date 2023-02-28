def bino_coef(n, k):
    if k == 0 or n == k:
        return 1
    return bino_coef(n-1, k) + bino_coef(n-1, k-1)

import sys
n= sys.stdin.readline()
a = int(n.split(' ')[0])
b = int(n.split(' ')[1])

print(bino_coef(a, b))
import sys

input = sys.stdin.readline

N, M = map(int, input().split(' '))
arr = [0] * N

for i in range(0, M):
    num1, num2, num3 = map(int, input().split(' '))

    for j in range(num1-1, num2):
        arr[j] = num3
    

print(' '.join(map(str, arr)))
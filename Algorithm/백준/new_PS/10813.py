import sys
sys.stdout.readline

N, M = map(int, input().split(' '))

arr = list(range(1, N+1))

print(arr)
for i in range(M):
    A, B = map(int, input().split(' '))
    A, B = A-1, B-1
    swap = arr[A]
    arr[A] = arr[B]
    arr[B] = swap

print(' '.join(map(str, arr)))
x, y = map(int, input().split())
arr = {}
arr2 = {}
for i in range(x):
    a = input()
    arr[i] = a
    arr2[a] = i

for i in range(y):
    a = input()
    if a.isdigit():
        print(arr[int(a)-1])
    else:
        print(arr2[a]+1)
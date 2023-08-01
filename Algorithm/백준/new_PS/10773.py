a = int(input())

arr = []

for i in range(a):
    sub = int(input())
    if sub == 0:
        arr.pop()
    else:
        arr.append(sub)
print(sum(arr))
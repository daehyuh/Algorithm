arr = [0,1,1]
a = int(input())
for i in range(a-2):
    arr.append(arr[-1]+arr[-2])
print(arr[-1])